package typings.slateReact

import typings.slate.editorMod.BaseEditor
import typings.slateReact.reactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withReactMod {
  
  @JSImport("slate-react/dist/plugin/with-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withReact[T /* <: BaseEditor */](editor: T): T & ReactEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("withReact")(editor.asInstanceOf[js.Any]).asInstanceOf[T & ReactEditor]
}
