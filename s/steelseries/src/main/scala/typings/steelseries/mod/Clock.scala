package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Clock")
@js.native
open class Clock protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: ClockParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: ClockParams) = this()
  
  def getAutomatic(): Boolean = js.native
  
  def getHour(): Double = js.native
  
  def getMinute(): Double = js.native
  
  def getSecond(): Double = js.native
  
  def getSecondMovesContinuous(): Boolean = js.native
  
  def getSecondPointerVisible(): Boolean = js.native
  
  def getTimeZoneOffsetHour(): Double = js.native
  
  def getTimeZoneOffsetMinute(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setAutomatic(newValue: Boolean): this.type = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setHour(newValue: Double): this.type = js.native
  
  def setMinute(newValue: Double): this.type = js.native
  
  def setPointerColor(newPointerColor: ColorDef): this.type = js.native
  
  def setPointerType(newPointerType: PointerType): this.type = js.native
  
  def setSecond(newValue: Double): this.type = js.native
  
  def setSecondMovesContinuous(newValue: Boolean): this.type = js.native
  
  def setSecondPointerVisible(neweValue: Boolean): this.type = js.native
  
  def setTimeZoneOffsetHour(newValue: Double): this.type = js.native
  
  def setTimeZoneOffsetMinute(newValue: Double): this.type = js.native
}
