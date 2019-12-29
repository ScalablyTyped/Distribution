package typings.sat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SAT")
@js.native
object SAT extends js.Object {
  @js.native
  class Box () extends js.Object {
    def this(pos: Vector) = this()
    def this(pos: Vector, width: Double) = this()
    def this(pos: Vector, width: Double, height: Double) = this()
    var h: Double = js.native
    var pos: Vector = js.native
    var w: Double = js.native
    def toPolygon(): Polygon = js.native
  }
  
  @js.native
  class Circle () extends js.Object {
    def this(pos: Vector) = this()
    def this(pos: Vector, r: Double) = this()
    var pos: Vector = js.native
    var r: Double = js.native
  }
  
  @js.native
  class Polygon () extends js.Object {
    def this(pos: Vector) = this()
    def this(pos: Vector, points: js.Array[Vector]) = this()
    var angle: Double = js.native
    var calcPoints: js.Array[Vector] = js.native
    var edges: js.Array[Vector] = js.native
    var normals: js.Array[Vector] = js.native
    var offset: Vector = js.native
    var points: js.Array[Vector] = js.native
    var pos: Vector = js.native
    def getAABB(): Polygon = js.native
    def getCentroid(): Vector = js.native
    def rotate(angle: Double): Polygon = js.native
    def setAngle(angle: Double): Polygon = js.native
    def setOffset(offset: Vector): Polygon = js.native
    def setPoints(points: js.Array[Vector]): Polygon = js.native
    def translate(x: Double, y: Double): Polygon = js.native
  }
  
  @js.native
  class Response () extends js.Object {
    var a: js.Any = js.native
    var aInB: Boolean = js.native
    var b: js.Any = js.native
    var bInA: Boolean = js.native
    var overlap: Double = js.native
    var overlapN: Vector = js.native
    var overlapV: Vector = js.native
    def clear(): Response = js.native
  }
  
  @js.native
  /**
  		 * @class Vector has two properties
  		 * @param {number} x The x-coordinate of the Vector.
  		 * @param {number} y The y-coordinate of the Vector.
  		 */
  class Vector () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
    def add(other: Vector): Vector = js.native
    def copy(other: Vector): Vector = js.native
    def dot(other: Vector): Double = js.native
    def len(): Double = js.native
    def len2(): Double = js.native
    def normalize(): Vector = js.native
    def perp(): Vector = js.native
    def project(other: Vector): Vector = js.native
    def projectN(other: Vector): Vector = js.native
    def reflect(axis: Vector): Vector = js.native
    def reflectN(axis: Vector): Vector = js.native
    def reverse(): Vector = js.native
    def rotate(angle: Double): Vector = js.native
    def scale(x: Double): Vector = js.native
    def scale(x: Double, y: Double): Vector = js.native
    def sub(other: Vector): Vector = js.native
  }
  
  def pointInCircle(p: Vector, c: Circle): Boolean = js.native
  def pointInPolygon(p: Vector, poly: Polygon): Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle): Boolean = js.native
  def testCircleCircle(a: Circle, b: Circle, response: Response): Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon): Boolean = js.native
  def testCirclePolygon(circle: Circle, polygon: Polygon, response: Response): Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle): Boolean = js.native
  def testPolygonCircle(polygon: Polygon, circle: Circle, response: Response): Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon): Boolean = js.native
  def testPolygonPolygon(a: Polygon, b: Polygon, response: Response): Boolean = js.native
}

