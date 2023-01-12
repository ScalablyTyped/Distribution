package typings.router5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  @JSImport("router5/dist/constants", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  @JSImport("router5/dist/constants", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  trait Constants_ extends StObject {
    
    var ROUTER_START: String
    
    var ROUTER_STOP: String
    
    var TRANSITION_CANCEL: String
    
    var TRANSITION_ERROR: String
    
    var TRANSITION_START: String
    
    var TRANSITION_SUCCESS: String
    
    var UNKNOWN_ROUTE: String
  }
  object Constants_ {
    
    inline def apply(
      ROUTER_START: String,
      ROUTER_STOP: String,
      TRANSITION_CANCEL: String,
      TRANSITION_ERROR: String,
      TRANSITION_START: String,
      TRANSITION_SUCCESS: String,
      UNKNOWN_ROUTE: String
    ): Constants_ = {
      val __obj = js.Dynamic.literal(ROUTER_START = ROUTER_START.asInstanceOf[js.Any], ROUTER_STOP = ROUTER_STOP.asInstanceOf[js.Any], TRANSITION_CANCEL = TRANSITION_CANCEL.asInstanceOf[js.Any], TRANSITION_ERROR = TRANSITION_ERROR.asInstanceOf[js.Any], TRANSITION_START = TRANSITION_START.asInstanceOf[js.Any], TRANSITION_SUCCESS = TRANSITION_SUCCESS.asInstanceOf[js.Any], UNKNOWN_ROUTE = UNKNOWN_ROUTE.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constants_] (val x: Self) extends AnyVal {
      
      inline def setROUTER_START(value: String): Self = StObject.set(x, "ROUTER_START", value.asInstanceOf[js.Any])
      
      inline def setROUTER_STOP(value: String): Self = StObject.set(x, "ROUTER_STOP", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_CANCEL(value: String): Self = StObject.set(x, "TRANSITION_CANCEL", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_ERROR(value: String): Self = StObject.set(x, "TRANSITION_ERROR", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_START(value: String): Self = StObject.set(x, "TRANSITION_START", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_SUCCESS(value: String): Self = StObject.set(x, "TRANSITION_SUCCESS", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWN_ROUTE(value: String): Self = StObject.set(x, "UNKNOWN_ROUTE", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorCodes_ extends StObject {
    
    var CANNOT_ACTIVATE: String
    
    var CANNOT_DEACTIVATE: String
    
    var NO_START_PATH_OR_STATE: String
    
    var ROUTER_ALREADY_STARTED: String
    
    var ROUTER_NOT_STARTED: String
    
    var ROUTE_NOT_FOUND: String
    
    var SAME_STATES: String
    
    var TRANSITION_CANCELLED: String
    
    var TRANSITION_ERR: String
  }
  object ErrorCodes_ {
    
    inline def apply(
      CANNOT_ACTIVATE: String,
      CANNOT_DEACTIVATE: String,
      NO_START_PATH_OR_STATE: String,
      ROUTER_ALREADY_STARTED: String,
      ROUTER_NOT_STARTED: String,
      ROUTE_NOT_FOUND: String,
      SAME_STATES: String,
      TRANSITION_CANCELLED: String,
      TRANSITION_ERR: String
    ): ErrorCodes_ = {
      val __obj = js.Dynamic.literal(CANNOT_ACTIVATE = CANNOT_ACTIVATE.asInstanceOf[js.Any], CANNOT_DEACTIVATE = CANNOT_DEACTIVATE.asInstanceOf[js.Any], NO_START_PATH_OR_STATE = NO_START_PATH_OR_STATE.asInstanceOf[js.Any], ROUTER_ALREADY_STARTED = ROUTER_ALREADY_STARTED.asInstanceOf[js.Any], ROUTER_NOT_STARTED = ROUTER_NOT_STARTED.asInstanceOf[js.Any], ROUTE_NOT_FOUND = ROUTE_NOT_FOUND.asInstanceOf[js.Any], SAME_STATES = SAME_STATES.asInstanceOf[js.Any], TRANSITION_CANCELLED = TRANSITION_CANCELLED.asInstanceOf[js.Any], TRANSITION_ERR = TRANSITION_ERR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCodes_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorCodes_] (val x: Self) extends AnyVal {
      
      inline def setCANNOT_ACTIVATE(value: String): Self = StObject.set(x, "CANNOT_ACTIVATE", value.asInstanceOf[js.Any])
      
      inline def setCANNOT_DEACTIVATE(value: String): Self = StObject.set(x, "CANNOT_DEACTIVATE", value.asInstanceOf[js.Any])
      
      inline def setNO_START_PATH_OR_STATE(value: String): Self = StObject.set(x, "NO_START_PATH_OR_STATE", value.asInstanceOf[js.Any])
      
      inline def setROUTER_ALREADY_STARTED(value: String): Self = StObject.set(x, "ROUTER_ALREADY_STARTED", value.asInstanceOf[js.Any])
      
      inline def setROUTER_NOT_STARTED(value: String): Self = StObject.set(x, "ROUTER_NOT_STARTED", value.asInstanceOf[js.Any])
      
      inline def setROUTE_NOT_FOUND(value: String): Self = StObject.set(x, "ROUTE_NOT_FOUND", value.asInstanceOf[js.Any])
      
      inline def setSAME_STATES(value: String): Self = StObject.set(x, "SAME_STATES", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_CANCELLED(value: String): Self = StObject.set(x, "TRANSITION_CANCELLED", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_ERR(value: String): Self = StObject.set(x, "TRANSITION_ERR", value.asInstanceOf[js.Any])
    }
  }
}
