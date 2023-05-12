package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPathOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPathMod {
  
  @JSImport("slate/dist/editor/path", "path")
  @js.native
  val path: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorPathOptions], 
    Path
  ] = js.native
}
