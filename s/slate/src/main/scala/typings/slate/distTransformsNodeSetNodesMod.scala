package typings.slate

import typings.slate.anon.Compare
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeSetNodesMod {
  
  @JSImport("slate/dist/transforms-node/set-nodes", "setNodes")
  @js.native
  val setNodes: js.Function3[
    /* editor */ Editor, 
    /* props */ Partial[Node], 
    /* options */ js.UndefOr[Compare[Node]], 
    Unit
  ] = js.native
}
