package typings.simmerjs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * How to handle errors which occur during the analysis
    *
    * Valid Options
    *  - `false`: errors are ignored by Simmer
    *  - `true`: errors rethrown and expected to be caught by the user
    *  - _a function callback will be called with two parameters_: the
    *    exception and the element being analyzed
    */
  var errorHandling: js.UndefOr[Boolean | (js.Function2[/* error */ js.Any, /* element */ Element, Unit])] = js.native
  
  /**
    * A maximum length for the CSS selector can be specified - if no specific
    * selector can be found which is shorter than this length then it is
    * treated as if no selector could be found.
    *
    * @default 520
    */
  var selectorMaxLength: js.UndefOr[Double] = js.native
  
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
  var specificityThreshold: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setErrorHandlingFunction2(value: (/* error */ js.Any, /* element */ Element) => Unit): Self = this.set("errorHandling", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHandling(value: Boolean | (js.Function2[/* error */ js.Any, /* element */ Element, Unit])): Self = this.set("errorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorHandling: Self = this.set("errorHandling", js.undefined)
    
    @scala.inline
    def setSelectorMaxLength(value: Double): Self = this.set("selectorMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorMaxLength: Self = this.set("selectorMaxLength", js.undefined)
    
    @scala.inline
    def setSpecificityThreshold(value: Double): Self = this.set("specificityThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificityThreshold: Self = this.set("specificityThreshold", js.undefined)
  }
}
