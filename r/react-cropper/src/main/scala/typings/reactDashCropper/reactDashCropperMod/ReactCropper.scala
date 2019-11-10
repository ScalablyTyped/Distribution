package typings.reactDashCropper.reactDashCropperMod

import typings.cropperjs.Anon_X
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
import typings.react.reactMod.Component
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line no-empty-interface
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cropperjs.Cropper because Inheritance from two classes. Inlined clear, crop, destroy, disable, enable, getCanvasData, getContainerData, getCropBoxData, getCroppedCanvas, getCroppedCanvas, getData, getData, getImageData, move, move, moveTo, moveTo, replace, replace, reset, rotate, rotateTo, scale, scale, scaleX, scaleY, setAspectRatio, setCanvasData, setCropBoxData, setData, setDragMode, zoom, zoomTo, zoomTo
- typings.cropperjs.cropperjsMod.default because Inheritance from two classes. Inlined  */ @js.native
trait ReactCropper
  extends Component[ReactCropperProps, js.Object, js.Any] {
  def clear(): Cropper = js.native
  def crop(): Cropper = js.native
  def destroy(): Cropper = js.native
  def disable(): Cropper = js.native
  def enable(): Cropper = js.native
  def getCanvasData(): CanvasData = js.native
  def getContainerData(): ContainerData = js.native
  def getCropBoxData(): CropBoxData = js.native
  def getCroppedCanvas(): HTMLCanvasElement = js.native
  def getCroppedCanvas(options: GetCroppedCanvasOptions): HTMLCanvasElement = js.native
  def getData(): Data = js.native
  def getData(rounded: Boolean): Data = js.native
  def getImageData(): ImageData = js.native
  def move(offsetX: Double): Cropper = js.native
  def move(offsetX: Double, offsetY: Double): Cropper = js.native
  def moveTo(x: Double): Cropper = js.native
  def moveTo(x: Double, y: Double): Cropper = js.native
  def on(eventname: String, callback: js.Function0[Unit]): Unit = js.native
  def replace(url: String): Cropper = js.native
  def replace(url: String, onlyColorChanged: Boolean): Cropper = js.native
  def reset(): Cropper = js.native
  def rotate(degree: Double): Cropper = js.native
  def rotateTo(degree: Double): Cropper = js.native
  def scale(scaleX: Double): Cropper = js.native
  def scale(scaleX: Double, scaleY: Double): Cropper = js.native
  def scaleX(scaleX: Double): Cropper = js.native
  def scaleY(scaleY: Double): Cropper = js.native
  def setAspectRatio(aspectRatio: Double): Cropper = js.native
  def setCanvasData(data: SetCanvasDataOptions): Cropper = js.native
  def setCropBoxData(data: SetCropBoxDataOptions): Cropper = js.native
  def setData(data: SetDataOptions): Cropper = js.native
  def setDragMode(dragMode: DragMode): Cropper = js.native
  def zoom(ratio: Double): Cropper = js.native
  def zoomTo(ratio: Double): Cropper = js.native
  def zoomTo(ratio: Double, pivot: Anon_X): Cropper = js.native
}

