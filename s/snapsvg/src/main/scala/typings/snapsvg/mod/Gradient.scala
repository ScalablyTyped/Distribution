package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gradient extends Element {
  
  def addStop(color: String, offset: Double): Gradient = js.native
  
  def setStops(str: String): Gradient = js.native
  
  def stops(): js.Array[Element] = js.native
}
