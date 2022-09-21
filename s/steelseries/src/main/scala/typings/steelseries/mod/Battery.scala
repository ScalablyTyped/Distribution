package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Battery")
@js.native
open class Battery protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: BatteryParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: BatteryParams) = this()
  
  def getValue(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setValue(newValue: Double): this.type = js.native
}
