package typings.rcTable.fixUtilMod

import typings.rcTable.anon.Fixed
import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/utils/fixUtil", "getCellFixedInfo")
@js.native
object getCellFixedInfo_ltr extends js.Object {
  def apply(
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: ltr
  ): FixedInfo = js.native
}

