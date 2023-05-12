package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPathRefOptions
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesPathRefMod.PathRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPathRefMod {
  
  @JSImport("slate/dist/editor/path-ref", "pathRef")
  @js.native
  val pathRef: js.Function3[
    /* editor */ Editor, 
    /* path */ Path, 
    /* options */ js.UndefOr[EditorPathRefOptions], 
    PathRef
  ] = js.native
}
