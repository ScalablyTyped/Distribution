package typings
package reactDashNativeDashSvgDashChartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSvgDashChartsMod {
  type AccessorFunction[T, U] = js.Function1[/* props */ reactDashNativeDashSvgDashChartsLib.Anon_Index[T], U]
  type GridDirection = reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsLibStrings.VERTICAL | reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsLibStrings.HORIZONTAL | reactDashNativeDashSvgDashChartsLib.reactDashNativeDashSvgDashChartsLibStrings.BOTH
  type OffsetFunction = js.Function2[
    /* series */ d3DashShapeLib.d3DashShapeMod.Series[js.Any, js.Any], 
    /* order */ js.Array[scala.Double], 
    scala.Unit
  ]
  type OrderFunction = js.Function1[
    /* series */ d3DashShapeLib.d3DashShapeMod.Series[js.Any, js.Any], 
    js.Array[scala.Double]
  ]
  type ScaleFunction = js.Function0[(ScaleType[js.Any, js.Any]) | d3DashScaleLib.d3DashScaleMod.ScaleBand[js.Any]]
  type ScaleType[Range, Output] = (d3DashScaleLib.d3DashScaleMod.ScaleLinear[Range, Output]) | (d3DashScaleLib.d3DashScaleMod.ScaleLogarithmic[Range, Output]) | (d3DashScaleLib.d3DashScaleMod.ScalePower[Range, Output]) | (d3DashScaleLib.d3DashScaleMod.ScaleTime[Range, Output])
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
