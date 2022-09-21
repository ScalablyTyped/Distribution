package typings.reactMapGl.mod

import typings.mapboxGl.mod.AnyLayout
import typings.mapboxGl.mod.BackgroundPaint
import typings.mapboxGl.mod.CirclePaint
import typings.mapboxGl.mod.FillExtrusionPaint
import typings.mapboxGl.mod.FillPaint
import typings.mapboxGl.mod.HeatmapPaint
import typings.mapboxGl.mod.HillshadePaint
import typings.mapboxGl.mod.LinePaint
import typings.mapboxGl.mod.RasterPaint
import typings.mapboxGl.mod.SymbolPaint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerProps extends StObject {
  
  var beforeId: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[js.Array[Any]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[AnyLayout] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  var paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object LayerProps {
  
  inline def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String
  ): LayerProps = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
  
  extension [Self <: LayerProps](x: Self) {
    
    inline def setBeforeId(value: String): Self = StObject.set(x, "beforeId", value.asInstanceOf[js.Any])
    
    inline def setBeforeIdUndefined: Self = StObject.set(x, "beforeId", js.undefined)
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLayout(value: AnyLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setPaint(
      value: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
    ): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
