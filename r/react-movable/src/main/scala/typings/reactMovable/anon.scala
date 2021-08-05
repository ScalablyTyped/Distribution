package typings.reactMovable

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Canceled extends StObject {
    
    def canceled(position: Double): String
    
    def dropped(from: Double, to: Double): String
    
    def item(position: Double): String
    
    def lifted(position: Double): String
    
    def moved(position: Double, up: Boolean): String
  }
  object Canceled {
    
    inline def apply(
      canceled: Double => String,
      dropped: (Double, Double) => String,
      item: Double => String,
      lifted: Double => String,
      moved: (Double, Boolean) => String
    ): Canceled = {
      val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
      __obj.asInstanceOf[Canceled]
    }
    
    extension [Self <: Canceled](x: Self) {
      
      inline def setCanceled(value: Double => String): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      inline def setDropped(value: (Double, Double) => String): Self = StObject.set(x, "dropped", js.Any.fromFunction2(value))
      
      inline def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLifted(value: Double => String): Self = StObject.set(x, "lifted", js.Any.fromFunction1(value))
      
      inline def setMoved(value: (Double, Boolean) => String): Self = StObject.set(x, "moved", js.Any.fromFunction2(value))
    }
  }
  
  trait InitialX extends StObject {
    
    var initialX: Double
    
    var initialY: Double
    
    var itemDragged: Double
    
    var itemDraggedOutOfBounds: Double
    
    var liveText: String
    
    var scrollWindow: Boolean
    
    var scrollingSpeed: Double
    
    var selectedItem: Double
    
    var targetHeight: Double
    
    var targetWidth: Double
    
    var targetX: Double
    
    var targetY: Double
  }
  object InitialX {
    
    inline def apply(
      initialX: Double,
      initialY: Double,
      itemDragged: Double,
      itemDraggedOutOfBounds: Double,
      liveText: String,
      scrollWindow: Boolean,
      scrollingSpeed: Double,
      selectedItem: Double,
      targetHeight: Double,
      targetWidth: Double,
      targetX: Double,
      targetY: Double
    ): InitialX = {
      val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], itemDragged = itemDragged.asInstanceOf[js.Any], itemDraggedOutOfBounds = itemDraggedOutOfBounds.asInstanceOf[js.Any], liveText = liveText.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], targetX = targetX.asInstanceOf[js.Any], targetY = targetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialX]
    }
    
    extension [Self <: InitialX](x: Self) {
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      inline def setItemDragged(value: Double): Self = StObject.set(x, "itemDragged", value.asInstanceOf[js.Any])
      
      inline def setItemDraggedOutOfBounds(value: Double): Self = StObject.set(x, "itemDraggedOutOfBounds", value.asInstanceOf[js.Any])
      
      inline def setLiveText(value: String): Self = StObject.set(x, "liveText", value.asInstanceOf[js.Any])
      
      inline def setScrollWindow(value: Boolean): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
      
      inline def setScrollingSpeed(value: Double): Self = StObject.set(x, "scrollingSpeed", value.asInstanceOf[js.Any])
      
      inline def setSelectedItem(value: Double): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      inline def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
      
      inline def setTargetX(value: Double): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      inline def setTargetY(value: Double): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: RefObject[js.Any]
  }
  object Ref {
    
    inline def apply(ref: RefObject[js.Any]): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: RefObject[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollingSpeed extends StObject {
    
    var scrollingSpeed: Double
  }
  object ScrollingSpeed {
    
    inline def apply(scrollingSpeed: Double): ScrollingSpeed = {
      val __obj = js.Dynamic.literal(scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollingSpeed]
    }
    
    extension [Self <: ScrollingSpeed](x: Self) {
      
      inline def setScrollingSpeed(value: Double): Self = StObject.set(x, "scrollingSpeed", value.asInstanceOf[js.Any])
    }
  }
}
