package typings
package reactDashImageDashCropLib.reactDashImageDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCrop
  extends reactLib.reactMod.Component[ReactCropProps, js.Object, js.Any] {
  def createCropSelection(): reactLib.reactMod.ReactNode = js.native
  def crossOverCheck(): scala.Unit = js.native
  def dragCrop(): Crop = js.native
  def getCropStyle(): reactLib.reactMod.CSSProperties = js.native
  def getNewSize(): reactDashImageDashCropLib.Anon_Height = js.native
  def makeNewCrop(): Crop = js.native
  def onComponentKeyDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onComponentMouseTouchDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onCropMouseTouchDown(e: stdLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchEnd(e: stdLib.MouseEvent): scala.Unit = js.native
  def onDocMouseTouchMove(e: stdLib.MouseEvent): scala.Unit = js.native
  def onImageLoad(image: stdLib.HTMLImageElement): scala.Unit = js.native
  def resizeCrop(): Crop = js.native
  def straightenYPath(clientX: scala.Double): scala.Double = js.native
}

