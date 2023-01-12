package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.beacon
import typings.reactJoyride.reactJoyrideStrings.close
import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.errorColontarget_not_found
import typings.reactJoyride.reactJoyrideStrings.stepColonafter
import typings.reactJoyride.reactJoyrideStrings.stepColonbefore
import typings.reactJoyride.reactJoyrideStrings.tooltip
import typings.reactJoyride.reactJoyrideStrings.tourColonend
import typings.reactJoyride.reactJoyrideStrings.tourColonstart
import typings.reactJoyride.reactJoyrideStrings.tourColonstatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait events extends StObject {
  
  var BEACON: beacon
  
  var ERROR: error
  
  var STEP_AFTER: stepColonafter
  
  var STEP_BEFORE: stepColonbefore
  
  var TARGET_NOT_FOUND: errorColontarget_not_found
  
  var TOOLTIP: tooltip
  
  var TOOLTIP_CLOSE: close
  
  var TOUR_END: tourColonend
  
  var TOUR_START: tourColonstart
  
  var TOUR_STATUS: tourColonstatus
}
object events {
  
  inline def apply(): events = {
    val __obj = js.Dynamic.literal(BEACON = "beacon", ERROR = "error", STEP_AFTER = "step:after", STEP_BEFORE = "step:before", TARGET_NOT_FOUND = "error:target_not_found", TOOLTIP = "tooltip", TOOLTIP_CLOSE = "close", TOUR_END = "tour:end", TOUR_START = "tour:start", TOUR_STATUS = "tour:status")
    __obj.asInstanceOf[events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: events] (val x: Self) extends AnyVal {
    
    inline def setBEACON(value: beacon): Self = StObject.set(x, "BEACON", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setSTEP_AFTER(value: stepColonafter): Self = StObject.set(x, "STEP_AFTER", value.asInstanceOf[js.Any])
    
    inline def setSTEP_BEFORE(value: stepColonbefore): Self = StObject.set(x, "STEP_BEFORE", value.asInstanceOf[js.Any])
    
    inline def setTARGET_NOT_FOUND(value: errorColontarget_not_found): Self = StObject.set(x, "TARGET_NOT_FOUND", value.asInstanceOf[js.Any])
    
    inline def setTOOLTIP(value: tooltip): Self = StObject.set(x, "TOOLTIP", value.asInstanceOf[js.Any])
    
    inline def setTOOLTIP_CLOSE(value: close): Self = StObject.set(x, "TOOLTIP_CLOSE", value.asInstanceOf[js.Any])
    
    inline def setTOUR_END(value: tourColonend): Self = StObject.set(x, "TOUR_END", value.asInstanceOf[js.Any])
    
    inline def setTOUR_START(value: tourColonstart): Self = StObject.set(x, "TOUR_START", value.asInstanceOf[js.Any])
    
    inline def setTOUR_STATUS(value: tourColonstatus): Self = StObject.set(x, "TOUR_STATUS", value.asInstanceOf[js.Any])
  }
}
