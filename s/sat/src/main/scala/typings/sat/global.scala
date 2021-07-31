package typings.sat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SAT {
    
    @JSGlobal("SAT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SAT.Box")
    @js.native
    class Box ()
      extends StObject
         with typings.sat.SAT.Box {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: Unit, width: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double) = this()
      def this(pos: Unit, width: Double, height: Double) = this()
      def this(pos: Unit, width: Unit, height: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double, height: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Unit, height: Double) = this()
      
      /* CompleteClass */
      var h: Double = js.native
      
      /* CompleteClass */
      var pos: typings.sat.SAT.Vector = js.native
      
      /* CompleteClass */
      override def toPolygon(): typings.sat.SAT.Polygon = js.native
      
      /* CompleteClass */
      var w: Double = js.native
    }
    
    @JSGlobal("SAT.Circle")
    @js.native
    class Circle ()
      extends StObject
         with typings.sat.SAT.Circle {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: Unit, r: Double) = this()
      def this(pos: typings.sat.SAT.Vector, r: Double) = this()
      
      /* CompleteClass */
      var pos: typings.sat.SAT.Vector = js.native
      
      /* CompleteClass */
      var r: Double = js.native
    }
    
    @JSGlobal("SAT.Polygon")
    @js.native
    class Polygon ()
      extends StObject
         with typings.sat.SAT.Polygon {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: Unit, points: js.Array[typings.sat.SAT.Vector]) = this()
      def this(pos: typings.sat.SAT.Vector, points: js.Array[typings.sat.SAT.Vector]) = this()
      
      /* CompleteClass */
      var angle: Double = js.native
      
      /* CompleteClass */
      var calcPoints: js.Array[typings.sat.SAT.Vector] = js.native
      
      /* CompleteClass */
      var edges: js.Array[typings.sat.SAT.Vector] = js.native
      
      /* CompleteClass */
      override def getAABB(): typings.sat.SAT.Polygon = js.native
      
      /* CompleteClass */
      override def getCentroid(): typings.sat.SAT.Vector = js.native
      
      /* CompleteClass */
      var normals: js.Array[typings.sat.SAT.Vector] = js.native
      
      /* CompleteClass */
      var offset: typings.sat.SAT.Vector = js.native
      
      /* CompleteClass */
      var points: js.Array[typings.sat.SAT.Vector] = js.native
      
      /* CompleteClass */
      var pos: typings.sat.SAT.Vector = js.native
      
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
    
    @JSGlobal("SAT.Response")
    @js.native
    class Response ()
      extends StObject
         with typings.sat.SAT.Response {
      
      /* CompleteClass */
      var a: js.Any = js.native
      
      /* CompleteClass */
      var aInB: Boolean = js.native
      
      /* CompleteClass */
      var b: js.Any = js.native
      
      /* CompleteClass */
      var bInA: Boolean = js.native
      
      /* CompleteClass */
      override def clear(): typings.sat.SAT.Response = js.native
      
      /* CompleteClass */
      var overlap: Double = js.native
      
      /* CompleteClass */
      var overlapN: typings.sat.SAT.Vector = js.native
      
      /* CompleteClass */
      var overlapV: typings.sat.SAT.Vector = js.native
    }
    
    @JSGlobal("SAT.Vector")
    @js.native
    /**
      * @class Vector has two properties
      * @param {number} x The x-coordinate of the Vector.
      * @param {number} y The y-coordinate of the Vector.
      */
    class Vector ()
      extends StObject
         with typings.sat.SAT.Vector {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
    }
    
    @scala.inline
    def pointInCircle(p: typings.sat.SAT.Vector, c: typings.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInCircle")(p.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def pointInPolygon(p: typings.sat.SAT.Vector, poly: typings.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInPolygon")(p.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def testCircleCircle(a: typings.sat.SAT.Circle, b: typings.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCircleCircle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def testCircleCircle(a: typings.sat.SAT.Circle, b: typings.sat.SAT.Circle, response: typings.sat.SAT.Response): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCircleCircle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def testCirclePolygon(circle: typings.sat.SAT.Circle, polygon: typings.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCirclePolygon")(circle.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def testCirclePolygon(
      circle: typings.sat.SAT.Circle,
      polygon: typings.sat.SAT.Polygon,
      response: typings.sat.SAT.Response
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testCirclePolygon")(circle.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def testPolygonCircle(polygon: typings.sat.SAT.Polygon, circle: typings.sat.SAT.Circle): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonCircle")(polygon.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def testPolygonCircle(
      polygon: typings.sat.SAT.Polygon,
      circle: typings.sat.SAT.Circle,
      response: typings.sat.SAT.Response
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonCircle")(polygon.asInstanceOf[js.Any], circle.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def testPolygonPolygon(a: typings.sat.SAT.Polygon, b: typings.sat.SAT.Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonPolygon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def testPolygonPolygon(a: typings.sat.SAT.Polygon, b: typings.sat.SAT.Polygon, response: typings.sat.SAT.Response): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testPolygonPolygon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
