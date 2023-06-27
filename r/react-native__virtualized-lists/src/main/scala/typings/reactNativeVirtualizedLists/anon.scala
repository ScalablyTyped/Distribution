package typings.reactNativeVirtualizedLists

import typings.reactNativeVirtualizedLists.listsVirtualizedListMod.ViewToken
import typings.reactNativeVirtualizedLists.reactNativeVirtualizedListsStrings.leading
import typings.reactNativeVirtualizedLists.reactNativeVirtualizedListsStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animated extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
  }
  object Animated {
    
    inline def apply(): Animated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animated]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    }
  }
  
  trait AverageItemLength extends StObject {
    
    var averageItemLength: Double
    
    var highestMeasuredFrameIndex: Double
    
    var index: Double
  }
  object AverageItemLength {
    
    inline def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AverageItemLength = {
      val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[AverageItemLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AverageItemLength] (val x: Self) extends AnyVal {
      
      inline def setAverageItemLength(value: Double): Self = StObject.set(x, "averageItemLength", value.asInstanceOf[js.Any])
      
      inline def setHighestMeasuredFrameIndex(value: Double): Self = StObject.set(x, "highestMeasuredFrameIndex", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Changed extends StObject {
    
    var changed: js.Array[ViewToken]
    
    var viewableItems: js.Array[ViewToken]
  }
  object Changed {
    
    inline def apply(changed: js.Array[ViewToken], viewableItems: js.Array[ViewToken]): Changed = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], viewableItems = viewableItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
      
      inline def setChanged(value: js.Array[ViewToken]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setChangedVarargs(value: ViewToken*): Self = StObject.set(x, "changed", js.Array(value*))
      
      inline def setViewableItems(value: js.Array[ViewToken]): Self = StObject.set(x, "viewableItems", value.asInstanceOf[js.Any])
      
      inline def setViewableItemsVarargs(value: ViewToken*): Self = StObject.set(x, "viewableItems", js.Array(value*))
    }
  }
  
  trait DistanceFromEnd extends StObject {
    
    var distanceFromEnd: Double
  }
  object DistanceFromEnd {
    
    inline def apply(distanceFromEnd: Double): DistanceFromEnd = {
      val __obj = js.Dynamic.literal(distanceFromEnd = distanceFromEnd.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceFromEnd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DistanceFromEnd] (val x: Self) extends AnyVal {
      
      inline def setDistanceFromEnd(value: Double): Self = StObject.set(x, "distanceFromEnd", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceFromStart extends StObject {
    
    var distanceFromStart: Double
  }
  object DistanceFromStart {
    
    inline def apply(distanceFromStart: Double): DistanceFromStart = {
      val __obj = js.Dynamic.literal(distanceFromStart = distanceFromStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceFromStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DistanceFromStart] (val x: Self) extends AnyVal {
      
      inline def setDistanceFromStart(value: Double): Self = StObject.set(x, "distanceFromStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Highlight extends StObject {
    
    def highlight(): Unit
    
    def unhighlight(): Unit
    
    def updateProps(select: leading | trailing, newProps: Any): Unit
  }
  object Highlight {
    
    inline def apply(highlight: () => Unit, unhighlight: () => Unit, updateProps: (leading | trailing, Any) => Unit): Highlight = {
      val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction0(highlight), unhighlight = js.Any.fromFunction0(unhighlight), updateProps = js.Any.fromFunction2(updateProps))
      __obj.asInstanceOf[Highlight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: () => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction0(value))
      
      inline def setUnhighlight(value: () => Unit): Self = StObject.set(x, "unhighlight", js.Any.fromFunction0(value))
      
      inline def setUpdateProps(value: (leading | trailing, Any) => Unit): Self = StObject.set(x, "updateProps", js.Any.fromFunction2(value))
    }
  }
  
  trait Index extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var index: Double
    
    var viewOffset: js.UndefOr[Double] = js.undefined
    
    var viewPosition: js.UndefOr[Double] = js.undefined
  }
  object Index {
    
    inline def apply(index: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
      
      inline def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
      
      inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
      
      inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
    }
  }
  
  trait Item[ItemT] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var item: ItemT
    
    var viewOffset: js.UndefOr[Double] = js.undefined
    
    var viewPosition: js.UndefOr[Double] = js.undefined
  }
  object Item {
    
    inline def apply[ItemT](item: ItemT): Item[ItemT] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[ItemT]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item[?], ItemT] (val x: Self & Item[ItemT]) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setItem(value: ItemT): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
      
      inline def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
      
      inline def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
      
      inline def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
    }
  }
  
  trait Length extends StObject {
    
    var index: Double
    
    var length: Double
    
    var offset: Double
  }
  object Length {
    
    inline def apply(index: Double, length: Double, offset: Double): Length = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var offset: Double
  }
  object Offset {
    
    inline def apply(offset: Double): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
