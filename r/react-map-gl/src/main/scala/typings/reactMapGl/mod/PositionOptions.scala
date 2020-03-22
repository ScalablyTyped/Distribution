package typings.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.mozilla.org/en-US/docs/Web/API/PositionOptions
trait PositionOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maximumAge: Double
  var timeout: Double
}

object PositionOptions {
  @scala.inline
  def apply(maximumAge: Double, timeout: Double, enableHighAccuracy: js.UndefOr[Boolean] = js.undefined): PositionOptions = {
    val __obj = js.Dynamic.literal(maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
}

