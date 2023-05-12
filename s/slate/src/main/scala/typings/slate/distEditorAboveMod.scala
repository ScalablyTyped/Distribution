package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorAboveOptions
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorAboveMod {
  
  @JSImport("slate/dist/editor/above", "above")
  @js.native
  val above: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorAboveOptions[Ancestor]], 
    js.UndefOr[NodeEntry[Ancestor]]
  ] = js.native
}
