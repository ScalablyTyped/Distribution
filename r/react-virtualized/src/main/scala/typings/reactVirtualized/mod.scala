package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactVirtualized.reactVirtualizedStrings.auto
    - typings.reactVirtualized.reactVirtualizedStrings.end
    - typings.reactVirtualized.reactVirtualizedStrings.start
    - typings.reactVirtualized.reactVirtualizedStrings.center
  */
  trait Alignment extends StObject
  object Alignment {
    
    inline def auto: typings.reactVirtualized.reactVirtualizedStrings.auto = "auto".asInstanceOf[typings.reactVirtualized.reactVirtualizedStrings.auto]
    
    inline def center: typings.reactVirtualized.reactVirtualizedStrings.center = "center".asInstanceOf[typings.reactVirtualized.reactVirtualizedStrings.center]
    
    inline def end: typings.reactVirtualized.reactVirtualizedStrings.end = "end".asInstanceOf[typings.reactVirtualized.reactVirtualizedStrings.end]
    
    inline def start: typings.reactVirtualized.reactVirtualizedStrings.start = "start".asInstanceOf[typings.reactVirtualized.reactVirtualizedStrings.start]
  }
  
  trait Index extends StObject {
    
    var index: Double
  }
  object Index {
    
    inline def apply(index: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexRange extends StObject {
    
    var startIndex: Double
    
    var stopIndex: Double
  }
  object IndexRange {
    
    inline def apply(startIndex: Double, stopIndex: Double): IndexRange = {
      val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexRange]
    }
    
    extension [Self <: IndexRange](x: Self) {
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStopIndex(value: Double): Self = StObject.set(x, "stopIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type Map[T] = StringDictionary[T]
  
  trait OverscanIndexRange extends StObject {
    
    var overscanStartIndex: Double
    
    var overscanStopIndex: Double
  }
  object OverscanIndexRange {
    
    inline def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
      val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverscanIndexRange]
    }
    
    extension [Self <: OverscanIndexRange](x: Self) {
      
      inline def setOverscanStartIndex(value: Double): Self = StObject.set(x, "overscanStartIndex", value.asInstanceOf[js.Any])
      
      inline def setOverscanStopIndex(value: Double): Self = StObject.set(x, "overscanStopIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PositionInfo extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object PositionInfo {
    
    inline def apply(x: Double, y: Double): PositionInfo = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInfo]
    }
    
    extension [Self <: PositionInfo](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollEventData extends StObject {
    
    var clientHeight: Double
    
    var scrollHeight: Double
    
    var scrollTop: Double
  }
  object ScrollEventData {
    
    inline def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ScrollEventData = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEventData]
    }
    
    extension [Self <: ScrollEventData](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollPosition extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollPosition {
    
    inline def apply(scrollLeft: Double, scrollTop: Double): ScrollPosition = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollPosition]
    }
    
    extension [Self <: ScrollPosition](x: Self) {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeAndPositionInfo
    extends StObject
       with SizeInfo
       with PositionInfo
  object SizeAndPositionInfo {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): SizeAndPositionInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeAndPositionInfo]
    }
  }
  
  trait SizeInfo extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object SizeInfo {
    
    inline def apply(height: Double, width: Double): SizeInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeInfo]
    }
    
    extension [Self <: SizeInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
