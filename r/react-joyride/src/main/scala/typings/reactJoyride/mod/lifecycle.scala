package typings.reactJoyride.mod

import typings.reactJoyride.reactJoyrideStrings.beacon
import typings.reactJoyride.reactJoyrideStrings.complete
import typings.reactJoyride.reactJoyrideStrings.error
import typings.reactJoyride.reactJoyrideStrings.init
import typings.reactJoyride.reactJoyrideStrings.ready
import typings.reactJoyride.reactJoyrideStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait lifecycle extends js.Object {
  
  var BEACON: beacon = js.native
  
  var COMPLETE: complete = js.native
  
  var ERROR: error = js.native
  
  var INIT: init = js.native
  
  var READY: ready = js.native
  
  var TOOLTIP: tooltip = js.native
}
object lifecycle {
  
  @scala.inline
  def apply(BEACON: beacon, COMPLETE: complete, ERROR: error, INIT: init, READY: ready, TOOLTIP: tooltip): lifecycle = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], COMPLETE = COMPLETE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INIT = INIT.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[lifecycle]
  }
  
  @scala.inline
  implicit class lifecycleOps[Self <: lifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBEACON(value: beacon): Self = this.set("BEACON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMPLETE(value: complete): Self = this.set("COMPLETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINIT(value: init): Self = this.set("INIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREADY(value: ready): Self = this.set("READY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOOLTIP(value: tooltip): Self = this.set("TOOLTIP", value.asInstanceOf[js.Any])
  }
}
