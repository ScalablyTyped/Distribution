package typings
package rechartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rechartsMod {
  type AreaChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - ContentRenderer[js.Any]
    - rechartsLib.rechartsLibStrings.auto
    - rechartsLib.rechartsLibStrings.dataMin
    - rechartsLib.rechartsLibStrings.dataMax
  */
  type AxisDomain = _AxisDomain | ContentRenderer[js.Any] | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - rechartsLib.rechartsLibStrings.preserveStart
    - rechartsLib.rechartsLibStrings.preserveEnd
    - rechartsLib.rechartsLibStrings.preserveStartEnd
  */
  type AxisInterval = _AxisInterval | scala.Double
  type BBoxUpdateCallback = js.Function1[/* box */ rechartsLib.Anon_HeightWidth, scala.Unit]
  type BarChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type ComposedChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, reactLib.reactMod.ReactNode]
  type CoordinatesGenerator = js.Function1[/* arg */ rechartsLib.Anon_Height, js.Array[scala.Double]]
  type DataKey = java.lang.String | scala.Double | (js.Function1[
    /* dataObject */ js.Any, 
    java.lang.String | scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null
  ])
  type DataPointFormatter = js.Function2[/* entry */ js.Any, /* dataKey */ DataKey, rechartsLib.Anon_ErrorVal]
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, reactLib.reactMod.ReactNode]
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[scala.Nothing], 
    /* entry */ js.UndefOr[LegendPayload], 
    /* i */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type LineChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  /* Rewritten from type alias, can be one of: 
    - rechartsLib.rechartsLibStrings.basis
    - rechartsLib.rechartsLibStrings.basisClosed
    - rechartsLib.rechartsLibStrings.basisOpen
    - rechartsLib.rechartsLibStrings.linear
    - rechartsLib.rechartsLibStrings.linearClosed
    - rechartsLib.rechartsLibStrings.natural
    - rechartsLib.rechartsLibStrings.monotoneX
    - rechartsLib.rechartsLibStrings.monotoneY
    - rechartsLib.rechartsLibStrings.monotone
    - rechartsLib.rechartsLibStrings.step
    - rechartsLib.rechartsLibStrings.stepBefore
    - rechartsLib.rechartsLibStrings.stepAfter
    - d3DashShapeLib.d3DashShapeMod.CurveFactory
  */
  type LineType = _LineType | d3DashShapeLib.d3DashShapeMod.CurveFactory
  type Percentage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - rechartsLib.rechartsLibStrings.auto
    - rechartsLib.rechartsLibStrings.dataMin
    - rechartsLib.rechartsLibStrings.dataMax
  */
  type PolarRadiusAxisDomain = _PolarRadiusAxisDomain | scala.Double
  type RechartsFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ScaleCalculator = js.Function1[/* x */ scala.Double | java.lang.String, scala.Double]
  type ScatterChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), 
    /* name */ java.lang.String, 
    /* entry */ TooltipPayload, 
    /* index */ scala.Double, 
    reactLib.reactMod.ReactNode
  ]
}
