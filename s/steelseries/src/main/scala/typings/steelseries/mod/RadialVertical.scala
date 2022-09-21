package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "RadialVertical")
@js.native
open class RadialVertical protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: RadialVerticalParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: RadialVerticalParams) = this()
  
  def getMaxValue(): this.type = js.native
  
  def getMinValue(): Double = js.native
  
  def getValue(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def resetMaxMeasuredValue(): this.type = js.native
  
  def resetMinMeasuredValue(): this.type = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setLedColor(newLedColor: LedColor): this.type = js.native
  
  def setLedVisible(visible: Boolean): this.type = js.native
  
  def setMaxMeasuredValue(newValue: Double): this.type = js.native
  
  def setMaxMeasuredValueVisible(visible: Boolean): this.type = js.native
  
  def setMaxValue(newValue: Double): this.type = js.native
  
  def setMinMeasuredValue(newValue: Double): this.type = js.native
  
  def setMinMeasuredValueVisible(visible: Boolean): this.type = js.native
  
  def setMinValue(newValue: Double): this.type = js.native
  
  def setPointerColor(newPointerColor: ColorDef): this.type = js.native
  
  def setPointerType(newPointerType: PointerType): this.type = js.native
  
  def setThresholdRising(rising: Boolean): this.type = js.native
  
  def setThresholdVisible(visible: Boolean): this.type = js.native
  
  def setValue(newValue: Double): this.type = js.native
  
  def setValueAnimated(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
}
