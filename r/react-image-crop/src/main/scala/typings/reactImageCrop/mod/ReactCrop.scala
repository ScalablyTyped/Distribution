package typings.reactImageCrop.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactImageCrop.anon.Height
import typings.std.HTMLImageElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCrop
  extends Component[ReactCropProps, js.Object, js.Any] {
  
  def createCropSelection(): ReactNode = js.native
  
  def crossOverCheck(): Unit = js.native
  
  def dragCrop(): Crop = js.native
  
  def getCropStyle(): CSSProperties = js.native
  
  def getNewSize(): Height = js.native
  
  def makeNewCrop(): Crop = js.native
  
  def onComponentKeyDown(e: MouseEvent): Unit = js.native
  
  def onComponentMouseTouchDown(e: MouseEvent): Unit = js.native
  
  def onCropMouseTouchDown(e: MouseEvent): Unit = js.native
  
  def onDocMouseTouchEnd(e: MouseEvent): Unit = js.native
  
  def onDocMouseTouchMove(e: MouseEvent): Unit = js.native
  
  def onImageLoad(image: HTMLImageElement): Unit = js.native
  
  def resizeCrop(): Crop = js.native
  
  def resolveCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = js.native
  
  def straightenYPath(clientX: Double): Double = js.native
}
