package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesEditorMod.EditorPointOptions
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEditorPointMod {
  
  @JSImport("slate/dist/editor/point", "point")
  @js.native
  val point: js.Function3[
    /* editor */ Editor, 
    /* at */ Location, 
    /* options */ js.UndefOr[EditorPointOptions], 
    Point
  ] = js.native
}
