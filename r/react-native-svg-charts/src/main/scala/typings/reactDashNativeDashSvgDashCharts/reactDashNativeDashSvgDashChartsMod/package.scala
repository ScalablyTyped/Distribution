package typings.reactDashNativeDashSvgDashCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSvgDashChartsMod {
  import typings.d3DashScale.d3DashScaleMod.ScaleBand
  import typings.d3DashScale.d3DashScaleMod.ScaleLinear
  import typings.d3DashScale.d3DashScaleMod.ScaleLogarithmic
  import typings.d3DashScale.d3DashScaleMod.ScalePower
  import typings.d3DashScale.d3DashScaleMod.ScaleTime
  import typings.d3DashShape.d3DashShapeMod.Series
  import typings.reactDashNativeDashSvgDashCharts.Anon_Index

  type AccessorFunction[T, U] = js.Function1[/* props */ Anon_Index[T], U]
  type OffsetFunction = js.Function2[/* series */ Series[js.Any, js.Any], /* order */ js.Array[Double], Unit]
  type OrderFunction = js.Function1[/* series */ Series[js.Any, js.Any], js.Array[Double]]
  type ScaleFunction = js.Function0[(ScaleType[js.Any, js.Any]) | ScaleBand[js.Any]]
  type ScaleType[Range, Output] = (ScaleLinear[Range, Output]) | (ScaleLogarithmic[Range, Output]) | (ScalePower[Range, Output]) | (ScaleTime[Range, Output])
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
