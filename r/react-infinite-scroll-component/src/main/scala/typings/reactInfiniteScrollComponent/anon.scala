package typings.reactInfiniteScrollComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Array[Any]
  }
  object Data {
    
    inline def apply(data: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait HasMore extends StObject {
    
    var hasMore: Boolean
    
    var items: js.Array[Any]
  }
  object HasMore {
    
    inline def apply(hasMore: Boolean, items: js.Array[Any]): HasMore = {
      val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasMore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasMore] (val x: Self) extends AnyVal {
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[Any]
  }
  object Items {
    
    inline def apply(items: js.Array[Any]): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait PrevDataLength extends StObject {
    
    var prevDataLength: Double
    
    var pullToRefreshThresholdBreached: Boolean
    
    var showLoader: Boolean
  }
  object PrevDataLength {
    
    inline def apply(prevDataLength: Double, pullToRefreshThresholdBreached: Boolean, showLoader: Boolean): PrevDataLength = {
      val __obj = js.Dynamic.literal(prevDataLength = prevDataLength.asInstanceOf[js.Any], pullToRefreshThresholdBreached = pullToRefreshThresholdBreached.asInstanceOf[js.Any], showLoader = showLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevDataLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrevDataLength] (val x: Self) extends AnyVal {
      
      inline def setPrevDataLength(value: Double): Self = StObject.set(x, "prevDataLength", value.asInstanceOf[js.Any])
      
      inline def setPullToRefreshThresholdBreached(value: Boolean): Self = StObject.set(x, "pullToRefreshThresholdBreached", value.asInstanceOf[js.Any])
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit extends StObject {
    
    var unit: String
    
    var value: Double
  }
  object Unit {
    
    inline def apply(unit: String, value: Double): Unit = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
