package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorAfterOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorAfterMod {
  
  @JSImport("slate/dist/editor/after", "after")
  @js.native
  val after: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorAfterOptions], 
    js.UndefOr[Point]
  ] = js.native
}
