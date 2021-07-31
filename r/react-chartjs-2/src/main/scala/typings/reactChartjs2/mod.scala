package typings.reactChartjs2

import typings.chartJs.mod.ChartFontOptions
import typings.chartJs.mod.ChartLegendOptions
import typings.chartJs.mod.ChartOptions
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.^
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chartjs-2", JSImport.Default)
  @js.native
  class default[P /* <: ChartComponentProps */] () extends ChartComponent[P]
  
  @JSImport("react-chartjs-2", "Bar")
  @js.native
  class Bar () extends ChartComponent[LinearComponentProps]
  
  @JSImport("react-chartjs-2", "Bubble")
  @js.native
  class Bubble () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "Doughnut")
  @js.native
  class Doughnut () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "HorizontalBar")
  @js.native
  class HorizontalBar () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "Line")
  @js.native
  class Line () extends ChartComponent[LinearComponentProps]
  
  @JSImport("react-chartjs-2", "Pie")
  @js.native
  class Pie () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "Polar")
  @js.native
  class Polar () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "Radar")
  @js.native
  class Radar () extends ChartComponent[ChartComponentProps]
  
  @JSImport("react-chartjs-2", "Scatter")
  @js.native
  class Scatter () extends ChartComponent[ChartComponentProps]
  
  object defaults {
    
    @JSImport("react-chartjs-2", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-chartjs-2", "defaults.global")
    @js.native
    def global: ChartOptions & ChartFontOptions = js.native
    @scala.inline
    def global_=(x: ChartOptions & ChartFontOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ChartComponent[P /* <: ChartComponentProps */]
    extends Component[P, js.Object, js.Any] {
    
    var chartInstance: ^ = js.native
  }
  
  trait ChartComponentProps extends StObject {
    
    var data: ChartData[typings.chartJs.mod.ChartData]
    
    var datasetKeyProvider: js.UndefOr[js.Function1[/* any */ js.Any, js.Any]] = js.undefined
    
    var getDatasetAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var getElementAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var getElementsAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var legend: js.UndefOr[ChartLegendOptions] = js.undefined
    
    var onElementsClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    // alias for getElementsAtEvent (backward compatibility)
    var options: js.UndefOr[ChartOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var redraw: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[ChartType] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ChartComponentProps {
    
    @scala.inline
    def apply(data: ChartData[typings.chartJs.mod.ChartData]): ChartComponentProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartComponentProps]
    }
    
    @scala.inline
    implicit class ChartComponentPropsMutableBuilder[Self <: ChartComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ChartData[typings.chartJs.mod.ChartData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFunction1(value: /* element */ HTMLElement => typings.chartJs.mod.ChartData): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDatasetKeyProvider(value: /* any */ js.Any => js.Any): Self = StObject.set(x, "datasetKeyProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDatasetKeyProviderUndefined: Self = StObject.set(x, "datasetKeyProvider", js.undefined)
      
      @scala.inline
      def setGetDatasetAtEvent(value: /* e */ js.Any => Unit): Self = StObject.set(x, "getDatasetAtEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDatasetAtEventUndefined: Self = StObject.set(x, "getDatasetAtEvent", js.undefined)
      
      @scala.inline
      def setGetElementAtEvent(value: /* e */ js.Any => Unit): Self = StObject.set(x, "getElementAtEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementAtEventUndefined: Self = StObject.set(x, "getElementAtEvent", js.undefined)
      
      @scala.inline
      def setGetElementsAtEvent(value: /* e */ js.Any => Unit): Self = StObject.set(x, "getElementsAtEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetElementsAtEventUndefined: Self = StObject.set(x, "getElementsAtEvent", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLegend(value: ChartLegendOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setOnElementsClick(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onElementsClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnElementsClickUndefined: Self = StObject.set(x, "onElementsClick", js.undefined)
      
      @scala.inline
      def setOptions(value: ChartOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Object*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRedraw(value: Boolean): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      @scala.inline
      def setType(value: ChartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ChartData[T /* <: typings.chartJs.mod.ChartData */] = ChartDataFunction[T] | T
  
  type ChartDataFunction[T /* <: typings.chartJs.mod.ChartData */] = js.Function1[/* element */ HTMLElement, T]
  
  trait LinearComponentProps
    extends StObject
       with ChartComponentProps
  object LinearComponentProps {
    
    @scala.inline
    def apply(data: ChartData[typings.chartJs.mod.ChartData]): LinearComponentProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearComponentProps]
    }
  }
}
