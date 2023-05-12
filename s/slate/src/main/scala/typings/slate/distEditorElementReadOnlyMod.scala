package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorElementReadOnlyOptions
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorElementReadOnlyMod {
  
  @JSImport("slate/dist/editor/element-read-only", "elementReadOnly")
  @js.native
  val elementReadOnly: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorElementReadOnlyOptions], 
    js.UndefOr[NodeEntry[Element]]
  ] = js.native
}
