package typings.slate

import typings.slate.anon.Split
import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesNodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeWrapNodesMod {
  
  @JSImport("slate/dist/transforms-node/wrap-nodes", "wrapNodes")
  @js.native
  val wrapNodes: js.Function3[
    /* editor */ Editor, 
    /* element */ Element, 
    /* options */ js.UndefOr[Split[Node]], 
    Unit
  ] = js.native
}
