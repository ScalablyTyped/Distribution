package typings
package stringifyDashObjectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[
    js.Function2[/* o */ js.Any, /* prop */ java.lang.String | js.Symbol, scala.Boolean]
  ] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var inlineCharacterLimit: js.UndefOr[scala.Double] = js.undefined
  var singleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ scala.Double | java.lang.String | js.Symbol, 
      /* value */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: js.Function2[/* o */ js.Any, /* prop */ java.lang.String | js.Symbol, scala.Boolean] = null,
    indent: java.lang.String = null,
    inlineCharacterLimit: scala.Int | scala.Double = null,
    singleQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.Function3[
      /* val */ js.Array[_] | js.Object, 
      /* i */ scala.Double | java.lang.String | js.Symbol, 
      /* value */ java.lang.String, 
      java.lang.String
    ] = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (inlineCharacterLimit != null) __obj.updateDynamic("inlineCharacterLimit")(inlineCharacterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(singleQuotes)) __obj.updateDynamic("singleQuotes")(singleQuotes)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Filter]
  }
}

