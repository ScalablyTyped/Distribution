package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerIOSStatic extends js.Object {
  def canRecordVideos(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  def canUseCamera(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit
}

object ImagePickerIOSStatic {
  @scala.inline
  def apply(
    canRecordVideos: js.Function1[/* value */ Boolean, Unit] => Unit,
    canUseCamera: js.Function1[/* value */ Boolean, Unit] => Unit,
    openCameraDialog: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[_], Unit]) => Unit,
    openSelectDialog: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[_], Unit]) => Unit
  ): ImagePickerIOSStatic = {
    val __obj = js.Dynamic.literal(canRecordVideos = js.Any.fromFunction1(canRecordVideos), canUseCamera = js.Any.fromFunction1(canUseCamera), openCameraDialog = js.Any.fromFunction3(openCameraDialog), openSelectDialog = js.Any.fromFunction3(openSelectDialog))
    __obj.asInstanceOf[ImagePickerIOSStatic]
  }
}

