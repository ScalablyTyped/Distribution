package typings.reactPlyr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var iosNative: js.UndefOr[Boolean] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fallback: js.UndefOr[Boolean] = js.undefined,
    iosNative: js.UndefOr[Boolean] = js.undefined
  ): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iosNative)) __obj.updateDynamic("iosNative")(iosNative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

