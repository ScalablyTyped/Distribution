package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Odometer")
@js.native
open class Odometer protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: OdometerParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: OdometerParams) = this()
  
  def getValue(): Double = js.native
  
  def repaint(): Unit = js.native
  
  def setValue(newValue: Double): this.type = js.native
  
  def setValueAnimated(newValue: Double): this.type = js.native
  def setValueAnimated(newValue: Double, callback: js.Function0[Unit]): this.type = js.native
}
