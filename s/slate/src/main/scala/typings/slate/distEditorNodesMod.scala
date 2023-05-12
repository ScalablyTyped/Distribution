package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorNodesOptions
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorNodesMod {
  
  @JSImport("slate/dist/editor/nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodes[T /* <: Node */](editor: Editor): Generator[NodeEntry[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
  inline def nodes[T /* <: Node */](editor: Editor, options: EditorNodesOptions[T]): Generator[NodeEntry[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(editor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[NodeEntry[T], Unit, Unit]]
}
