package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends js.Object {
  
  var angle: Double = js.native
  
  var calcPoints: js.Array[Vector] = js.native
  
  var edges: js.Array[Vector] = js.native
  
  def getAABB(): Polygon = js.native
  
  def getCentroid(): Vector = js.native
  
  var normals: js.Array[Vector] = js.native
  
  var offset: Vector = js.native
  
  var points: js.Array[Vector] = js.native
  
  var pos: Vector = js.native
  
  def rotate(angle: Double): Polygon = js.native
  
  def setAngle(angle: Double): Polygon = js.native
  
  def setOffset(offset: Vector): Polygon = js.native
  
  def setPoints(points: js.Array[Vector]): Polygon = js.native
  
  def translate(x: Double, y: Double): Polygon = js.native
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
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcPointsVarargs(value: Vector*): Self = this.set("calcPoints", js.Array(value :_*))
    
    @scala.inline
    def setCalcPoints(value: js.Array[Vector]): Self = this.set("calcPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: Vector*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[Vector]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAABB(value: () => Polygon): Self = this.set("getAABB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCentroid(value: () => Vector): Self = this.set("getCentroid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNormalsVarargs(value: Vector*): Self = this.set("normals", js.Array(value :_*))
    
    @scala.inline
    def setNormals(value: js.Array[Vector]): Self = this.set("normals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Vector): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Vector*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Vector]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Vector): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double => Polygon): Self = this.set("rotate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAngle(value: Double => Polygon): Self = this.set("setAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOffset(value: Vector => Polygon): Self = this.set("setOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPoints(value: js.Array[Vector] => Polygon): Self = this.set("setPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslate(value: (Double, Double) => Polygon): Self = this.set("translate", js.Any.fromFunction2(value))
  }
}
