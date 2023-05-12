package typings.slate

import typings.slate.anon.Mode
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeUnsetNodesMod {
  
  @JSImport("slate/dist/transforms-node/unset-nodes", "unsetNodes")
  @js.native
  val unsetNodes: js.Function3[
    /* editor */ Editor, 
    /* props */ String | js.Array[String], 
    /* options */ js.UndefOr[Mode[Node]], 
    Unit
  ] = js.native
}
