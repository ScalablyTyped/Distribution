package typings.rcTable.fixUtilMod

import typings.rcTable.AnonFixed
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/fixUtil", "getCellFixedInfo")
@js.native
object getCellFixedInfo_ltr extends js.Object {
  def apply(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[AnonFixed],
    stickyOffsets: StickyOffsets,
    direction: ltr
  ): FixedInfo = js.native
}

