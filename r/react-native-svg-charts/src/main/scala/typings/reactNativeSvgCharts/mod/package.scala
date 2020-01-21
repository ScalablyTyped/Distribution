package typings.reactNativeSvgCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunction[T, U] = js.Function1[/* props */ typings.reactNativeSvgCharts.mod.AccessorFunctionProps[T], U]
  type OffsetFunction = js.Function2[
    /* series */ typings.d3Shape.mod.Series[js.Any, js.Any], 
    /* order */ js.Array[scala.Double], 
    scala.Unit
  ]
  type OrderFunction = js.Function1[/* series */ typings.d3Shape.mod.Series[js.Any, js.Any], js.Array[scala.Double]]
  type ScaleFunction = js.Function0[
    (typings.reactNativeSvgCharts.mod.ScaleType[js.Any, js.Any]) | typings.d3Scale.mod.ScaleBand_[js.Any]
  ]
  type ScaleType[Range, Output] = (typings.d3Scale.mod.ScaleLinear_[Range, Output]) | (typings.d3Scale.mod.ScaleLogarithmic[Range, Output]) | (typings.d3Scale.mod.ScalePower[Range, Output]) | (typings.d3Scale.mod.ScaleTime_[Range, Output])
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
