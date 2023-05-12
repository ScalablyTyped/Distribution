package typings.slate

import typings.slate.anon.Always
import typings.slate.anon.At
import typings.slate.anon.Compare
import typings.slate.anon.Hanging
import typings.slate.anon.Match
import typings.slate.anon.Mode
import typings.slate.anon.Split
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesTransformsNodeMod.NodeInsertNodesOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeMod {
  
  @JSImport("slate/dist/transforms-node", "insertNodes")
  @js.native
  val insertNodes: js.Function3[
    /* editor */ Editor, 
    /* nodes */ Node | js.Array[Node], 
    /* options */ js.UndefOr[NodeInsertNodesOptions[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/transforms-node", "liftNodes")
  @js.native
  val liftNodes: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[At[Node]], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "mergeNodes")
  @js.native
  val mergeNodes: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[Hanging[Node]], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "moveNodes")
  @js.native
  val moveNodes: js.Function2[/* editor */ Editor, /* options */ Match[Node], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "removeNodes")
  @js.native
  val removeNodes: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[Hanging[Node]], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "setNodes")
  @js.native
  val setNodes: js.Function3[
    /* editor */ Editor, 
    /* props */ Partial[Node], 
    /* options */ js.UndefOr[Compare[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/transforms-node", "splitNodes")
  @js.native
  val splitNodes: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[Always[Node]], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "unsetNodes")
  @js.native
  val unsetNodes: js.Function3[
    /* editor */ Editor, 
    /* props */ String | js.Array[String], 
    /* options */ js.UndefOr[Mode[Node]], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/transforms-node", "unwrapNodes")
  @js.native
  val unwrapNodes: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[Split[Node]], Unit] = js.native
  
  @JSImport("slate/dist/transforms-node", "wrapNodes")
  @js.native
  val wrapNodes: js.Function3[
    /* editor */ Editor, 
    /* element */ Element, 
    /* options */ js.UndefOr[Split[Node]], 
    Unit
  ] = js.native
}
