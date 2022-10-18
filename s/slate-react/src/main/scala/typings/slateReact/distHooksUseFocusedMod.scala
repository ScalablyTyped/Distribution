package typings.slateReact

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseFocusedMod {
  
  @JSImport("slate-react/dist/hooks/use-focused", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-focused", "FocusedContext")
  @js.native
  val FocusedContext: Context[Boolean] = js.native
  
  inline def useFocused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocused")().asInstanceOf[Boolean]
}
