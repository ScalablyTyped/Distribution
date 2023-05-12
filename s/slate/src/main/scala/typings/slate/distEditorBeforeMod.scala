package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorBeforeOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorBeforeMod {
  
  @JSImport("slate/dist/editor/before", "before")
  @js.native
  val before: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorBeforeOptions], 
    js.UndefOr[Point]
  ] = js.native
}
