package typings.rrule.monthinfoMod

import typings.rrule.typesMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/iterinfo/monthinfo", "rebuildMonth")
@js.native
object rebuildMonth extends js.Object {
  def apply(
    year: Double,
    month: Double,
    yearlen: Double,
    mrange: js.Array[Double],
    wdaymask: js.Array[Double],
    options: ParsedOptions
  ): MonthInfo = js.native
}

