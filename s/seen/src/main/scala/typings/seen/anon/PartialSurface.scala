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
    js.Function2[/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter], Any]
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
  
  inline def apply(): PartialSurface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSurface]
  }
  
  extension [Self <: PartialSurface](x: Self) {
    
    inline def setConstructor(value: (/* points */ js.Array[Point], /* painter */ js.UndefOr[Painter]) => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction2(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCullBackfaces(value: Boolean): Self = StObject.set(x, "cullBackfaces", value.asInstanceOf[js.Any])
    
    inline def setCullBackfacesUndefined: Self = StObject.set(x, "cullBackfaces", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyNull: Self = StObject.set(x, "dirty", null)
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setFill(value: /* fill */ String | Color => PartialSurface): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillMaterial(value: Material): Self = StObject.set(x, "fillMaterial", value.asInstanceOf[js.Any])
    
    inline def setFillMaterialUndefined: Self = StObject.set(x, "fillMaterial", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPainter(value: Painter): Self = StObject.set(x, "painter", value.asInstanceOf[js.Any])
    
    inline def setPainterUndefined: Self = StObject.set(x, "painter", js.undefined)
    
    inline def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setStroke(value: /* stroke */ String | Color => PartialSurface): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
    
    inline def setStrokeMaterial(value: Material): Self = StObject.set(x, "strokeMaterial", value.asInstanceOf[js.Any])
    
    inline def setStrokeMaterialUndefined: Self = StObject.set(x, "strokeMaterial", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
