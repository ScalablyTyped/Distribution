package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var fallback: js.UndefOr[scala.Boolean] = js.undefined
  var iosNative: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fallback: js.UndefOr[scala.Boolean] = js.undefined,
    iosNative: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    if (!js.isUndefined(iosNative)) __obj.updateDynamic("iosNative")(iosNative)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

