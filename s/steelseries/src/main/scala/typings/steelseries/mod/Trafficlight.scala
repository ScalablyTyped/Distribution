package typings.steelseries.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "Trafficlight")
@js.native
open class Trafficlight protected () extends StObject {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, parameters: TrafficlightParams) = this()
  def this(canvas: HTMLCanvasElement, parameters: TrafficlightParams) = this()
  
  def isGreenOn(): Boolean = js.native
  
  def isRedOn(): Boolean = js.native
  
  def isYellowOn(): Boolean = js.native
  
  def repaint(): Unit = js.native
  
  def setGreenOn(on: Boolean): this.type = js.native
  
  def setRedOn(on: Boolean): this.type = js.native
  
  def setYellowOn(on: Boolean): this.type = js.native
}
