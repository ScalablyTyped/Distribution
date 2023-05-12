package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesTransformsTextMod.TextDeleteOptions
import typings.slate.distInterfacesTransformsTextMod.TextInsertFragmentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsTextMod {
  
  @JSImport("slate/dist/transforms-text", "deleteText")
  @js.native
  val deleteText: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[TextDeleteOptions], Unit] = js.native
  
  @JSImport("slate/dist/transforms-text", "insertFragment")
  @js.native
  val insertFragment: js.Function3[
    /* editor */ Editor, 
    /* fragment */ js.Array[Node], 
    /* options */ js.UndefOr[TextInsertFragmentOptions], 
    Unit
  ] = js.native
}
