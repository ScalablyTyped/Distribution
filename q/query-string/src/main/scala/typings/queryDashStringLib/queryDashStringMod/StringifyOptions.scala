package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  var encode: js.UndefOr[scala.Boolean] = js.undefined
  var sort: js.UndefOr[
    (js.Function2[/* m */ java.lang.String, /* n */ java.lang.String, scala.Boolean]) | scala.Boolean
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none = null,
    encode: js.UndefOr[scala.Boolean] = js.undefined,
    sort: (js.Function2[/* m */ java.lang.String, /* n */ java.lang.String, scala.Boolean]) | scala.Boolean = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(encode)) __obj.updateDynamic("encode")(encode)
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[StringifyOptions]
  }
}

