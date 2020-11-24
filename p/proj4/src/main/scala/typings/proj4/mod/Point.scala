package typings.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proj4", "Point")
@js.native
object Point extends js.Object {
  
  def apply(coordinates: String): InterfaceCoordinates = js.native
  def apply(coordinates: TemplateCoordinates): InterfaceCoordinates = js.native
  /**
    * @deprecated v3
    */
  def apply(x: Double, y: Double): InterfaceCoordinates = js.native
  def apply(x: Double, y: Double, z: Double): InterfaceCoordinates = js.native
}
