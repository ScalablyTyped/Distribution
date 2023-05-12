package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMatchPathMod {
  
  @JSImport("slate/dist/utils/match-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchPath(editor: Editor, path: Path): js.Function1[/* node */ Node, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(editor.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ Node, Boolean]]
}
