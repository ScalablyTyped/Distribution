package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCrop
  extends reactLib.reactMod.Component[
      reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs.ReactCropProps, 
      js.Object, 
      js.Any
    ] {
  def createCropSelection(): reactLib.reactMod.ReactNs.ReactNode = js.native
  def crossOverCheck(): scala.Unit = js.native
  def dragCrop(): reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs.Crop = js.native
  def getCropStyle(): reactLib.reactMod.ReactNs.CSSProperties = js.native
  def getNewSize(): reactDashImageDashCropLib.Anon_Height = js.native
  def makeNewCrop(): reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs.Crop = js.native
  def onComponentKeyDown(e: reactLib.MouseEvent): scala.Unit = js.native
  def onComponentMouseTouchDown(e: reactLib.MouseEvent): scala.Unit = js.native
  def onCropMouseTouchDown(e: reactLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchEnd(e: reactLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchMove(e: reactLib.MouseEvent): scala.Unit = js.native
  def onImageLoad(image: reactLib.HTMLImageElement): scala.Unit = js.native
  def resizeCrop(): reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs.Crop = js.native
  def straightenYPath(clientX: scala.Double): scala.Double = js.native
}

