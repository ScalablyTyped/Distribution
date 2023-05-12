package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorParentOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorParentMod {
  
  @JSImport("slate/dist/editor/parent", "parent")
  @js.native
  val parent: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorParentOptions], 
    NodeEntry[Ancestor]
  ] = js.native
}
