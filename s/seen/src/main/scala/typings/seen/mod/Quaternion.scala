package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Quaternion")
@js.native
open class Quaternion () extends StObject {
  
  def multiply(q: Point): this.type = js.native
  
  var q: Point = js.native
  
  def toMatrix(): Matrix = js.native
}
/* static members */
object Quaternion {
  
  @JSImport("seen", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def axisAngle(x: Double, y: Double, z: Double, angleRads: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("axisAngle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], angleRads.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  @JSImport("seen", "Quaternion.pixelsPerRadian")
  @js.native
  def pixelsPerRadian: Double = js.native
  inline def pixelsPerRadian_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelsPerRadian")(x.asInstanceOf[js.Any])
  
  inline def pointAngle(p: Point, angleRads: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAngle")(p.asInstanceOf[js.Any], angleRads.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  
  inline def xyToTransform(x: Double, y: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("xyToTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Matrix]
}
