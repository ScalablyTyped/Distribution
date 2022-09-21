package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Compass")
@js.native
open class Compass protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: CompassParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: CompassParams) = this()
  
  def getValue(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setPointSymbols(newPointSymbols: js.Array[String]): this.type = js.native
  
  def setPointerColor(newPointerColor: ColorDef): this.type = js.native
  
  def setPointerType(newPointerType: PointerType): this.type = js.native
  
  def setValue(newValue: Double): this.type = js.native
  
  def setValueAnimated(newValue: Double): this.type = js.native
  def setValueAnimated(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
}
