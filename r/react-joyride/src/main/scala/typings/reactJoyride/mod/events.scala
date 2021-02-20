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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait events extends StObject {
  
  var BEACON: beacon = js.native
  
  var ERROR: error = js.native
  
  var STEP_AFTER: stepColonafter = js.native
  
  var STEP_BEFORE: stepColonbefore = js.native
  
  var TARGET_NOT_FOUND: errorColontarget_not_found = js.native
  
  var TOOLTIP: tooltip = js.native
  
  var TOOLTIP_CLOSE: close = js.native
  
  var TOUR_END: tourColonend = js.native
  
  var TOUR_START: tourColonstart = js.native
  
  var TOUR_STATUS: tourColonstatus = js.native
}
object events {
  
  @scala.inline
  def apply(
    BEACON: beacon,
    ERROR: error,
    STEP_AFTER: stepColonafter,
    STEP_BEFORE: stepColonbefore,
    TARGET_NOT_FOUND: errorColontarget_not_found,
    TOOLTIP: tooltip,
    TOOLTIP_CLOSE: close,
    TOUR_END: tourColonend,
    TOUR_START: tourColonstart,
    TOUR_STATUS: tourColonstatus
  ): events = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], STEP_AFTER = STEP_AFTER.asInstanceOf[js.Any], STEP_BEFORE = STEP_BEFORE.asInstanceOf[js.Any], TARGET_NOT_FOUND = TARGET_NOT_FOUND.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], TOOLTIP_CLOSE = TOOLTIP_CLOSE.asInstanceOf[js.Any], TOUR_END = TOUR_END.asInstanceOf[js.Any], TOUR_START = TOUR_START.asInstanceOf[js.Any], TOUR_STATUS = TOUR_STATUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[events]
  }
  
  @scala.inline
  implicit class eventsMutableBuilder[Self <: events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBEACON(value: beacon): Self = StObject.set(x, "BEACON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTEP_AFTER(value: stepColonafter): Self = StObject.set(x, "STEP_AFTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTEP_BEFORE(value: stepColonbefore): Self = StObject.set(x, "STEP_BEFORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTARGET_NOT_FOUND(value: errorColontarget_not_found): Self = StObject.set(x, "TARGET_NOT_FOUND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLTIP(value: tooltip): Self = StObject.set(x, "TOOLTIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLTIP_CLOSE(value: close): Self = StObject.set(x, "TOOLTIP_CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUR_END(value: tourColonend): Self = StObject.set(x, "TOUR_END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUR_START(value: tourColonstart): Self = StObject.set(x, "TOUR_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUR_STATUS(value: tourColonstatus): Self = StObject.set(x, "TOUR_STATUS", value.asInstanceOf[js.Any])
  }
}
