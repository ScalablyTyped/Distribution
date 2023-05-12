package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorStringOptions
import typings.slate.distInterfacesLocationMod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorStringMod {
  
  @JSImport("slate/dist/editor/string", "string")
  @js.native
  val string: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorStringOptions], 
    String
  ] = js.native
}
