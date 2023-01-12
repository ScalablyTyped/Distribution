package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.beacon
import typings.reactJoyride.reactJoyrideStrings.complete
import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.init
import typings.reactJoyride.reactJoyrideStrings.ready
import typings.reactJoyride.reactJoyrideStrings.tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait lifecycle extends StObject {
  
  var BEACON: beacon
  
  var COMPLETE: complete
  
  var ERROR: error
  
  var INIT: init
  
  var READY: ready
  
  var TOOLTIP: tooltip
}
object lifecycle {
  
  inline def apply(): lifecycle = {
    val __obj = js.Dynamic.literal(BEACON = "beacon", COMPLETE = "complete", ERROR = "error", INIT = "init", READY = "ready", TOOLTIP = "tooltip")
    __obj.asInstanceOf[lifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: lifecycle] (val x: Self) extends AnyVal {
    
    inline def setBEACON(value: beacon): Self = StObject.set(x, "BEACON", value.asInstanceOf[js.Any])
    
    inline def setCOMPLETE(value: complete): Self = StObject.set(x, "COMPLETE", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setINIT(value: init): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    
    inline def setREADY(value: ready): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    inline def setTOOLTIP(value: tooltip): Self = StObject.set(x, "TOOLTIP", value.asInstanceOf[js.Any])
  }
}
