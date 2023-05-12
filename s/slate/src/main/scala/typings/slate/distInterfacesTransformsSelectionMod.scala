package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesLocationMod.Location
import typings.slate.distInterfacesPointMod.Point
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distTypesTypesMod.MoveUnit
import typings.slate.distTypesTypesMod.SelectionEdge
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesTransformsSelectionMod {
  
  @js.native
  trait SelectionTransforms extends StObject {
    
    /**
      * Collapse the selection.
      */
    def collapse(editor: Editor): Unit = js.native
    def collapse(editor: Editor, options: SelectionCollapseOptions): Unit = js.native
    
    /**
      * Unset the selection.
      */
    def deselect(editor: Editor): Unit = js.native
    
    /**
      * Move the selection's point forward or backward.
      */
    def move(editor: Editor): Unit = js.native
    def move(editor: Editor, options: SelectionMoveOptions): Unit = js.native
    
    /**
      * Set the selection to a new value.
      */
    def select(editor: Editor, target: Location): Unit = js.native
    
    /**
      * Set new properties on one of the selection's points.
      */
    def setPoint(editor: Editor, props: Partial[Point]): Unit = js.native
    def setPoint(editor: Editor, props: Partial[Point], options: SelectionSetPointOptions): Unit = js.native
    
    /**
      * Set new properties on the selection.
      */
    def setSelection(editor: Editor, props: Partial[Range]): Unit = js.native
  }
  @JSImport("slate/dist/interfaces/transforms/selection", "SelectionTransforms")
  @js.native
  val SelectionTransforms: typings.slate.distInterfacesTransformsSelectionMod.SelectionTransforms = js.native
  
  trait SelectionCollapseOptions extends StObject {
    
    var edge: js.UndefOr[SelectionEdge] = js.undefined
  }
  object SelectionCollapseOptions {
    
    inline def apply(): SelectionCollapseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionCollapseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionCollapseOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionMoveOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionSetPointOptions] (val x: Self) extends AnyVal {
      
      inline def setEdge(value: SelectionEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    }
  }
}
