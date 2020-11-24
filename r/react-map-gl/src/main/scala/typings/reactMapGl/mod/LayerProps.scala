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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerProps extends js.Object {
  
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
  implicit class LayerPropsOps[Self <: LayerProps] (val x: Self) extends AnyVal {
    
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
    def setPaint(
      value: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
    ): Self = this.set("paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeId(value: String): Self = this.set("beforeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeId: Self = this.set("beforeId", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLayout(value: AnyLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    
    @scala.inline
    def setMinzoom(value: Double): Self = this.set("minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinzoom: Self = this.set("minzoom", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
