package typings.reduxDevtoolsDockMonitor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("redux-devtools-dock-monitor/lib/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-devtools-dock-monitor/lib/actions", "CHANGE_MONITOR")
  @js.native
  val CHANGE_MONITOR: /* "@@redux-devtools-log-monitor/CHANGE_MONITOR" */ String = js.native
  
  @JSImport("redux-devtools-dock-monitor/lib/actions", "CHANGE_POSITION")
  @js.native
  val CHANGE_POSITION: /* "@@redux-devtools-log-monitor/CHANGE_POSITION" */ String = js.native
  
  @JSImport("redux-devtools-dock-monitor/lib/actions", "CHANGE_SIZE")
  @js.native
  val CHANGE_SIZE: /* "@@redux-devtools-log-monitor/CHANGE_SIZE" */ String = js.native
  
  @JSImport("redux-devtools-dock-monitor/lib/actions", "TOGGLE_VISIBILITY")
  @js.native
  val TOGGLE_VISIBILITY: /* "@@redux-devtools-log-monitor/TOGGLE_VISIBILITY" */ String = js.native
  
  inline def changeMonitor(): ChangeMonitorAction = ^.asInstanceOf[js.Dynamic].applyDynamic("changeMonitor")().asInstanceOf[ChangeMonitorAction]
  
  inline def changePosition(): ChangePositionAction = ^.asInstanceOf[js.Dynamic].applyDynamic("changePosition")().asInstanceOf[ChangePositionAction]
  
  inline def changeSize(size: Double): ChangeSizeAction = ^.asInstanceOf[js.Dynamic].applyDynamic("changeSize")(size.asInstanceOf[js.Any]).asInstanceOf[ChangeSizeAction]
  
  inline def toggleVisibility(): ToggleVisibilityAction = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleVisibility")().asInstanceOf[ToggleVisibilityAction]
  
  trait ChangeMonitorAction
    extends StObject
       with DockMonitorAction {
    
    var `type`: /* "@@redux-devtools-log-monitor/CHANGE_MONITOR" */ String
  }
  object ChangeMonitorAction {
    
    inline def apply(`type`: /* "@@redux-devtools-log-monitor/CHANGE_MONITOR" */ String): ChangeMonitorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeMonitorAction]
    }
    
    extension [Self <: ChangeMonitorAction](x: Self) {
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/CHANGE_MONITOR" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangePositionAction
    extends StObject
       with DockMonitorAction {
    
    var `type`: /* "@@redux-devtools-log-monitor/CHANGE_POSITION" */ String
  }
  object ChangePositionAction {
    
    inline def apply(`type`: /* "@@redux-devtools-log-monitor/CHANGE_POSITION" */ String): ChangePositionAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangePositionAction]
    }
    
    extension [Self <: ChangePositionAction](x: Self) {
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/CHANGE_POSITION" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangeSizeAction
    extends StObject
       with DockMonitorAction {
    
    var size: Double
    
    var `type`: /* "@@redux-devtools-log-monitor/CHANGE_SIZE" */ String
  }
  object ChangeSizeAction {
    
    inline def apply(size: Double, `type`: /* "@@redux-devtools-log-monitor/CHANGE_SIZE" */ String): ChangeSizeAction = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeSizeAction]
    }
    
    extension [Self <: ChangeSizeAction](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/CHANGE_SIZE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxDevtoolsDockMonitor.actionsMod.ToggleVisibilityAction
    - typings.reduxDevtoolsDockMonitor.actionsMod.ChangePositionAction
    - typings.reduxDevtoolsDockMonitor.actionsMod.ChangeSizeAction
    - typings.reduxDevtoolsDockMonitor.actionsMod.ChangeMonitorAction
  */
  trait DockMonitorAction extends StObject
  object DockMonitorAction {
    
    inline def ChangeMonitorAction(`type`: /* "@@redux-devtools-log-monitor/CHANGE_MONITOR" */ String): typings.reduxDevtoolsDockMonitor.actionsMod.ChangeMonitorAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsDockMonitor.actionsMod.ChangeMonitorAction]
    }
    
    inline def ChangePositionAction(`type`: /* "@@redux-devtools-log-monitor/CHANGE_POSITION" */ String): typings.reduxDevtoolsDockMonitor.actionsMod.ChangePositionAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsDockMonitor.actionsMod.ChangePositionAction]
    }
    
    inline def ChangeSizeAction(size: Double, `type`: /* "@@redux-devtools-log-monitor/CHANGE_SIZE" */ String): typings.reduxDevtoolsDockMonitor.actionsMod.ChangeSizeAction = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsDockMonitor.actionsMod.ChangeSizeAction]
    }
    
    inline def ToggleVisibilityAction(`type`: /* "@@redux-devtools-log-monitor/TOGGLE_VISIBILITY" */ String): typings.reduxDevtoolsDockMonitor.actionsMod.ToggleVisibilityAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsDockMonitor.actionsMod.ToggleVisibilityAction]
    }
  }
  
  trait ToggleVisibilityAction
    extends StObject
       with DockMonitorAction {
    
    var `type`: /* "@@redux-devtools-log-monitor/TOGGLE_VISIBILITY" */ String
  }
  object ToggleVisibilityAction {
    
    inline def apply(`type`: /* "@@redux-devtools-log-monitor/TOGGLE_VISIBILITY" */ String): ToggleVisibilityAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleVisibilityAction]
    }
    
    extension [Self <: ToggleVisibilityAction](x: Self) {
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/TOGGLE_VISIBILITY" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
