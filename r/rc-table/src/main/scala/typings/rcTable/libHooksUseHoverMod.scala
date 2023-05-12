package typings.rcTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseHoverMod {
  
  @JSImport("rc-table/lib/hooks/useHover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple3[/* startRow */ Double, /* endRow */ Double, /* onHover */ OnHover] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple3[/* startRow */ Double, /* endRow */ Double, /* onHover */ OnHover]]
  
  type OnHover = js.Function2[/* start */ Double, /* end */ Double, Unit]
}
