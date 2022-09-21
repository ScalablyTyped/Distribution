package typings.reactNativeSvgCharts.mod

import typings.d3Scale.mod.ScaleBand_
import typings.d3Scale.mod.ScaleLinear_
import typings.d3Scale.mod.ScaleLogarithmic
import typings.d3Scale.mod.ScalePower
import typings.d3Scale.mod.ScaleTime_
import typings.d3Shape.mod.Series
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessorFunction[T, U] = js.Function1[/* props */ AccessorFunctionProps[T], U]

type OffsetFunction = js.Function2[/* series */ Series[Any, Any], /* order */ js.Array[Double], Unit]

type OrderFunction = js.Function1[/* series */ Series[Any, Any], js.Array[Double]]

type ScaleFunction = js.Function0[(ScaleType[Any, Any]) | ScaleBand_[Any]]

type ScaleType[Range, Output] = (ScaleLinear_[Range, Output, scala.Nothing]) | (ScaleLogarithmic[Range, Output, scala.Nothing]) | (ScalePower[Range, Output, scala.Nothing]) | (ScaleTime_[Range, Output, scala.Nothing])

type SortFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
