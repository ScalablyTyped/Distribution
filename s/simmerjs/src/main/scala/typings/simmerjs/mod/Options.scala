package typings.simmerjs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * How deep into the DOM hierarchy should Simmer go in order to reach a
    * unique selector. This is a delicate game because the higher the number
    * the more likely you are to reach a unique selector, but it also means a
    * longer and more breakable one. Assuming you want to store this selector
    * to use later, making it longer also means it is more likely to change and
    * loose it's validity.
    *
    * @default 3
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * How to handle errors which occur during the analysis
    *
    * Valid Options
    *  - `false`: errors are ignored by Simmer
    *  - `true`: errors rethrown and expected to be caught by the user
    *  - _a function callback will be called with two parameters_: the
    *    exception and the element being analyzed
    */
  var errorHandling: js.UndefOr[Boolean | (js.Function2[/* error */ js.Any, /* element */ Element, Unit])] = js.undefined
  /**
    * A maximum length for the CSS selector can be specified - if no specific
    * selector can be found which is shorter than this length then it is
    * treated as if no selector could be found.
    *
    * @default 520
    */
  var selectorMaxLength: js.UndefOr[Double] = js.undefined
  /**
    * A minimum specificty level. Once the parser reaches this level it starts
    * verifying the selector after every method is called. This can cut down
    * our execution time by avoiding needless parsing but can also hurt
    * execution times by performing many verifications. Specificity is
    * calculated based on the W3C spec:
    * http://www.w3.org/TR/css3-selectors/#specificity
    *
    * @default 100
    */
  var specificityThreshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    depth: js.UndefOr[Double] = js.undefined,
    errorHandling: Boolean | (js.Function2[/* error */ js.Any, /* element */ Element, Unit]) = null,
    selectorMaxLength: js.UndefOr[Double] = js.undefined,
    specificityThreshold: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (errorHandling != null) __obj.updateDynamic("errorHandling")(errorHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(selectorMaxLength)) __obj.updateDynamic("selectorMaxLength")(selectorMaxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(specificityThreshold)) __obj.updateDynamic("specificityThreshold")(specificityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

