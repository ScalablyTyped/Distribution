package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorInsertNodeMod {
  
  @JSImport("slate/dist/editor/insert-node", "insertNode")
  @js.native
  val insertNode: js.Function3[
    /* editor */ Editor, 
    /* node */ Node, 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
}
