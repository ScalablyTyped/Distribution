package typings.sat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object SAT extends js.Object {
    
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
    
    @js.native
    class Box ()
      extends typings.sat.SAT.Box {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(pos: typings.sat.SAT.Vector, width: Double, height: Double) = this()
    }
    
    @js.native
    class Circle ()
      extends typings.sat.SAT.Circle {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], r: Double) = this()
      def this(pos: typings.sat.SAT.Vector, r: Double) = this()
    }
    
    @js.native
    class Polygon ()
      extends typings.sat.SAT.Polygon {
      def this(pos: typings.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], points: js.Array[typings.sat.SAT.Vector]) = this()
      def this(pos: typings.sat.SAT.Vector, points: js.Array[typings.sat.SAT.Vector]) = this()
    }
    
    @js.native
    class Response ()
      extends typings.sat.SAT.Response
    
    @js.native
    /**
      * @class Vector has two properties
      * @param {number} x The x-coordinate of the Vector.
      * @param {number} y The y-coordinate of the Vector.
      */
    class Vector ()
      extends typings.sat.SAT.Vector {
      def this(x: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
      def this(x: Double, y: Double) = this()
    }
  }
}
