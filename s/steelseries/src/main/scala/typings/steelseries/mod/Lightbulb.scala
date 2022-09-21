package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Lightbulb")
@js.native
open class Lightbulb protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: LightbulbParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: LightbulbParams) = this()
  
  def getAlpha(): Double = js.native
  
  def getGlowColor(): String = js.native
  
  def isOn(): Boolean = js.native
  
  def repaint(): Unit = js.native
  
  def setAlpha(a: Double): this.type = js.native
  
  def setGlowColor(color: String): this.type = js.native
  
  def setOn(on: Boolean): this.type = js.native
}
