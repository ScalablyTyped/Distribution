package typings.reactWidgets

import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.input
import typings.reactWidgets.reactWidgetsStrings.insert
import typings.reactWidgets.reactWidgetsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: insert | remove
    
    var dataItem: js.Any
    
    var lastValue: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var originalEvent: js.UndefOr[js.Any] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
  }
  object Action {
    
    inline def apply(action: insert | remove, dataItem: js.Any): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setLastValue(value: js.Array[js.Any]): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
      
      inline def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
      
      inline def setLastValueVarargs(value: js.Any*): Self = StObject.set(x, "lastValue", js.Array(value :_*))
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    }
  }
  
  trait LastSearchTerm extends StObject {
    
    var action: clear | input
    
    var lastSearchTerm: js.UndefOr[String] = js.undefined
    
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object LastSearchTerm {
    
    inline def apply(action: clear | input): LastSearchTerm = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastSearchTerm]
    }
    
    extension [Self <: LastSearchTerm](x: Self) {
      
      inline def setAction(value: clear | input): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLastSearchTerm(value: String): Self = StObject.set(x, "lastSearchTerm", value.asInstanceOf[js.Any])
      
      inline def setLastSearchTermUndefined: Self = StObject.set(x, "lastSearchTerm", js.undefined)
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait OriginalEvent extends StObject {
    
    var originalEvent: js.Any
  }
  object OriginalEvent {
    
    inline def apply(originalEvent: js.Any): OriginalEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalEvent]
    }
    
    extension [Self <: OriginalEvent](x: Self) {
      
      inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
}
