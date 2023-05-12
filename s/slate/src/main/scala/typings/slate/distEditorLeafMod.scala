package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorLeafOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesNodeMod.NodeEntry
import typings.slate.distInterfacesTextMod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorLeafMod {
  
  @JSImport("slate/dist/editor/leaf", "leaf")
  @js.native
  val leaf: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorLeafOptions], 
    NodeEntry[Text]
  ] = js.native
}
