package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstrainVideoFacingModeParameters extends js.Object {
  var exact: js.UndefOr[VideoFacingModeEnum | Array[VideoFacingModeEnum]] = js.undefined
  var ideal: js.UndefOr[VideoFacingModeEnum | Array[VideoFacingModeEnum]] = js.undefined
}

object ConstrainVideoFacingModeParameters {
  @scala.inline
  def apply(
    exact: VideoFacingModeEnum | Array[VideoFacingModeEnum] = null,
    ideal: VideoFacingModeEnum | Array[VideoFacingModeEnum] = null
  ): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
}

