package typings.reactCropper.mod

import typings.cropperjs.Cropper
import typings.cropperjs.Cropper.CanvasData
import typings.cropperjs.Cropper.ContainerData
import typings.cropperjs.Cropper.CropBoxData
import typings.cropperjs.Cropper.Data
import typings.cropperjs.Cropper.DragMode
import typings.cropperjs.Cropper.GetCroppedCanvasOptions
import typings.cropperjs.Cropper.ImageData
import typings.cropperjs.Cropper.SetCanvasDataOptions
import typings.cropperjs.Cropper.SetCropBoxDataOptions
import typings.cropperjs.Cropper.SetDataOptions
import typings.cropperjs.anon.X
import typings.react.mod.Component
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cropperjs.mod.default because Inheritance from two classes. Inlined  */ @js.native
trait ReactCropper
  extends Component[ReactCropperProps, js.Object, js.Any]
     with Cropper {
  /* InferMemberOverrides */
  override def clear(): Cropper = js.native
  /* InferMemberOverrides */
  override def crop(): Cropper = js.native
  /* InferMemberOverrides */
  override def destroy(): Cropper = js.native
  /* InferMemberOverrides */
  override def disable(): Cropper = js.native
  /* InferMemberOverrides */
  override def enable(): Cropper = js.native
  /* InferMemberOverrides */
  override def getCanvasData(): CanvasData = js.native
  /* InferMemberOverrides */
  override def getContainerData(): ContainerData = js.native
  /* InferMemberOverrides */
  override def getCropBoxData(): CropBoxData = js.native
  /* InferMemberOverrides */
  override def getCroppedCanvas(): HTMLCanvasElement = js.native
  /* InferMemberOverrides */
  override def getCroppedCanvas(options: GetCroppedCanvasOptions): HTMLCanvasElement = js.native
  /* InferMemberOverrides */
  override def getData(): Data = js.native
  /* InferMemberOverrides */
  override def getData(rounded: Boolean): Data = js.native
  /* InferMemberOverrides */
  override def getImageData(): ImageData = js.native
  /* InferMemberOverrides */
  override def move(offsetX: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def move(offsetX: Double, offsetY: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def moveTo(x: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def moveTo(x: Double, y: Double): Cropper = js.native
  def on(eventname: String, callback: js.Function0[Unit]): Unit = js.native
  /* InferMemberOverrides */
  override def replace(url: String): Cropper = js.native
  /* InferMemberOverrides */
  override def replace(url: String, onlyColorChanged: Boolean): Cropper = js.native
  /* InferMemberOverrides */
  override def reset(): Cropper = js.native
  /* InferMemberOverrides */
  override def rotate(degree: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def rotateTo(degree: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def scale(scaleX: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def scale(scaleX: Double, scaleY: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def scaleX(scaleX: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def scaleY(scaleY: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def setAspectRatio(aspectRatio: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def setCanvasData(data: SetCanvasDataOptions): Cropper = js.native
  /* InferMemberOverrides */
  override def setCropBoxData(data: SetCropBoxDataOptions): Cropper = js.native
  /* InferMemberOverrides */
  override def setData(data: SetDataOptions): Cropper = js.native
  /* InferMemberOverrides */
  override def setDragMode(dragMode: DragMode): Cropper = js.native
  /* InferMemberOverrides */
  override def zoom(ratio: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def zoomTo(ratio: Double): Cropper = js.native
  /* InferMemberOverrides */
  override def zoomTo(ratio: Double, pivot: X): Cropper = js.native
}

