package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fallback: js.UndefOr[Boolean] = js.undefined
  var iosNative: js.UndefOr[Boolean] = js.undefined
}

object AnonEnabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fallback: js.UndefOr[Boolean] = js.undefined,
    iosNative: js.UndefOr[Boolean] = js.undefined
  ): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(iosNative)) __obj.updateDynamic("iosNative")(iosNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

