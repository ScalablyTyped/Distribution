package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "DisplayMulti")
@js.native
open class DisplayMulti protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: DisplayMultiParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: DisplayMultiParams) = this()
  
  def repaint(): Unit = js.native
  
  def setAltValue(altValueNew: String): this.type = js.native
  def setAltValue(altValueNew: Double): this.type = js.native
  
  def setLcdColor(newLcdColor: LcdColor): this.type = js.native
  
  def setValue(newValue: String): this.type = js.native
  def setValue(newValue: Double): this.type = js.native
}
