package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Surface")
@js.native
class Surface protected () extends StObject {
  def this(points: js.Array[Point]) = this()
  def this(points: js.Array[Point], painter: Painter) = this()
  
  var cullBackfaces: Boolean = js.native
  
  var dirty: Boolean | Null = js.native
  
  def fill(fill: String): this.type = js.native
  def fill(fill: Color): this.type = js.native
  
  var fillMaterial: Material = js.native
  
  var id: String = js.native
  
  var painter: Painter = js.native
  
  var points: js.Array[Point] = js.native
  
  def stroke(stroke: String): this.type = js.native
  def stroke(stroke: Color): this.type = js.native
  
  var strokeMaterial: Material = js.native
}
