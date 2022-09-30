package typings.reduxDevtoolsLogMonitor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("redux-devtools-log-monitor/lib/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-devtools-log-monitor/lib/actions", "START_CONSECUTIVE_TOGGLE")
  @js.native
  val START_CONSECUTIVE_TOGGLE: /* "@@redux-devtools-log-monitor/START_CONSECUTIVE_TOGGLE" */ String = js.native
  
  @JSImport("redux-devtools-log-monitor/lib/actions", "UPDATE_SCROLL_TOP")
  @js.native
  val UPDATE_SCROLL_TOP: /* "@@redux-devtools-log-monitor/UPDATE_SCROLL_TOP" */ String = js.native
  
  inline def startConsecutiveToggle(): StartConsecutiveToggleAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startConsecutiveToggle")().asInstanceOf[StartConsecutiveToggleAction]
  inline def startConsecutiveToggle(id: Double): StartConsecutiveToggleAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startConsecutiveToggle")(id.asInstanceOf[js.Any]).asInstanceOf[StartConsecutiveToggleAction]
  
  inline def updateScrollTop(scrollTop: Double): UpdateScrollTopAction = ^.asInstanceOf[js.Dynamic].applyDynamic("updateScrollTop")(scrollTop.asInstanceOf[js.Any]).asInstanceOf[UpdateScrollTopAction]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reduxDevtoolsLogMonitor.actionsMod.UpdateScrollTopAction
    - typings.reduxDevtoolsLogMonitor.actionsMod.StartConsecutiveToggleAction
  */
  trait LogMonitorAction extends StObject
  object LogMonitorAction {
    
    inline def StartConsecutiveToggleAction(`type`: /* "@@redux-devtools-log-monitor/START_CONSECUTIVE_TOGGLE" */ String): typings.reduxDevtoolsLogMonitor.actionsMod.StartConsecutiveToggleAction = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsLogMonitor.actionsMod.StartConsecutiveToggleAction]
    }
    
    inline def UpdateScrollTopAction(scrollTop: Double, `type`: /* "@@redux-devtools-log-monitor/UPDATE_SCROLL_TOP" */ String): typings.reduxDevtoolsLogMonitor.actionsMod.UpdateScrollTopAction = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reduxDevtoolsLogMonitor.actionsMod.UpdateScrollTopAction]
    }
  }
  
  trait StartConsecutiveToggleAction
    extends StObject
       with LogMonitorAction {
    
    var id: Double | Null
    
    var `type`: /* "@@redux-devtools-log-monitor/START_CONSECUTIVE_TOGGLE" */ String
  }
  object StartConsecutiveToggleAction {
    
    inline def apply(`type`: /* "@@redux-devtools-log-monitor/START_CONSECUTIVE_TOGGLE" */ String): StartConsecutiveToggleAction = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartConsecutiveToggleAction]
    }
    
    extension [Self <: StartConsecutiveToggleAction](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/START_CONSECUTIVE_TOGGLE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateScrollTopAction
    extends StObject
       with LogMonitorAction {
    
    var scrollTop: Double
    
    var `type`: /* "@@redux-devtools-log-monitor/UPDATE_SCROLL_TOP" */ String
  }
  object UpdateScrollTopAction {
    
    inline def apply(scrollTop: Double, `type`: /* "@@redux-devtools-log-monitor/UPDATE_SCROLL_TOP" */ String): UpdateScrollTopAction = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateScrollTopAction]
    }
    
    extension [Self <: UpdateScrollTopAction](x: Self) {
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "@@redux-devtools-log-monitor/UPDATE_SCROLL_TOP" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
