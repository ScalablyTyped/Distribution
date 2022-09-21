package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "DisplaySingle")
@js.native
open class DisplaySingle protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: DisplaySingleParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: DisplaySingleParams) = this()
  
  def repaint(): Unit = js.native
  
  def setLcdColor(newLcdColor: LcdColor): this.type = js.native
  
  def setScrolling(scroll: Boolean): this.type = js.native
  
  def setSection(newSection: js.Array[Section]): this.type = js.native
  
  def setValue(newValue: String): this.type = js.native
  def setValue(newValue: Double): this.type = js.native
}
