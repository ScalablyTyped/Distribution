package typings.router5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("router5/dist/constants", "constants")
  @js.native
  val constants: Constants_ = js.native
  
  @JSImport("router5/dist/constants", "errorCodes")
  @js.native
  val errorCodes: ErrorCodes_ = js.native
  
  @js.native
  trait Constants_ extends StObject {
    
    var ROUTER_START: String = js.native
    
    var ROUTER_STOP: String = js.native
    
    var TRANSITION_CANCEL: String = js.native
    
    var TRANSITION_ERROR: String = js.native
    
    var TRANSITION_START: String = js.native
    
    var TRANSITION_SUCCESS: String = js.native
    
    var UNKNOWN_ROUTE: String = js.native
  }
  object Constants_ {
    
    @scala.inline
    def apply(
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
    implicit class Constants_MutableBuilder[Self <: Constants_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setROUTER_START(value: String): Self = StObject.set(x, "ROUTER_START", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROUTER_STOP(value: String): Self = StObject.set(x, "ROUTER_STOP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_CANCEL(value: String): Self = StObject.set(x, "TRANSITION_CANCEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_ERROR(value: String): Self = StObject.set(x, "TRANSITION_ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_START(value: String): Self = StObject.set(x, "TRANSITION_START", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_SUCCESS(value: String): Self = StObject.set(x, "TRANSITION_SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNKNOWN_ROUTE(value: String): Self = StObject.set(x, "UNKNOWN_ROUTE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorCodes_ extends StObject {
    
    var CANNOT_ACTIVATE: String = js.native
    
    var CANNOT_DEACTIVATE: String = js.native
    
    var NO_START_PATH_OR_STATE: String = js.native
    
    var ROUTER_ALREADY_STARTED: String = js.native
    
    var ROUTER_NOT_STARTED: String = js.native
    
    var ROUTE_NOT_FOUND: String = js.native
    
    var SAME_STATES: String = js.native
    
    var TRANSITION_CANCELLED: String = js.native
    
    var TRANSITION_ERR: String = js.native
  }
  object ErrorCodes_ {
    
    @scala.inline
    def apply(
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
    implicit class ErrorCodes_MutableBuilder[Self <: ErrorCodes_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCANNOT_ACTIVATE(value: String): Self = StObject.set(x, "CANNOT_ACTIVATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCANNOT_DEACTIVATE(value: String): Self = StObject.set(x, "CANNOT_DEACTIVATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNO_START_PATH_OR_STATE(value: String): Self = StObject.set(x, "NO_START_PATH_OR_STATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROUTER_ALREADY_STARTED(value: String): Self = StObject.set(x, "ROUTER_ALREADY_STARTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROUTER_NOT_STARTED(value: String): Self = StObject.set(x, "ROUTER_NOT_STARTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROUTE_NOT_FOUND(value: String): Self = StObject.set(x, "ROUTE_NOT_FOUND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAME_STATES(value: String): Self = StObject.set(x, "SAME_STATES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_CANCELLED(value: String): Self = StObject.set(x, "TRANSITION_CANCELLED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSITION_ERR(value: String): Self = StObject.set(x, "TRANSITION_ERR", value.asInstanceOf[js.Any])
    }
  }
}
