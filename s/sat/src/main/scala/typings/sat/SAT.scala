package typings.sat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SAT {
  
  trait Box extends StObject {
    
    var h: Double
    
    var pos: Vector
    
    def toPolygon(): Polygon
    
    var w: Double
  }
  object Box {
    
    @scala.inline
    def apply(h: Double, pos: Vector, toPolygon: () => Polygon, w: Double): Box = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], toPolygon = js.Any.fromFunction0(toPolygon), w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPolygon(value: () => Polygon): Self = StObject.set(x, "toPolygon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Circle extends StObject {
    
    var pos: Vector
    
    var r: Double
  }
  object Circle {
    
    @scala.inline
    def apply(pos: Vector, r: Double): Circle = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit class CircleMutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon extends StObject {
    
    var angle: Double
    
    var calcPoints: js.Array[Vector]
    
    var edges: js.Array[Vector]
    
    def getAABB(): Polygon
    
    def getCentroid(): Vector
    
    var normals: js.Array[Vector]
    
    var offset: Vector
    
    var points: js.Array[Vector]
    
    var pos: Vector
    
    def rotate(angle: Double): Polygon
    
    def setAngle(angle: Double): Polygon
    
    def setOffset(offset: Vector): Polygon
    
    def setPoints(points: js.Array[Vector]): Polygon
    
    def translate(x: Double, y: Double): Polygon
  }
  object Polygon {
    
    @scala.inline
    def apply(
      angle: Double,
      calcPoints: js.Array[Vector],
      edges: js.Array[Vector],
      getAABB: () => Polygon,
      getCentroid: () => Vector,
      normals: js.Array[Vector],
      offset: Vector,
      points: js.Array[Vector],
      pos: Vector,
      rotate: Double => Polygon,
      setAngle: Double => Polygon,
      setOffset: Vector => Polygon,
      setPoints: js.Array[Vector] => Polygon,
      translate: (Double, Double) => Polygon
    ): Polygon = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], calcPoints = calcPoints.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getAABB = js.Any.fromFunction0(getAABB), getCentroid = js.Any.fromFunction0(getCentroid), normals = normals.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rotate = js.Any.fromFunction1(rotate), setAngle = js.Any.fromFunction1(setAngle), setOffset = js.Any.fromFunction1(setOffset), setPoints = js.Any.fromFunction1(setPoints), translate = js.Any.fromFunction2(translate))
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcPoints(value: js.Array[Vector]): Self = StObject.set(x, "calcPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcPointsVarargs(value: Vector*): Self = StObject.set(x, "calcPoints", js.Array(value :_*))
      
      @scala.inline
      def setEdges(value: js.Array[Vector]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: Vector*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setGetAABB(value: () => Polygon): Self = StObject.set(x, "getAABB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCentroid(value: () => Vector): Self = StObject.set(x, "getCentroid", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNormals(value: js.Array[Vector]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalsVarargs(value: Vector*): Self = StObject.set(x, "normals", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Vector): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[Vector]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: Vector*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setPos(value: Vector): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double => Polygon): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAngle(value: Double => Polygon): Self = StObject.set(x, "setAngle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOffset(value: Vector => Polygon): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPoints(value: js.Array[Vector] => Polygon): Self = StObject.set(x, "setPoints", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTranslate(value: (Double, Double) => Polygon): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
    }
  }
  
  trait Response extends StObject {
    
    var a: js.Any
    
    var aInB: Boolean
    
    var b: js.Any
    
    var bInA: Boolean
    
    def clear(): Response
    
    var overlap: Double
    
    var overlapN: Vector
    
    var overlapV: Vector
  }
  object Response {
    
    @scala.inline
    def apply(
      a: js.Any,
      aInB: Boolean,
      b: js.Any,
      bInA: Boolean,
      clear: () => Response,
      overlap: Double,
      overlapN: Vector,
      overlapV: Vector
    ): Response = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], aInB = aInB.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], bInA = bInA.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), overlap = overlap.asInstanceOf[js.Any], overlapN = overlapN.asInstanceOf[js.Any], overlapV = overlapV.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: js.Any): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAInB(value: Boolean): Self = StObject.set(x, "aInB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: js.Any): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBInA(value: Boolean): Self = StObject.set(x, "bInA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: () => Response): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlap(value: Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapN(value: Vector): Self = StObject.set(x, "overlapN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlapV(value: Vector): Self = StObject.set(x, "overlapV", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vector extends StObject {
    
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
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
