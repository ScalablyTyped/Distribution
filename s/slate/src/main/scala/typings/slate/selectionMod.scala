package typings.slate

import typings.slate.editorMod.Editor
import typings.slate.locationMod.Location
import typings.slate.pointMod.Point
import typings.slate.rangeMod.Range
import typings.slate.typesMod.MoveUnit
import typings.slate.typesMod.SelectionEdge
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @js.native
  trait SelectionTransforms extends StObject {
    
    def collapse(editor: Editor): Unit = js.native
    def collapse(editor: Editor, options: SelectionCollapseOptions): Unit = js.native
    
    def deselect(editor: Editor): Unit = js.native
    
    def move(editor: Editor): Unit = js.native
    def move(editor: Editor, options: SelectionMoveOptions): Unit = js.native
    
    def select(editor: Editor, target: Location): Unit = js.native
    
    def setPoint(editor: Editor, props: Partial[Point]): Unit = js.native
    def setPoint(editor: Editor, props: Partial[Point], options: SelectionSetPointOptions): Unit = js.native
    
    def setSelection(editor: Editor, props: Partial[Range]): Unit = js.native
  }
  @JSImport("slate/dist/transforms/selection", "SelectionTransforms")
  @js.native
  val SelectionTransforms: typings.slate.selectionMod.SelectionTransforms = js.native
  
  trait SelectionCollapseOptions extends StObject {
    
    var edge: js.UndefOr[SelectionEdge] = js.undefined
  }
  object SelectionCollapseOptions {
    
    inline def apply(): SelectionCollapseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionCollapseOptions]
    }
    
    extension [Self <: SelectionCollapseOptions](x: Self) {
      
      inline def setEdge(value: SelectionEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    }
  }
  
  trait SelectionMoveOptions extends StObject {
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var edge: js.UndefOr[SelectionEdge] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var unit: js.UndefOr[MoveUnit] = js.undefined
  }
  object SelectionMoveOptions {
    
    inline def apply(): SelectionMoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionMoveOptions]
    }
    
    extension [Self <: SelectionMoveOptions](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setEdge(value: SelectionEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setUnit(value: MoveUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  trait SelectionSetPointOptions extends StObject {
    
    var edge: js.UndefOr[SelectionEdge] = js.undefined
  }
  object SelectionSetPointOptions {
    
    inline def apply(): SelectionSetPointOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSetPointOptions]
    }
    
    extension [Self <: SelectionSetPointOptions](x: Self) {
      
      inline def setEdge(value: SelectionEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    }
  }
}
