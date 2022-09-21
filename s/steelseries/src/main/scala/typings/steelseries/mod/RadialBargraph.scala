package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "RadialBargraph")
@js.native
open class RadialBargraph protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: RadialBargraphParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: RadialBargraphParams) = this()
  
  def blinkUserLed(blink: Boolean): this.type = js.native
  
  def getMaxValue(): Double = js.native
  
  def getMinValue(): Double = js.native
  
  def getValue(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFractionalScaleDecimals(decimals: Double): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setGradient(): this.type = js.native
  def setGradient(grad: gradientWrapper): this.type = js.native
  
  def setGradientActive(value: Boolean): this.type = js.native
  
  def setLabelNumberFormat(fomat: LabelNumberFormat): this.type = js.native
  
  def setLcdColor(newLcdColor: LcdColor): this.type = js.native
  
  def setLcdDecimals(decimals: Double): this.type = js.native
  
  def setLedColor(newLedColor: LedColor): this.type = js.native
  
  def setLedVisible(visible: Boolean): this.type = js.native
  
  def setMaxValue(newValue: Double): this.type = js.native
  
  def setMinValue(newValue: Double): this.type = js.native
  
  def setSection(areaSec: js.Array[Section]): this.type = js.native
  
  def setSectionActive(value: Boolean): this.type = js.native
  
  def setThreshold(newValue: Double): this.type = js.native
  
  def setThresholdRising(rising: Boolean): this.type = js.native
  
  def setTitleString(title: String): this.type = js.native
  
  def setTrend(newValue: TrendState): this.type = js.native
  
  def setTrendVisible(visible: Boolean): this.type = js.native
  
  def setUnitString(unit: String): this.type = js.native
  
  def setUserLedColor(newLedColor: LedColor): this.type = js.native
  
  def setUserLedOnOff(on: Boolean): this.type = js.native
  
  def setUserLedVisible(visible: Boolean): this.type = js.native
  
  def setValue(newValue: Double): this.type = js.native
  
  def setValueAnimated(newValue: Double): this.type = js.native
  def setValueAnimated(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
  
  def setValueColor(newValueColor: ColorDef): this.type = js.native
  
  def toggleUserLed(): this.type = js.native
}
