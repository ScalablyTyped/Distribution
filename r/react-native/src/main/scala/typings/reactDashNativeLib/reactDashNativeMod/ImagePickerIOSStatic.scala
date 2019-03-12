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

object ImagePickerIOSStatic {
  @scala.inline
  def apply(
    canRecordVideos: js.Function1[/* value */ scala.Boolean, scala.Unit] => scala.Unit,
    canUseCamera: js.Function1[/* value */ scala.Boolean, scala.Unit] => scala.Unit,
    openCameraDialog: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, scala.Unit], js.Function1[/* args */ js.Array[_], scala.Unit]) => scala.Unit,
    openSelectDialog: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, scala.Unit], js.Function1[/* args */ js.Array[_], scala.Unit]) => scala.Unit
  ): ImagePickerIOSStatic = {
    val __obj = js.Dynamic.literal(canRecordVideos = js.Any.fromFunction1(canRecordVideos), canUseCamera = js.Any.fromFunction1(canUseCamera), openCameraDialog = js.Any.fromFunction3(openCameraDialog), openSelectDialog = js.Any.fromFunction3(openSelectDialog))
  
    __obj.asInstanceOf[ImagePickerIOSStatic]
  }
}

