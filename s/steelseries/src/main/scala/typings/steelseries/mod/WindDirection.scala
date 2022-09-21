package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "WindDirection")
@js.native
open class WindDirection protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: WindDirectionParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: WindDirectionParams) = this()
  
  def getValueAverage(): Double = js.native
  
  def getValueLatest(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setArea(areaVal: js.Array[Section]): this.type = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setLcdColor(newLcdColor: LcdColor): this.type = js.native
  
  def setLcdTitleStrings(titles: js.Array[String]): this.type = js.native
  
  def setPointSymbols(newPointSymbols: js.Array[String]): this.type = js.native
  
  def setPointerColor(newPointerColor: ColorDef): this.type = js.native
  
  def setPointerColorAverage(newPointerColor: ColorDef): this.type = js.native
  
  def setPointerType(newPointerType: PointerType): this.type = js.native
  
  def setPointerTypeAverage(newPointerType: PointerType): this.type = js.native
  
  def setSection(areaSec: js.Array[Section]): this.type = js.native
  
  def setValueAnimatedAverage(newValue: Double): this.type = js.native
  def setValueAnimatedAverage(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
  
  def setValueAnimatedLatest(newValue: Double): this.type = js.native
  def setValueAnimatedLatest(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
  
  def setValueAverage(newValue: Double): this.type = js.native
  
  def setValueLatest(newValue: Double): this.type = js.native
}
