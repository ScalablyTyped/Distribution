package typings.recharts.mod

import typings.d3Shape.mod.CurveFactory
import typings.react.mod.ReactNode
import typings.recharts.anon.ErrorVal
import typings.recharts.anon.Height
import typings.recharts.anon.Offset
import typings.recharts.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - typings.recharts.mod.ContentRenderer[scala.Any]
  - typings.recharts.rechartsStrings.auto
  - typings.recharts.rechartsStrings.dataMin
  - typings.recharts.rechartsStrings.dataMax
*/
type AxisDomain = _AxisDomain | ContentRenderer[Any] | String | Double

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.recharts.rechartsStrings.preserveStart
  - typings.recharts.rechartsStrings.preserveEnd
  - typings.recharts.rechartsStrings.preserveStartEnd
*/
type AxisInterval = _AxisInterval | Double

type BBoxUpdateCallback = js.Function1[/* box */ Height, Unit]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.recharts.rechartsStrings.auto
  - typings.recharts.rechartsStrings.dataMin
  - typings.recharts.rechartsStrings.dataMax
*/
type BaseValueType = _BaseValueType | Double

type ContentRenderer[P] = js.Function1[/* props */ P, ReactNode]

type DataKey = String | Double | (js.Function1[/* dataObject */ Any, String | Double | (js.Tuple2[Double, Double]) | Null])

type DataPointFormatter = js.Function2[/* entry */ Any, /* dataKey */ DataKey, ErrorVal]

type HorizontalCoordinatesGenerator = js.Function1[/* arg */ Offset, js.Array[Double]]

type ItemSorter[T] = js.Function2[/* a */ T, /* b */ T, Double]

type LabelFormatter = js.Function1[/* label */ String | Double, ReactNode]

type LegendValueFormatter = js.Function3[
/* value */ js.UndefOr[
  /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
], 
/* entry */ js.UndefOr[LegendPayload], 
/* i */ js.UndefOr[Double], 
Any]

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
type LineType = _LineType | CurveFactory

type Percentage = String

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.recharts.rechartsStrings.auto
  - typings.recharts.rechartsStrings.dataMin
  - typings.recharts.rechartsStrings.dataMax
*/
type PolarRadiusAxisDomain = _PolarRadiusAxisDomain | Double

type ScaleCalculator = js.Function1[/* x */ Double | String, Double]

type TickFormatterFunction = js.Function1[/* value */ Any, Any]

type TickGeneratorFunction = js.Function1[/* noTicksProps */ js.Object, js.Array[Any]]

type TooltipFormatter = js.Function4[
/* value */ String | Double | (js.Array[String | Double]), 
/* name */ String, 
/* entry */ TooltipPayload, 
/* index */ Double, 
ReactNode]

type VerticalCoordinatesGenerator = js.Function1[/* arg */ Width, js.Array[Double]]
