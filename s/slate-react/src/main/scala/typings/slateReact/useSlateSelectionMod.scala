package typings.slateReact

import typings.slate.editorMod.BaseSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSlateSelectionMod {
  
  @JSImport("slate-react/dist/hooks/use-slate-selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSlateSelection(): BaseSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateSelection")().asInstanceOf[BaseSelection]
}
