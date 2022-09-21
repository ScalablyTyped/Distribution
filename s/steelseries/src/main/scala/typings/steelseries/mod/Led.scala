package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Led")
@js.native
open class Led protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: LedParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: LedParams) = this()
  
  def blink(blink: Boolean): this.type = js.native
  
  def setLedColor(newColor: LedColor): this.type = js.native
  
  def setLedOnOff(on: Boolean): this.type = js.native
  
  def toggleLed(): this.type = js.native
}
