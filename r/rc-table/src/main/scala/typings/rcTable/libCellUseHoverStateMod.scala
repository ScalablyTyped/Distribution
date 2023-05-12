package typings.rcTable

import typings.rcTable.libHooksUseHoverMod.OnHover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCellUseHoverStateMod {
  
  @JSImport("rc-table/lib/Cell/useHoverState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rowIndex: Double, rowSpan: Double): js.Tuple2[/* hovering */ Boolean, /* onHover */ OnHover] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rowIndex.asInstanceOf[js.Any], rowSpan.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* hovering */ Boolean, /* onHover */ OnHover]]
}
