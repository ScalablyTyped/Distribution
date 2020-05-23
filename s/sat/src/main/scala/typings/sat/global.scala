package typings.sat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object SAT extends js.Object {
    @js.native
    class Box ()
      extends typings.sat.SAT.Box {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double, height: Double) = this()
      /* CompleteClass */
      override var h: Double = js.native
      /* CompleteClass */
      override var pos: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override var w: Double = js.native
      /* CompleteClass */
      override def toPolygon(): typings.sat.SAT.Polygon = js.native
    }
    
    @js.native
    class Circle ()
      extends typings.sat.SAT.Circle {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: typings.sat.SAT.Vector, r: Double) = this()
      /* CompleteClass */
      override var pos: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override var r: Double = js.native
    }
    
    @js.native
    class Polygon ()
      extends typings.sat.SAT.Polygon {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: typings.sat.SAT.Vector, points: js.Array[typings.sat.SAT.Vector]) = this()
      /* CompleteClass */
      override var angle: Double = js.native
      /* CompleteClass */
      override var calcPoints: js.Array[typings.sat.SAT.Vector] = js.native
      /* CompleteClass */
      override var edges: js.Array[typings.sat.SAT.Vector] = js.native
      /* CompleteClass */
      override var normals: js.Array[typings.sat.SAT.Vector] = js.native
      /* CompleteClass */
      override var offset: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override var points: js.Array[typings.sat.SAT.Vector] = js.native
      /* CompleteClass */
      override var pos: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override def getAABB(): typings.sat.SAT.Polygon = js.native
      /* CompleteClass */
      override def getCentroid(): typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override def rotate(angle: Double): typings.sat.SAT.Polygon = js.native
      /* CompleteClass */
      override def setAngle(angle: Double): typings.sat.SAT.Polygon = js.native
      /* CompleteClass */
      override def setOffset(offset: typings.sat.SAT.Vector): typings.sat.SAT.Polygon = js.native
      /* CompleteClass */
      override def setPoints(points: js.Array[typings.sat.SAT.Vector]): typings.sat.SAT.Polygon = js.native
      /* CompleteClass */
      override def translate(x: Double, y: Double): typings.sat.SAT.Polygon = js.native
    }
    
    @js.native
    class Response ()
      extends typings.sat.SAT.Response {
      /* CompleteClass */
      override var a: js.Any = js.native
      /* CompleteClass */
      override var aInB: Boolean = js.native
      /* CompleteClass */
      override var b: js.Any = js.native
      /* CompleteClass */
      override var bInA: Boolean = js.native
      /* CompleteClass */
      override var overlap: Double = js.native
      /* CompleteClass */
      override var overlapN: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override var overlapV: typings.sat.SAT.Vector = js.native
      /* CompleteClass */
      override def clear(): typings.sat.SAT.Response = js.native
    }
    
    @js.native
    /**
      * @class Vector has two properties
      * @param {number} x The x-coordinate of the Vector.
      * @param {number} y The y-coordinate of the Vector.
      */
    class Vector ()
      extends typings.sat.SAT.Vector {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
    }
    
    def pointInCircle(p: typings.sat.SAT.Vector, c: typings.sat.SAT.Circle): Boolean = js.native
    def pointInPolygon(p: typings.sat.SAT.Vector, poly: typings.sat.SAT.Polygon): Boolean = js.native
    def testCircleCircle(a: typings.sat.SAT.Circle, b: typings.sat.SAT.Circle): Boolean = js.native
    def testCircleCircle(a: typings.sat.SAT.Circle, b: typings.sat.SAT.Circle, response: typings.sat.SAT.Response): Boolean = js.native
    def testCirclePolygon(circle: typings.sat.SAT.Circle, polygon: typings.sat.SAT.Polygon): Boolean = js.native
    def testCirclePolygon(
      circle: typings.sat.SAT.Circle,
      polygon: typings.sat.SAT.Polygon,
      response: typings.sat.SAT.Response
    ): Boolean = js.native
    def testPolygonCircle(polygon: typings.sat.SAT.Polygon, circle: typings.sat.SAT.Circle): Boolean = js.native
    def testPolygonCircle(
      polygon: typings.sat.SAT.Polygon,
      circle: typings.sat.SAT.Circle,
      response: typings.sat.SAT.Response
    ): Boolean = js.native
    def testPolygonPolygon(a: typings.sat.SAT.Polygon, b: typings.sat.SAT.Polygon): Boolean = js.native
    def testPolygonPolygon(a: typings.sat.SAT.Polygon, b: typings.sat.SAT.Polygon, response: typings.sat.SAT.Response): Boolean = js.native
  }
  
}

