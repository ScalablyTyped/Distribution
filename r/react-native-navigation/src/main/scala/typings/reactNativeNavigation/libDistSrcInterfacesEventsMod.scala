package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesEventsMod {
  
  trait BottomTabLongPressedEvent extends StObject {
    
    var selectedTabIndex: Double
  }
  object BottomTabLongPressedEvent {
    
    inline def apply(selectedTabIndex: Double): BottomTabLongPressedEvent = {
      val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabLongPressedEvent]
    }
    
    extension [Self <: BottomTabLongPressedEvent](x: Self) {
      
      inline def setSelectedTabIndex(value: Double): Self = StObject.set(x, "selectedTabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait BottomTabPressedEvent extends StObject {
    
    var tabIndex: Double
  }
  object BottomTabPressedEvent {
    
    inline def apply(tabIndex: Double): BottomTabPressedEvent = {
      val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabPressedEvent]
    }
    
    extension [Self <: BottomTabPressedEvent](x: Self) {
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait BottomTabSelectedEvent extends StObject {
    
    var selectedTabIndex: Double
    
    var unselectedTabIndex: Double
  }
  object BottomTabSelectedEvent {
    
    inline def apply(selectedTabIndex: Double, unselectedTabIndex: Double): BottomTabSelectedEvent = {
      val __obj = js.Dynamic.literal(selectedTabIndex = selectedTabIndex.asInstanceOf[js.Any], unselectedTabIndex = unselectedTabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomTabSelectedEvent]
    }
    
    extension [Self <: BottomTabSelectedEvent](x: Self) {
      
      inline def setSelectedTabIndex(value: Double): Self = StObject.set(x, "selectedTabIndex", value.asInstanceOf[js.Any])
      
      inline def setUnselectedTabIndex(value: Double): Self = StObject.set(x, "unselectedTabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandCompletedEvent extends StObject {
    
    var commandId: String
    
    var commandName: String
    
    var completionTime: Double
  }
  object CommandCompletedEvent {
    
    inline def apply(commandId: String, commandName: String, completionTime: Double): CommandCompletedEvent = {
      val __obj = js.Dynamic.literal(commandId = commandId.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandCompletedEvent]
    }
    
    extension [Self <: CommandCompletedEvent](x: Self) {
      
      inline def setCommandId(value: String): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
      
      inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
      
      inline def setCompletionTime(value: Double): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    }
  }
}
