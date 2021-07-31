package typings.rcTable

import typings.rcTable.interfaceMod.StickyOffsets
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStickyOffsetsMod {
  
  @JSImport("rc-table/lib/hooks/useStickyOffsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get sticky column offset width
    */
  @scala.inline
  def default_ltr(colWidths: js.Array[Double], columCount: Double, direction: ltr): StickyOffsets = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colWidths.asInstanceOf[js.Any], columCount.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StickyOffsets]
  
  @scala.inline
  def default_rtl(colWidths: js.Array[Double], columCount: Double, direction: rtl): StickyOffsets = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colWidths.asInstanceOf[js.Any], columCount.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StickyOffsets]
}
