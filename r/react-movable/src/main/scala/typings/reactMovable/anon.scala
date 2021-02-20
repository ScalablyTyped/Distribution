package typings.reactMovable

import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Canceled extends StObject {
    
    def canceled(position: Double): String = js.native
    
    def dropped(from: Double, to: Double): String = js.native
    
    def item(position: Double): String = js.native
    
    def lifted(position: Double): String = js.native
    
    def moved(position: Double, up: Boolean): String = js.native
  }
  object Canceled {
    
    @scala.inline
    def apply(
      canceled: Double => String,
      dropped: (Double, Double) => String,
      item: Double => String,
      lifted: Double => String,
      moved: (Double, Boolean) => String
    ): Canceled = {
      val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
      __obj.asInstanceOf[Canceled]
    }
    
    @scala.inline
    implicit class CanceledMutableBuilder[Self <: Canceled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanceled(value: Double => String): Self = StObject.set(x, "canceled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropped(value: (Double, Double) => String): Self = StObject.set(x, "dropped", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLifted(value: Double => String): Self = StObject.set(x, "lifted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoved(value: (Double, Boolean) => String): Self = StObject.set(x, "moved", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait InitialX extends StObject {
    
    var initialX: Double = js.native
    
    var initialY: Double = js.native
    
    var itemDragged: Double = js.native
    
    var itemDraggedOutOfBounds: Double = js.native
    
    var liveText: String = js.native
    
    var scrollWindow: Boolean = js.native
    
    var scrollingSpeed: Double = js.native
    
    var selectedItem: Double = js.native
    
    var targetHeight: Double = js.native
    
    var targetWidth: Double = js.native
    
    var targetX: Double = js.native
    
    var targetY: Double = js.native
  }
  object InitialX {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class InitialXMutableBuilder[Self <: InitialX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDragged(value: Double): Self = StObject.set(x, "itemDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDraggedOutOfBounds(value: Double): Self = StObject.set(x, "itemDraggedOutOfBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveText(value: String): Self = StObject.set(x, "liveText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWindow(value: Boolean): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingSpeed(value: Double): Self = StObject.set(x, "scrollingSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItem(value: Double): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHeight(value: Double): Self = StObject.set(x, "targetHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetWidth(value: Double): Self = StObject.set(x, "targetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetX(value: Double): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetY(value: Double): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ref extends StObject {
    
    var ref: RefObject[_] = js.native
  }
  object Ref {
    
    @scala.inline
    def apply(ref: RefObject[_]): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollingSpeed extends StObject {
    
    var scrollingSpeed: Double = js.native
  }
  object ScrollingSpeed {
    
    @scala.inline
    def apply(scrollingSpeed: Double): ScrollingSpeed = {
      val __obj = js.Dynamic.literal(scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollingSpeed]
    }
    
    @scala.inline
    implicit class ScrollingSpeedMutableBuilder[Self <: ScrollingSpeed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollingSpeed(value: Double): Self = StObject.set(x, "scrollingSpeed", value.asInstanceOf[js.Any])
    }
  }
}
