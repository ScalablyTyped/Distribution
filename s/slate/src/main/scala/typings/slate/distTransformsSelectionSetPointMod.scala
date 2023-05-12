package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesTransformsSelectionMod.SelectionSetPointOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsSelectionSetPointMod {
  
  @JSImport("slate/dist/transforms-selection/set-point", "setPoint")
  @js.native
  val setPoint: js.Function3[
    /* editor */ Editor, 
    /* props */ Partial[Point], 
    /* options */ js.UndefOr[SelectionSetPointOptions], 
    Unit
  ] = js.native
}
