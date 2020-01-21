package typings.reactChartjs2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChartData[T /* <: typings.chartJs.mod.ChartData */] = typings.reactChartjs2.mod.ChartDataFunction[T] | T
  type ChartDataFunction[T /* <: typings.chartJs.mod.ChartData */] = js.Function1[/* element */ typings.std.HTMLElement, T]
}
