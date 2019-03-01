package typings
package queryDashStringLib.queryDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var arrayFormat: js.UndefOr[
    queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none
  ] = js.undefined
  var decode: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    arrayFormat: queryDashStringLib.queryDashStringLibStrings.bracket | queryDashStringLib.queryDashStringLibStrings.index | queryDashStringLib.queryDashStringLibStrings.none = null,
    decode: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (arrayFormat != null) __obj.updateDynamic("arrayFormat")(arrayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode)
    __obj.asInstanceOf[ParseOptions]
  }
}

