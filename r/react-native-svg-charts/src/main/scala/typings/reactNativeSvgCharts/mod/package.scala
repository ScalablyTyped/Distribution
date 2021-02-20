package typings.reactNativeSvgCharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type ScaleType[Range, Output] = (typings.d3Scale.mod.ScaleLinear_[Range, Output, scala.Nothing]) | (typings.d3Scale.mod.ScaleLogarithmic[Range, Output, scala.Nothing]) | (typings.d3Scale.mod.ScalePower[Range, Output, scala.Nothing]) | (typings.d3Scale.mod.ScaleTime_[Range, Output, scala.Nothing])
  
  type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
