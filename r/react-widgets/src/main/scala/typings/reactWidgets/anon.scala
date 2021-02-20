package typings.reactWidgets

import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.input
import typings.reactWidgets.reactWidgetsStrings.insert
import typings.reactWidgets.reactWidgetsStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Action extends StObject {
    
    var action: insert | remove = js.native
    
    var dataItem: js.Any = js.native
    
    var lastValue: js.UndefOr[js.Array[_]] = js.native
    
    var originalEvent: js.UndefOr[js.Any] = js.native
    
    var searchTerm: js.UndefOr[String] = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: insert | remove, dataItem: js.Any): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: insert | remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastValue(value: js.Array[_]): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastValueUndefined: Self = StObject.set(x, "lastValue", js.undefined)
      
      @scala.inline
      def setLastValueVarargs(value: js.Any*): Self = StObject.set(x, "lastValue", js.Array(value :_*))
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      @scala.inline
      def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
    }
  }
  
  @js.native
  trait LastSearchTerm extends StObject {
    
    var action: clear | input = js.native
    
    var lastSearchTerm: js.UndefOr[String] = js.native
    
    var originalEvent: js.UndefOr[js.Any] = js.native
  }
  object LastSearchTerm {
    
    @scala.inline
    def apply(action: clear | input): LastSearchTerm = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastSearchTerm]
    }
    
    @scala.inline
    implicit class LastSearchTermMutableBuilder[Self <: LastSearchTerm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: clear | input): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSearchTerm(value: String): Self = StObject.set(x, "lastSearchTerm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSearchTermUndefined: Self = StObject.set(x, "lastSearchTerm", js.undefined)
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait OriginalEvent extends StObject {
    
    var originalEvent: js.Any = js.native
  }
  object OriginalEvent {
    
    @scala.inline
    def apply(originalEvent: js.Any): OriginalEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalEvent]
    }
    
    @scala.inline
    implicit class OriginalEventMutableBuilder[Self <: OriginalEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
}
