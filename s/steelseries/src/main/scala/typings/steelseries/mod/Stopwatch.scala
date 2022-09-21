package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Stopwatch")
@js.native
open class Stopwatch protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: StopwatchParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: StopwatchParams) = this()
  
  def getMeasuredTime(): String = js.native
  
  def isRunning(): Boolean = js.native
  
  def lap(): this.type = js.native
  
  def repaint(): Unit = js.native
  
  def reset(): this.type = js.native
  
  def setBackgroundColor(newBackgroundColor: BackgroundColor): this.type = js.native
  
  def setForegroundType(newForegroundType: ForegroundType): this.type = js.native
  
  def setFrameDesign(newFrameDesign: FrameDesign): this.type = js.native
  
  def setPointerColor(newPointerColor: ColorDef): this.type = js.native
  
  def start(): this.type = js.native
  
  def stop(): this.type = js.native
}
