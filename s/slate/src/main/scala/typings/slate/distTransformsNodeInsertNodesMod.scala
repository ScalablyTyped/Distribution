package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeInsertNodesMod {
  
  @JSImport("slate/dist/transforms-node/insert-nodes", "insertNodes")
  @js.native
  val insertNodes: js.Function3[
    /* editor */ Editor, 
    /* nodes */ Node | js.Array[Node], 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
}
