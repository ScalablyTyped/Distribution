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
  def onComponentKeyDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onComponentMouseTouchDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onCropMouseTouchDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchEnd(e: stdLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def onImageLoad(image: stdLib.HTMLImageElement): scala.Unit = js.native
  def resizeCrop(): reactDashImageDashCropLib.reactDashImageDashCropMod.ReactCropNs.Crop = js.native
  def straightenYPath(clientX: scala.Double): scala.Double = js.native
}

