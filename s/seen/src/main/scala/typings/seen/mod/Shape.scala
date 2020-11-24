package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Shape")
@js.native
class Shape protected () extends Transformable {
  def this(`type`: String, surfaces: js.Array[Surface]) = this()
  
  def eachSurface(f: js.Function1[/* s */ Surface, Unit]): this.type = js.native
  
  def fill(fill: String): this.type = js.native
  def fill(fill: Color): this.type = js.native
  
  def stroke(stroke: String): this.type = js.native
  def stroke(stroke: Color): this.type = js.native
  
  var surfaces: js.Array[Surface] = js.native
  
  var `type`: String = js.native
}
