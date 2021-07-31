package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePickerIOSStatic extends StObject {
  
  def canRecordVideos(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  
  def canUseCamera(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[js.Any], Unit]
  ): Unit
  
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[js.Any], Unit]
  ): Unit
}
object ImagePickerIOSStatic {
  
  @scala.inline
  def apply(
    canRecordVideos: js.Function1[/* value */ Boolean, Unit] => Unit,
    canUseCamera: js.Function1[/* value */ Boolean, Unit] => Unit,
    openCameraDialog: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Unit,
    openSelectDialog: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Unit
  ): ImagePickerIOSStatic = {
    val __obj = js.Dynamic.literal(canRecordVideos = js.Any.fromFunction1(canRecordVideos), canUseCamera = js.Any.fromFunction1(canUseCamera), openCameraDialog = js.Any.fromFunction3(openCameraDialog), openSelectDialog = js.Any.fromFunction3(openSelectDialog))
    __obj.asInstanceOf[ImagePickerIOSStatic]
  }
  
  @scala.inline
  implicit class ImagePickerIOSStaticMutableBuilder[Self <: ImagePickerIOSStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRecordVideos(value: js.Function1[/* value */ Boolean, Unit] => Unit): Self = StObject.set(x, "canRecordVideos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanUseCamera(value: js.Function1[/* value */ Boolean, Unit] => Unit): Self = StObject.set(x, "canUseCamera", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenCameraDialog(
      value: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "openCameraDialog", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOpenSelectDialog(
      value: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Unit
    ): Self = StObject.set(x, "openSelectDialog", js.Any.fromFunction3(value))
  }
}
