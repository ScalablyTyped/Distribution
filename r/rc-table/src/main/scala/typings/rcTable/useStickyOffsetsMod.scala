package typings.rcTable

import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-table/lib/hooks/useStickyOffsets", JSImport.Namespace)
@js.native
object useStickyOffsetsMod extends js.Object {
  /**
    * Get sticky column offset width
    */
  @JSName("default")
  def default_ltr(colWidths: js.Array[Double], columCount: Double, direction: ltr): StickyOffsets = js.native
  @JSName("default")
  def default_rtl(colWidths: js.Array[Double], columCount: Double, direction: rtl): StickyOffsets = js.native
}

