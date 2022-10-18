package typings.slateReact

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseReadOnlyMod {
  
  @JSImport("slate-react/dist/hooks/use-read-only", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-read-only", "ReadOnlyContext")
  @js.native
  val ReadOnlyContext: Context[Boolean] = js.native
  
  inline def useReadOnly(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useReadOnly")().asInstanceOf[Boolean]
}
