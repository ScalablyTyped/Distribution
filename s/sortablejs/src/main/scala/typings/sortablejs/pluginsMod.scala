package typings.sortablejs

import typings.sortablejs.mod.SortableEvent
import typings.sortablejs.mod.^
import typings.sortablejs.sortablejsStrings.continue
import typings.std.Event
import typings.std.HTMLElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("sortablejs/plugins", "AutoScrollPlugin")
  @js.native
  class AutoScrollPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "MultiDragPlugin")
  @js.native
  class MultiDragPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "OnSpillPlugin")
  @js.native
  class OnSpillPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "SortablePlugin")
  @js.native
  class SortablePlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "SwapPlugin")
  @js.native
  class SwapPlugin () extends StObject
  
  trait AutoScrollOptions extends StObject {
    
    /**
      * apply autoscroll to all parent elements, allowing for easier movement.
      */
    var bubbleScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Enable the plugin. Can be `HTMLElement`.
      */
    var scroll: js.UndefOr[Boolean | HTMLElement] = js.undefined
    
    /**
      * if you have custom scrollbar scrollFn may be used for autoscrolling.
      */
    var scrollFn: js.UndefOr[
        js.ThisFunction5[
          /* this */ ^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
      ] = js.undefined
    
    /**
      * `px`, how near the mouse must be to an edge to start scrolling.
      */
    var scrollSensitivity: js.UndefOr[Double] = js.undefined
    
    /**
      * `px`, speed of the scrolling.`
      */
    var scrollSpeed: js.UndefOr[Double] = js.undefined
  }
  object AutoScrollOptions {
    
    inline def apply(): AutoScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScrollOptions]
    }
    
    extension [Self <: AutoScrollOptions](x: Self) {
      
      inline def setBubbleScroll(value: Boolean): Self = StObject.set(x, "bubbleScroll", value.asInstanceOf[js.Any])
      
      inline def setBubbleScrollUndefined: Self = StObject.set(x, "bubbleScroll", js.undefined)
      
      inline def setScroll(value: Boolean | HTMLElement): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollFn(
        value: js.ThisFunction5[
              /* this */ ^, 
              /* offsetX */ Double, 
              /* offsetY */ Double, 
              /* originalEvent */ Event, 
              /* touchEvt */ TouchEvent, 
              /* hoverTargetEl */ HTMLElement, 
              continue | Unit
            ]
      ): Self = StObject.set(x, "scrollFn", value.asInstanceOf[js.Any])
      
      inline def setScrollFnUndefined: Self = StObject.set(x, "scrollFn", js.undefined)
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  trait MultiDragOptions extends StObject {
    
    /**
      * Enable the plugin
      */
    var multiDrag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Key that must be down for items to be selected
      */
    // todo: create a type
    // todo: check source code for type
    var multiDragKey: js.UndefOr[Null] = js.undefined
    
    /**
      * Called when an item is deselected
      */
    var onDeselect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Called when an item is selected
      */
    var onSelect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
    
    /**
      * Class name for selected item
      */
    var selectedClass: js.UndefOr[String] = js.undefined
  }
  object MultiDragOptions {
    
    inline def apply(): MultiDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiDragOptions]
    }
    
    extension [Self <: MultiDragOptions](x: Self) {
      
      inline def setMultiDrag(value: Boolean): Self = StObject.set(x, "multiDrag", value.asInstanceOf[js.Any])
      
      inline def setMultiDragUndefined: Self = StObject.set(x, "multiDrag", js.undefined)
      
      inline def setOnDeselect(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnSelect(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      inline def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
    }
  }
  
  trait OnSpillOptions extends StObject {
    
    /**
      * Called when either `revertOnSpill` or `RemoveOnSpill` plugins are enabled.
      */
    var onSpill: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.undefined
    
    /**
      * This plugin, when enabled,
      * will cause the dragged item to be removed from the DOM if it is *spilled*
      * (ie. it is dropped outside of a valid Sortable drop target)
      */
    var removeOnSpill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This plugin, when enabled,
      * will cause the dragged item to be reverted to it's original position if it is *spilled*
      * (ie. it is dropped outside of a valid Sortable drop target)
      */
    var revertOnSpill: js.UndefOr[Boolean] = js.undefined
  }
  object OnSpillOptions {
    
    inline def apply(): OnSpillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSpillOptions]
    }
    
    extension [Self <: OnSpillOptions](x: Self) {
      
      inline def setOnSpill(value: /* evt */ SortableEvent => Unit): Self = StObject.set(x, "onSpill", js.Any.fromFunction1(value))
      
      inline def setOnSpillUndefined: Self = StObject.set(x, "onSpill", js.undefined)
      
      inline def setRemoveOnSpill(value: Boolean): Self = StObject.set(x, "removeOnSpill", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnSpillUndefined: Self = StObject.set(x, "removeOnSpill", js.undefined)
      
      inline def setRevertOnSpill(value: Boolean): Self = StObject.set(x, "revertOnSpill", value.asInstanceOf[js.Any])
      
      inline def setRevertOnSpillUndefined: Self = StObject.set(x, "revertOnSpill", js.undefined)
    }
  }
  
  trait SwapOptions extends StObject {
    
    /**
      * Enable swap mode
      */
    var swap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class name for swap item (if swap mode is enabled)
      */
    var swapClass: js.UndefOr[String] = js.undefined
  }
  object SwapOptions {
    
    inline def apply(): SwapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwapOptions]
    }
    
    extension [Self <: SwapOptions](x: Self) {
      
      inline def setSwap(value: Boolean): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      inline def setSwapClass(value: String): Self = StObject.set(x, "swapClass", value.asInstanceOf[js.Any])
      
      inline def setSwapClassUndefined: Self = StObject.set(x, "swapClass", js.undefined)
      
      inline def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
    }
  }
}
