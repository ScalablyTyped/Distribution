package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenCameraDialogOptions extends js.Object {
  /** Defaults to false */
  var videoMode: js.UndefOr[Boolean] = js.undefined
}

object OpenCameraDialogOptions {
  @scala.inline
  def apply(videoMode: js.UndefOr[Boolean] = js.undefined): OpenCameraDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(videoMode)) __obj.updateDynamic("videoMode")(videoMode)
    __obj.asInstanceOf[OpenCameraDialogOptions]
  }
}

