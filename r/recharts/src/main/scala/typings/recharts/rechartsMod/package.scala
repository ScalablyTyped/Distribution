package typings.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rechartsMod {
  import typings.d3DashShape.d3DashShapeMod.CurveFactory
  import typings.react.reactMod.ReactNode
  import typings.recharts.Anon_ErrorVal
  import typings.recharts.Anon_Height
  import typings.recharts.Anon_HeightWidth

  type AreaChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.recharts.rechartsMod.ContentRenderer[js.Any]
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type AxisDomain = _AxisDomain | ContentRenderer[js.Any] | String | Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.preserveStart
    - typings.recharts.rechartsStrings.preserveEnd
    - typings.recharts.rechartsStrings.preserveStartEnd
  */
  type AxisInterval = _AxisInterval | Double
  type BBoxUpdateCallback = js.Function1[/* box */ Anon_HeightWidth, Unit]
  type BarChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type BaseValueType = _BaseValueType | Double
  type ComposedChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, ReactNode]
  type CoordinatesGenerator = js.Function1[/* arg */ Anon_Height, js.Array[Double]]
  type DataKey = String | Double | (js.Function1[/* dataObject */ js.Any, String | Double | (js.Tuple2[Double, Double]) | Null])
  type DataPointFormatter = js.Function2[/* entry */ js.Any, /* dataKey */ DataKey, Anon_ErrorVal]
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, Double]
  type LabelFormatter = js.Function1[/* label */ String | Double, ReactNode]
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], 
    /* entry */ js.UndefOr[LegendPayload], 
    /* i */ js.UndefOr[Double], 
    js.Any
  ]
  type LineChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  /* Rewritten from type alias, can be one of: 
    - typings.recharts.rechartsStrings.basis
    - typings.recharts.rechartsStrings.basisClosed
    - typings.recharts.rechartsStrings.basisOpen
    - typings.recharts.rechartsStrings.linear
    - typings.recharts.rechartsStrings.linearClosed
    - typings.recharts.rechartsStrings.natural
    - typings.recharts.rechartsStrings.monotoneX
    - typings.recharts.rechartsStrings.monotoneY
    - typings.recharts.rechartsStrings.monotone
    - typings.recharts.rechartsStrings.step
    - typings.recharts.rechartsStrings.stepBefore
    - typings.recharts.rechartsStrings.stepAfter
    - typings.d3DashShape.d3DashShapeMod.CurveFactory
  */
  type LineType = _LineType | CurveFactory
  type Percentage = String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type PolarRadiusAxisDomain = _PolarRadiusAxisDomain | Double
  type RechartsFunction = js.Function1[/* repeated */ js.Any, Unit]
  type ScaleCalculator = js.Function1[/* x */ Double | String, Double]
  type ScatterChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ String | Double | (js.Array[String | Double]), 
    /* name */ String, 
    /* entry */ TooltipPayload, 
    /* index */ Double, 
    ReactNode
  ]
}
