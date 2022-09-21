package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Bounds")
@js.native
open class Bounds () extends StObject {
  
  def add(p: Point): this.type = js.native
  
  def center(): Point = js.native
  
  def contains(p: Point): Boolean = js.native
  
  def copy(): this.type = js.native
  
  def depth(): Double = js.native
  
  def height(): Double = js.native
  
  def intersect(box: Bounds): this.type = js.native
  
  def maxX(): Double = js.native
  
  def maxY(): Double = js.native
  
  def maxZ(): Double = js.native
  
  def minX(): Double = js.native
  
  def minY(): Double = js.native
  
  def minZ(): Double = js.native
  
  def pad(x: Double, y: Double, z: Double): this.type = js.native
  
  def reset(): this.type = js.native
  
  def valid(): Boolean = js.native
  
  def width(): Double = js.native
}
/* static members */
object Bounds {
  
  @JSImport("seen", "Bounds")
  @js.native
  val ^ : js.Any = js.native
  
  inline def points(points: js.Array[Point]): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("points")(points.asInstanceOf[js.Any]).asInstanceOf[Bounds]
  
  inline def xywh(x: Double, y: Double, w: Double, h: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("xywh")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def xyzwhd(x: Double, y: Double, z: Double, w: Double, h: Double, d: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("xyzwhd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Bounds]
}
