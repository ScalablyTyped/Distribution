package typings.reactDashChartjsDash2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashChartjsDash2Mod {
  import typings.std.HTMLElement

  type ChartData[T /* <: typings.chartDotJs.chartDotJsMod.ChartData */] = ChartDataFunction[T] | T
  type ChartDataFunction[T /* <: typings.chartDotJs.chartDotJsMod.ChartData */] = js.Function1[/* element */ HTMLElement, T]
}
