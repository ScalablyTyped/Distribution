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
  inline def default(colWidths: js.Array[Double], columnCount: Double, direction: ltr | rtl): StickyOffsets = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(colWidths.asInstanceOf[js.Any], columnCount.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[StickyOffsets]
}
