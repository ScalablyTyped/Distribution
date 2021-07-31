package typings.seen.anon

import typings.seen.mod.Color
import typings.seen.mod.Material
import typings.seen.mod.Painter
import typings.seen.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<seen.seen.Surface> */
trait PartialSurface extends StObject {
  
  var constructor: js.UndefOr[
    js.Function2[/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter], js.Any]
  ] = js.undefined
  
  var cullBackfaces: js.UndefOr[Boolean] = js.undefined
  
  var dirty: js.UndefOr[Boolean | Null] = js.undefined
  
  var fill: js.UndefOr[js.Function1[/* fill */ String | Color, this.type]] = js.undefined
  
  var fillMaterial: js.UndefOr[Material] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var painter: js.UndefOr[Painter] = js.undefined
  
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  
  var stroke: js.UndefOr[js.Function1[/* stroke */ String | Color, this.type]] = js.undefined
  
  var strokeMaterial: js.UndefOr[Material] = js.undefined
}
object PartialSurface {
  
  @scala.inline
  def apply(): PartialSurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSurface]
  }
  
  @scala.inline
  implicit class PartialSurfaceMutableBuilder[Self <: PartialSurface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: (/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter]) => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    @scala.inline
    def setCullBackfaces(value: Boolean): Self = StObject.set(x, "cullBackfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullBackfacesUndefined: Self = StObject.set(x, "cullBackfaces", js.undefined)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyNull: Self = StObject.set(x, "dirty", null)
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    @scala.inline
    def setFill(value: /* fill */ String | Color => PartialSurface): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillMaterial(value: Material): Self = StObject.set(x, "fillMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillMaterialUndefined: Self = StObject.set(x, "fillMaterial", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPainter(value: Painter): Self = StObject.set(x, "painter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPainterUndefined: Self = StObject.set(x, "painter", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: /* stroke */ String | Color => PartialSurface): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStrokeMaterial(value: Material): Self = StObject.set(x, "strokeMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMaterialUndefined: Self = StObject.set(x, "strokeMaterial", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
