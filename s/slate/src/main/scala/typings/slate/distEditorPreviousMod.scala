package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPreviousOptions
import typings.slate.distInterfacesNodeMod.Node
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPreviousMod {
  
  @JSImport("slate/dist/editor/previous", "previous")
  @js.native
  val previous: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorPreviousOptions[Node]], 
    js.UndefOr[NodeEntry[Node]]
  ] = js.native
}
