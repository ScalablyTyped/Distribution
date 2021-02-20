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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerProps extends StObject {
  
  var beforeId: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[js.Array[_]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[AnyLayout] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var minzoom: js.UndefOr[Double] = js.native
  
  var paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object LayerProps {
  
  @scala.inline
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String
  ): LayerProps = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
  
  @scala.inline
  implicit class LayerPropsMutableBuilder[Self <: LayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeId(value: String): Self = StObject.set(x, "beforeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeIdUndefined: Self = StObject.set(x, "beforeId", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLayout(value: AnyLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    @scala.inline
    def setPaint(
      value: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
    ): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
