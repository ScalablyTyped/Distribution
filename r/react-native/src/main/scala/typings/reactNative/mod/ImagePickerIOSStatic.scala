package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePickerIOSStatic extends js.Object {
  
  def canRecordVideos(callback: js.Function1[/* value */ Boolean, Unit]): Unit = js.native
  
  def canUseCamera(callback: js.Function1[/* value */ Boolean, Unit]): Unit = js.native
  
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit = js.native
  
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit = js.native
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
  
  @scala.inline
  implicit class ImagePickerIOSStaticOps[Self <: ImagePickerIOSStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanRecordVideos(value: js.Function1[/* value */ Boolean, Unit] => Unit): Self = this.set("canRecordVideos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanUseCamera(value: js.Function1[/* value */ Boolean, Unit] => Unit): Self = this.set("canUseCamera", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenCameraDialog(
      value: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[_], Unit]) => Unit
    ): Self = this.set("openCameraDialog", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpenSelectDialog(
      value: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[_], Unit]) => Unit
    ): Self = this.set("openSelectDialog", js.Any.fromFunction3(value))
  }
}
