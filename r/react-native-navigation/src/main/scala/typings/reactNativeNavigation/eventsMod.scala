package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @js.native
  trait BottomTabLongPressedEvent extends StObject {
    
    var selectedTabIndex: Double = js.native
  }
  object BottomTabLongPressedEvent {
    
    @scala.inline
    def apply(selectedTabIndex: Double): BottomTabLongPressedEvent = {
      val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabLongPressedEvent]
    }
    
    @scala.inline
    implicit class BottomTabLongPressedEventMutableBuilder[Self <: BottomTabLongPressedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedTabIndex(value: Double): Self = StObject.set(x, "selectedTabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BottomTabPressedEvent extends StObject {
    
    var tabIndex: Double = js.native
  }
  object BottomTabPressedEvent {
    
    @scala.inline
    def apply(tabIndex: Double): BottomTabPressedEvent = {
      val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabPressedEvent]
    }
    
    @scala.inline
    implicit class BottomTabPressedEventMutableBuilder[Self <: BottomTabPressedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BottomTabSelectedEvent extends StObject {
    
    var selectedTabIndex: Double = js.native
    
    var unselectedTabIndex: Double = js.native
  }
  object BottomTabSelectedEvent {
    
    @scala.inline
    def apply(selectedTabIndex: Double, unselectedTabIndex: Double): BottomTabSelectedEvent = {
      val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any], unselectedTabIndex = unselectedTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabSelectedEvent]
    }
    
    @scala.inline
    implicit class BottomTabSelectedEventMutableBuilder[Self <: BottomTabSelectedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedTabIndex(value: Double): Self = StObject.set(x, "selectedTabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedTabIndex(value: Double): Self = StObject.set(x, "unselectedTabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CommandCompletedEvent extends StObject {
    
    var commandId: String = js.native
    
    var commandName: String = js.native
    
    var completionTime: Double = js.native
  }
  object CommandCompletedEvent {
    
    @scala.inline
    def apply(commandId: String, commandName: String, completionTime: Double): CommandCompletedEvent = {
      val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandCompletedEvent]
    }
    
    @scala.inline
    implicit class CommandCompletedEventMutableBuilder[Self <: CommandCompletedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionTime(value: Double): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    }
  }
}
