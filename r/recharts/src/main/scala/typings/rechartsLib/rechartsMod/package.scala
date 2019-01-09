package typings
package rechartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rechartsMod {
  type AnimationEasingType = rechartsLib.rechartsLibStrings.ease | rechartsLib.rechartsLibStrings.`ease-in` | rechartsLib.rechartsLibStrings.`ease-out` | rechartsLib.rechartsLibStrings.`ease-in-out` | rechartsLib.rechartsLibStrings.linear
  type AreaChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type AxisDomain = java.lang.String | scala.Double | ContentRenderer[js.Any] | rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.dataMin | rechartsLib.rechartsLibStrings.dataMax
  type AxisInterval = scala.Double | rechartsLib.rechartsLibStrings.preserveStart | rechartsLib.rechartsLibStrings.preserveEnd | rechartsLib.rechartsLibStrings.preserveStartEnd
  type BBoxUpdateCallback = js.Function1[/* box */ rechartsLib.Anon_HeightWidth, scala.Unit]
  type BarChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type CellProps = stdLib.Partial[PresentationAttributes[scala.Double, scala.Double]]
  type ComposedChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type ContentRenderer[P] = js.Function1[/* props */ P, reactLib.reactMod.ReactNs.ReactNode]
  type CoordinatesGenerator = js.Function1[/* arg */ rechartsLib.Anon_Height, js.Array[scala.Double]]
  type DataKey = java.lang.String | scala.Double | (js.Function1[
    /* dataObject */ js.Any, 
    scala.Double | (js.Tuple2[scala.Double, scala.Double]) | scala.Null
  ])
  type DataPointFormatter = js.Function2[/* entry */ js.Any, /* dataKey */ DataKey, rechartsLib.Anon_ErrorVal]
  type IconType = rechartsLib.rechartsLibStrings.plainline | rechartsLib.rechartsLibStrings.line | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.rect | rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye
  type IfOverflowType = rechartsLib.rechartsLibStrings.hidden | rechartsLib.rechartsLibStrings.visible | rechartsLib.rechartsLibStrings.discard | rechartsLib.rechartsLibStrings.extendDomain
  type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, reactLib.reactMod.ReactNs.ReactNode]
  type LayoutType = rechartsLib.rechartsLibStrings.horizontal | rechartsLib.rechartsLibStrings.vertical
  type LegendType = IconType | rechartsLib.rechartsLibStrings.none
  type LegendValueFormatter = js.Function3[
    /* value */ js.UndefOr[js.Any], 
    /* entry */ js.UndefOr[LegendPayload], 
    /* i */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type LineChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type LineType = rechartsLib.rechartsLibStrings.basis | rechartsLib.rechartsLibStrings.basisClosed | rechartsLib.rechartsLibStrings.basisOpen | rechartsLib.rechartsLibStrings.linear | rechartsLib.rechartsLibStrings.linearClosed | rechartsLib.rechartsLibStrings.natural | rechartsLib.rechartsLibStrings.monotoneX | rechartsLib.rechartsLibStrings.monotoneY | rechartsLib.rechartsLibStrings.monotone | rechartsLib.rechartsLibStrings.step | rechartsLib.rechartsLibStrings.stepBefore | rechartsLib.rechartsLibStrings.stepAfter | d3DashShapeLib.d3DashShapeMod.CurveFactory
  type Percentage = java.lang.String
  type PickedCSSStyleDeclarationKeys = rechartsLib.rechartsLibStrings.alignmentBaseline | rechartsLib.rechartsLibStrings.baselineShift | rechartsLib.rechartsLibStrings.clip | rechartsLib.rechartsLibStrings.clipPath | rechartsLib.rechartsLibStrings.clipRule | rechartsLib.rechartsLibStrings.color | rechartsLib.rechartsLibStrings.colorInterpolationFilters | rechartsLib.rechartsLibStrings.cursor | rechartsLib.rechartsLibStrings.direction | rechartsLib.rechartsLibStrings.display | rechartsLib.rechartsLibStrings.dominantBaseline | rechartsLib.rechartsLibStrings.enableBackground | rechartsLib.rechartsLibStrings.fill | rechartsLib.rechartsLibStrings.fillRule | rechartsLib.rechartsLibStrings.filter | rechartsLib.rechartsLibStrings.floodColor | rechartsLib.rechartsLibStrings.floodOpacity | rechartsLib.rechartsLibStrings.font | rechartsLib.rechartsLibStrings.fontFamily | rechartsLib.rechartsLibStrings.fontStretch | rechartsLib.rechartsLibStrings.fontStyle | rechartsLib.rechartsLibStrings.fontVariant | rechartsLib.rechartsLibStrings.glyphOrientationHorizontal | rechartsLib.rechartsLibStrings.glyphOrientationVertical | rechartsLib.rechartsLibStrings.letterSpacing | rechartsLib.rechartsLibStrings.lightingColor | rechartsLib.rechartsLibStrings.markerEnd | rechartsLib.rechartsLibStrings.markerMid | rechartsLib.rechartsLibStrings.markerStart | rechartsLib.rechartsLibStrings.mask | rechartsLib.rechartsLibStrings.overflow | rechartsLib.rechartsLibStrings.pointerEvents | rechartsLib.rechartsLibStrings.stopColor | rechartsLib.rechartsLibStrings.strokeDasharray | rechartsLib.rechartsLibStrings.strokeLinecap | rechartsLib.rechartsLibStrings.strokeLinejoin | rechartsLib.rechartsLibStrings.textAnchor | rechartsLib.rechartsLibStrings.textDecoration | rechartsLib.rechartsLibStrings.unicodeBidi | rechartsLib.rechartsLibStrings.visibility | rechartsLib.rechartsLibStrings.writingMode | rechartsLib.rechartsLibStrings.transform
  type PolarRadiusAxisDomain = scala.Double | rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.dataMin | rechartsLib.rechartsLibStrings.dataMax
  type PositionType = rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right | rechartsLib.rechartsLibStrings.bottom | rechartsLib.rechartsLibStrings.inside | rechartsLib.rechartsLibStrings.outside | rechartsLib.rechartsLibStrings.insideLeft | rechartsLib.rechartsLibStrings.insideRight | rechartsLib.rechartsLibStrings.insideTop | rechartsLib.rechartsLibStrings.insideBottom | rechartsLib.rechartsLibStrings.insideTopLeft | rechartsLib.rechartsLibStrings.insideBottomLeft | rechartsLib.rechartsLibStrings.insideTopRight | rechartsLib.rechartsLibStrings.insideBottomRight | rechartsLib.rechartsLibStrings.insideStart | rechartsLib.rechartsLibStrings.insideEnd | rechartsLib.rechartsLibStrings.end | rechartsLib.rechartsLibStrings.center
  type RechartsFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  type ScaleCalculator = js.Function1[/* x */ scala.Double | java.lang.String, scala.Double]
  type ScaleType = rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.linear | rechartsLib.rechartsLibStrings.pow | rechartsLib.rechartsLibStrings.sqrt | rechartsLib.rechartsLibStrings.log | rechartsLib.rechartsLibStrings.identity | rechartsLib.rechartsLibStrings.time | rechartsLib.rechartsLibStrings.band | rechartsLib.rechartsLibStrings.point | rechartsLib.rechartsLibStrings.ordinal | rechartsLib.rechartsLibStrings.quantile | rechartsLib.rechartsLibStrings.quantize | rechartsLib.rechartsLibStrings.utcTime | rechartsLib.rechartsLibStrings.sequential | rechartsLib.rechartsLibStrings.threshold
  type ScatterChartProps = CategoricalChartWrapper[LayoutType] with EventAttributes
  type StackOffsetType = rechartsLib.rechartsLibStrings.sign | rechartsLib.rechartsLibStrings.expand | rechartsLib.rechartsLibStrings.none | rechartsLib.rechartsLibStrings.wiggle | rechartsLib.rechartsLibStrings.silhouette
  type TickFormatterFunction = js.Function1[/* value */ js.Any, js.Any]
  type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[js.Any]]
  type TooltipFormatter = js.Function4[
    /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), 
    /* name */ java.lang.String, 
    /* entry */ TooltipPayload, 
    /* index */ scala.Double, 
    reactLib.reactMod.ReactNs.ReactNode
  ]
}
