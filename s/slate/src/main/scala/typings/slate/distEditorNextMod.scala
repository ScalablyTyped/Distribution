package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorNextOptions
import typings.slate.distInterfacesNodeMod.Descendant
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorNextMod {
  
  @JSImport("slate/dist/editor/next", "next")
  @js.native
  val next: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorNextOptions[Descendant]], 
    js.UndefOr[NodeEntry[Descendant]]
  ] = js.native
}
