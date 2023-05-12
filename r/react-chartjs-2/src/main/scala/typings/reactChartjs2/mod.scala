package typings.reactChartjs2

import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.InteractionItem
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactChartjs2.distTypesMod.BaseChartComponent
import typings.reactChartjs2.distTypesMod.TypedChartComponent
import typings.reactChartjs2.reactChartjs2Strings.bar
import typings.reactChartjs2.reactChartjs2Strings.bubble
import typings.reactChartjs2.reactChartjs2Strings.doughnut
import typings.reactChartjs2.reactChartjs2Strings.line
import typings.reactChartjs2.reactChartjs2Strings.pie
import typings.reactChartjs2.reactChartjs2Strings.polarArea
import typings.reactChartjs2.reactChartjs2Strings.radar
import typings.reactChartjs2.reactChartjs2Strings.scatter
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-chartjs-2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-chartjs-2", "Bar")
  @js.native
  val Bar: TypedChartComponent[bar] = js.native
  
  @JSImport("react-chartjs-2", "Bubble")
  @js.native
  val Bubble: TypedChartComponent[bubble] = js.native
  
  @JSImport("react-chartjs-2", "Chart")
  @js.native
  val Chart: BaseChartComponent = js.native
  
  @JSImport("react-chartjs-2", "Doughnut")
  @js.native
  val Doughnut: TypedChartComponent[doughnut] = js.native
  
  @JSImport("react-chartjs-2", "Line")
  @js.native
  val Line: TypedChartComponent[line] = js.native
  
  @JSImport("react-chartjs-2", "Pie")
  @js.native
  val Pie: TypedChartComponent[pie] = js.native
  
  @JSImport("react-chartjs-2", "PolarArea")
  @js.native
  val PolarArea: TypedChartComponent[polarArea] = js.native
  
  @JSImport("react-chartjs-2", "Radar")
  @js.native
  val Radar: TypedChartComponent[radar] = js.native
  
  @JSImport("react-chartjs-2", "Scatter")
  @js.native
  val Scatter: TypedChartComponent[scatter] = js.native
  
  inline def getDatasetAtEvent(
    chart: typings.chartJs.mod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatasetAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  inline def getElementAtEvent(
    chart: typings.chartJs.mod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  inline def getElementsAtEvent(
    chart: typings.chartJs.mod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsAtEvent")(chart.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
}
