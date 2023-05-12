package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesTransformsSelectionMod.SelectionCollapseOptions
import typings.slate.distInterfacesTransformsSelectionMod.SelectionMoveOptions
import typings.slate.distInterfacesTransformsSelectionMod.SelectionSetPointOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsSelectionMod {
  
  @JSImport("slate/dist/transforms-selection", "collapse")
  @js.native
  val collapse: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[SelectionCollapseOptions], Unit] = js.native
  
  @JSImport("slate/dist/transforms-selection", "deselect")
  @js.native
  val deselect: js.Function1[/* editor */ Editor, Unit] = js.native
  
  @JSImport("slate/dist/transforms-selection", "move")
  @js.native
  val move: js.Function2[/* editor */ Editor, /* options */ js.UndefOr[SelectionMoveOptions], Unit] = js.native
  
  @JSImport("slate/dist/transforms-selection", "select")
  @js.native
  val select: js.Function2[/* editor */ Editor, /* target */ Location, Unit] = js.native
  
  @JSImport("slate/dist/transforms-selection", "setPoint")
  @js.native
  val setPoint: js.Function3[
    /* editor */ Editor, 
    /* props */ Partial[Point], 
    /* options */ js.UndefOr[SelectionSetPointOptions], 
    Unit
  ] = js.native
  
  @JSImport("slate/dist/transforms-selection", "setSelection")
  @js.native
  val setSelection: js.Function2[/* editor */ Editor, /* props */ Partial[Range], Unit] = js.native
}
