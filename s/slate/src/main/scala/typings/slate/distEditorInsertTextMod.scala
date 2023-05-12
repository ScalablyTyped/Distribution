package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesTransformsTextMod.TextInsertTextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorInsertTextMod {
  
  @JSImport("slate/dist/editor/insert-text", "insertText")
  @js.native
  val insertText: js.Function3[
    /* editor */ Editor, 
    /* text */ String, 
    /* options */ js.UndefOr[TextInsertTextOptions], 
    Unit
  ] = js.native
}
