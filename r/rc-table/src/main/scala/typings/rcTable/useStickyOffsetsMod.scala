package typings.rcTable

import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStickyOffsetsMod {
  
  /**
    * Get sticky column offset width
    */
  @JSImport("rc-table/lib/hooks/useStickyOffsets", JSImport.Default)
  @js.native
  def default_ltr(colWidths: js.Array[Double], columCount: Double, direction: ltr): StickyOffsets = js.native
  @JSImport("rc-table/lib/hooks/useStickyOffsets", JSImport.Default)
  @js.native
  def default_rtl(colWidths: js.Array[Double], columCount: Double, direction: rtl): StickyOffsets = js.native
}
