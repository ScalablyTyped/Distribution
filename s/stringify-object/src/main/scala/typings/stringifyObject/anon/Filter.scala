package typings.stringifyObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * Expected to return a boolean of whether to include the property property of the object object in the output.
    */
  var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.undefined
  /**
    * Preferred indentation
    * @default '\t'
    */
  var indent: js.UndefOr[String] = js.undefined
  /**
    * When set, will inline values up to inlineCharacterLimit length for the sake of more terse output.
    */
  var inlineCharacterLimit: js.UndefOr[Double] = js.undefined
  /**
    * Set to false to get double-quoted strings
    * @default true
    */
  var singleQuotes: js.UndefOr[Boolean] = js.undefined
  /**
    * Expected to return a string that transforms the string that resulted from stringifying object[property].
    * This can be used to detect special types of objects that need to be stringified in a particular way.
    * The transform function might return an alternate string in this case, otherwise returning the originalResult.
    */
  var transform: js.UndefOr[
    js.Function3[
      /* input */ js.Array[_] | js.Object, 
      /* prop */ Double | String | js.Symbol, 
      /* originalResult */ String, 
      String
    ]
  ] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    filter: (/* input */ js.Any, /* prop */ String | js.Symbol) => Boolean = null,
    indent: String = null,
    inlineCharacterLimit: js.UndefOr[Double] = js.undefined,
    singleQuotes: js.UndefOr[Boolean] = js.undefined,
    transform: (/* input */ js.Array[_] | js.Object, /* prop */ Double | String | js.Symbol, /* originalResult */ String) => String = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineCharacterLimit)) __obj.updateDynamic("inlineCharacterLimit")(inlineCharacterLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleQuotes)) __obj.updateDynamic("singleQuotes")(singleQuotes.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[Filter]
  }
}

