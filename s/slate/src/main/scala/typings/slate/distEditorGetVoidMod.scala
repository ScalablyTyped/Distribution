package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorVoidOptions
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesNodeMod.NodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorGetVoidMod {
  
  @JSImport("slate/dist/editor/get-void", "getVoid")
  @js.native
  val getVoid: js.Function2[
    /* editor */ Editor, 
    /* options */ js.UndefOr[EditorVoidOptions], 
    js.UndefOr[NodeEntry[Element]]
  ] = js.native
}
