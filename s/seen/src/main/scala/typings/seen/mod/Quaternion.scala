package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  
  def multiply(q: Point): this.type = js.native
  
  var q: Point = js.native
  
  def toMatrix(): Matrix = js.native
}
/* static members */
@JSImport("seen", "Quaternion")
@js.native
object Quaternion extends js.Object {
  
  def axisAngle(x: Double, y: Double, z: Double, angleRads: Double): Quaternion = js.native
  
  var pixelsPerRadian: Double = js.native
  
  def pointAngle(p: Point, angleRads: Double): Quaternion = js.native
  
  def xyToTransform(x: Double, y: Double): Matrix = js.native
}
