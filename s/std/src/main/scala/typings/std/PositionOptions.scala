package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PositionOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    maximumAge: Int | Double = null,
    timeout: Int | Double = null
  ): PositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
}

