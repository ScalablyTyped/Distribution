package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorLevelsOptions
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorLevelsMod {
  
  @JSImport("slate/dist/editor/levels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def levels[T /* <: Node */](editor: Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def levels[T /* <: Node */](editor: Editor, options: EditorLevelsOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("levels")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
}
