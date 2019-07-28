package typings.stringifyDashObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[js.Function2[/* o */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var inlineCharacterLimit: js.UndefOr[Double] = js.undefined
  var singleQuotes: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ Double | String | js.Symbol, 
      /* value */ String, 
      String
    ]
  ] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: (/* o */ js.Any, /* prop */ String | js.Symbol) => Boolean = null,
    indent: String = null,
    inlineCharacterLimit: Int | Double = null,
    singleQuotes: js.UndefOr[Boolean] = js.undefined,
    transform: (/* val */ js.Array[_] | js.Object, /* i */ Double | String | js.Symbol, /* value */ String) => String = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (inlineCharacterLimit != null) __obj.updateDynamic("inlineCharacterLimit")(inlineCharacterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(singleQuotes)) __obj.updateDynamic("singleQuotes")(singleQuotes)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3(transform))
    __obj.asInstanceOf[Anon_Filter]
  }
}

