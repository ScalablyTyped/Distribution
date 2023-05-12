package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesTransformsTextMod.TextInsertFragmentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsTextInsertFragmentMod {
  
  @JSImport("slate/dist/transforms-text/insert-fragment", "insertFragment")
  @js.native
  val insertFragment: js.Function3[
    /* editor */ Editor, 
    /* fragment */ js.Array[Node], 
    /* options */ js.UndefOr[TextInsertFragmentOptions], 
    Unit
  ] = js.native
}
