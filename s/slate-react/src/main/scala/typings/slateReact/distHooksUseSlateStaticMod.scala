package typings.slateReact

import typings.react.mod.Context
import typings.slate.distInterfacesEditorMod.Editor
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseSlateStaticMod {
  
  @JSImport("slate-react/dist/hooks/use-slate-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-slate-static", "EditorContext")
  @js.native
  val EditorContext: Context[ReactEditor | Null] = js.native
  
  inline def useSlateStatic(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlateStatic")().asInstanceOf[Editor]
}
