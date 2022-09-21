package typings.reactChartjs2

import typings.react.mod.global.JSX.Element
import typings.reactChartjs2.anon.`10`
import typings.reactChartjs2.anon.`11`
import typings.reactChartjs2.anon.`12`
import typings.reactChartjs2.anon.`13`
import typings.reactChartjs2.anon.`14`
import typings.reactChartjs2.anon.`7`
import typings.reactChartjs2.anon.`8`
import typings.reactChartjs2.anon.`9`
import typings.reactChartjs2.reactChartjs2Strings.`type`
import typings.reactChartjs2.reactChartjs2Strings.bar
import typings.reactChartjs2.reactChartjs2Strings.bubble
import typings.reactChartjs2.reactChartjs2Strings.doughnut
import typings.reactChartjs2.reactChartjs2Strings.line
import typings.reactChartjs2.reactChartjs2Strings.pie
import typings.reactChartjs2.reactChartjs2Strings.polarArea
import typings.reactChartjs2.reactChartjs2Strings.radar
import typings.reactChartjs2.reactChartjs2Strings.scatter
import typings.reactChartjs2.typesMod.ChartProps
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedChartsMod {
  
  @JSImport("react-chartjs-2/dist/typedCharts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bar[TData, TLabel](props: (Omit[ChartProps[bar, TData, TLabel], `type`]) & (`8`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Bubble[TData, TLabel](props: (Omit[ChartProps[bubble, TData, TLabel], `type`]) & (`12`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bubble")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Doughnut[TData, TLabel](props: (Omit[ChartProps[doughnut, TData, TLabel], `type`]) & (`10`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Doughnut")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Line[TData, TLabel](props: (Omit[ChartProps[line, TData, TLabel], `type`]) & (`7`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Line")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Pie[TData, TLabel](props: (Omit[ChartProps[pie, TData, TLabel], `type`]) & (`13`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pie")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PolarArea[TData, TLabel](props: (Omit[ChartProps[polarArea, TData, TLabel], `type`]) & (`11`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PolarArea")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Radar[TData, TLabel](props: (Omit[ChartProps[radar, TData, TLabel], `type`]) & (`9`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Scatter[TData, TLabel](props: (Omit[ChartProps[scatter, TData, TLabel], `type`]) & (`14`[TData, TLabel])): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Scatter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
