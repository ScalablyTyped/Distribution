package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Bounds")
@js.native
class Bounds () extends StObject {
  
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
  
  @JSImport("seen", "Bounds.points")
  @js.native
  def points(points: js.Array[Point]): Bounds = js.native
  
  @JSImport("seen", "Bounds.xywh")
  @js.native
  def xywh(x: Double, y: Double, w: Double, h: Double): Bounds = js.native
  
  @JSImport("seen", "Bounds.xyzwhd")
  @js.native
  def xyzwhd(x: Double, y: Double, z: Double, w: Double, h: Double, d: Double): Bounds = js.native
}
