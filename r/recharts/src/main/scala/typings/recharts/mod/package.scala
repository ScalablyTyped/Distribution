package typings.recharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AreaChartProps = typings.recharts.mod.CategoricalChartWrapper[typings.recharts.mod.LayoutType] with typings.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.recharts.mod.ContentRenderer[js.Any]
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type AxisDomain = typings.recharts.mod._AxisDomain | typings.recharts.mod.ContentRenderer[js.Any] | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.preserveStart
    - typings.recharts.rechartsStrings.preserveEnd
    - typings.recharts.rechartsStrings.preserveStartEnd
  */
  type AxisInterval = typings.recharts.mod._AxisInterval | scala.Double
  type BBoxUpdateCallback = js.Function1[/* box */ typings.recharts.AnonWidth, scala.Unit]
  type BarChartProps = typings.recharts.mod.CategoricalChartWrapper[typings.recharts.mod.LayoutType] with typings.recharts.mod.EventAttributes
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type BaseValueType = typings.recharts.mod._BaseValueType | scala.Double
  type ComposedChartProps = typings.recharts.mod.CategoricalChartWrapper[typings.recharts.mod.LayoutType] with typings.recharts.mod.EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, typings.react.mod.ReactNode]
  type CoordinatesGenerator = js.Function1[/* arg */ typings.recharts.AnonHeight, js.Array[scala.Double]]
  type DataKey = java.lang.String | scala.Double | (js.Function1[
    /* dataObject */ js.Any, 
    java.lang.String | scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null
  ])
  type DataPointFormatter = js.Function2[
    /* entry */ js.Any, 
    /* dataKey */ typings.recharts.mod.DataKey, 
    typings.recharts.AnonErrorVal
  ]
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, typings.react.mod.ReactNode]
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], 
    /* entry */ js.UndefOr[typings.recharts.mod.LegendPayload], 
    /* i */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type LineChartProps = typings.recharts.mod.CategoricalChartWrapper[typings.recharts.mod.LayoutType] with typings.recharts.mod.EventAttributes
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
    - typings.d3Shape.mod.CurveFactory
  */
  type LineType = typings.recharts.mod._LineType | typings.d3Shape.mod.CurveFactory
  type Percentage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.recharts.rechartsStrings.auto
    - typings.recharts.rechartsStrings.dataMin
    - typings.recharts.rechartsStrings.dataMax
  */
  type PolarRadiusAxisDomain = typings.recharts.mod._PolarRadiusAxisDomain | scala.Double
  type RechartsFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ScaleCalculator = js.Function1[/* x */ scala.Double | java.lang.String, scala.Double]
  type ScatterChartProps = typings.recharts.mod.CategoricalChartWrapper[typings.recharts.mod.LayoutType] with typings.recharts.mod.EventAttributes
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), 
    /* name */ java.lang.String, 
    /* entry */ typings.recharts.mod.TooltipPayload, 
    /* index */ scala.Double, 
    typings.react.mod.ReactNode
  ]
}
