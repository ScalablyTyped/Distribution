package typings.reactChartjs2.mod

import typings.chartJs.mod.ChartLegendOptions
import typings.chartJs.mod.ChartOptions
import typings.chartJs.mod.ChartType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartComponentProps extends js.Object {
  
  var data: ChartData[typings.chartJs.mod.ChartData] = js.native
  
  var datasetKeyProvider: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.native
  
  var getDatasetAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var getElementAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var getElementsAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var legend: js.UndefOr[ChartLegendOptions] = js.native
  
  var onElementsClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
   // alias for getElementsAtEvent (backward compatibility)
  var options: js.UndefOr[ChartOptions] = js.native
  
  var plugins: js.UndefOr[js.Array[js.Object]] = js.native
  
  var redraw: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[ChartType] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartComponentProps {
  
  @scala.inline
  def apply(data: ChartData[typings.chartJs.mod.ChartData]): ChartComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartComponentProps]
  }
  
  @scala.inline
  implicit class ChartComponentPropsOps[Self <: ChartComponentProps] (val x: Self) extends AnyVal {
    
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
    def setDataFunction1(value: /* element */ HTMLElement => typings.chartJs.mod.ChartData): Self = this.set("data", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: ChartData[typings.chartJs.mod.ChartData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetKeyProvider(value: /* any */ js.Any => _): Self = this.set("datasetKeyProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDatasetKeyProvider: Self = this.set("datasetKeyProvider", js.undefined)
    
    @scala.inline
    def setGetDatasetAtEvent(value: /* e */ js.Any => Unit): Self = this.set("getDatasetAtEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDatasetAtEvent: Self = this.set("getDatasetAtEvent", js.undefined)
    
    @scala.inline
    def setGetElementAtEvent(value: /* e */ js.Any => Unit): Self = this.set("getElementAtEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetElementAtEvent: Self = this.set("getElementAtEvent", js.undefined)
    
    @scala.inline
    def setGetElementsAtEvent(value: /* e */ js.Any => Unit): Self = this.set("getElementsAtEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetElementsAtEvent: Self = this.set("getElementsAtEvent", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegendOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setOnElementsClick(value: /* e */ js.Any => Unit): Self = this.set("onElementsClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnElementsClick: Self = this.set("onElementsClick", js.undefined)
    
    @scala.inline
    def setOptions(value: ChartOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Object*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[js.Object]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRedraw(value: Boolean): Self = this.set("redraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    
    @scala.inline
    def setType(value: ChartType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
