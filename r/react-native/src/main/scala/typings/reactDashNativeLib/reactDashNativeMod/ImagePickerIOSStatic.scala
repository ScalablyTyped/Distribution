package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerIOSStatic extends js.Object {
  def canRecordVideos(callback: js.Function1[/* value */ scala.Boolean, scala.Unit]): scala.Unit
  def canUseCamera(callback: js.Function1[/* value */ scala.Boolean, scala.Unit]): scala.Unit
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, scala.Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], scala.Unit]
  ): scala.Unit
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, scala.Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], scala.Unit]
  ): scala.Unit
}

