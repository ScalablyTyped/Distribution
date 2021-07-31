package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    }
  }
  
  trait Animated extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Animated {
    
    @scala.inline
    def apply(): Animated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animated]
    }
    
    @scala.inline
    implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait AnimatedBoolean extends StObject {
    
    var animated: Boolean
  }
  object AnimatedBoolean {
    
    @scala.inline
    def apply(animated: Boolean): AnimatedBoolean = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimatedBoolean]
    }
    
    @scala.inline
    implicit class AnimatedBooleanMutableBuilder[Self <: AnimatedBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Double] = js.undefined
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait BottomHeight extends StObject {
    
    var bottom: Double
    
    var height: Double
  }
  object BottomHeight {
    
    @scala.inline
    def apply(bottom: Double, height: Double): BottomHeight = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomHeight]
    }
    
    @scala.inline
    implicit class BottomHeightMutableBuilder[Self <: BottomHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var top: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, top: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var index: Double
    
    var viewOffset: js.UndefOr[Double] = js.undefined
    
    var viewPosition: js.UndefOr[Double] = js.undefined
  }
  object Index {
    
    @scala.inline
    def apply(index: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
      
      @scala.inline
      def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
    }
  }
  
  trait Item[ItemT] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var item: ItemT
    
    var viewPosition: js.UndefOr[Double] = js.undefined
  }
  object Item {
    
    @scala.inline
    def apply[ItemT](item: ItemT): Item[ItemT] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[ItemT]]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item[?], ItemT] (val x: Self & Item[ItemT]) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var width: Double
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, width: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var offset: Double
  }
  object Offset {
    
    @scala.inline
    def apply(offset: Double): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Right extends StObject {
    
    var right: Double
    
    var width: Double
  }
  object Right {
    
    @scala.inline
    def apply(right: Double, width: Double): Right = {
      val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Right]
    }
    
    @scala.inline
    implicit class RightMutableBuilder[Self <: Right] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
