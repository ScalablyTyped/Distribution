package typings.psTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PS extends js.Object {
  
  var COMMAND: String = js.native
  
  var PID: String = js.native
  
  var PPID: String = js.native
  
  var STAT: String = js.native
}
object PS {
  
  @scala.inline
  def apply(COMMAND: String, PID: String, PPID: String, STAT: String): PS = {
    val __obj = js.Dynamic.literal(COMMAND = COMMAND.asInstanceOf[js.Any], PID = PID.asInstanceOf[js.Any], PPID = PPID.asInstanceOf[js.Any], STAT = STAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[PS]
  }
  
  @scala.inline
  implicit class PSOps[Self <: PS] (val x: Self) extends AnyVal {
    
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
    def setCOMMAND(value: String): Self = this.set("COMMAND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPID(value: String): Self = this.set("PID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPPID(value: String): Self = this.set("PPID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTAT(value: String): Self = this.set("STAT", value.asInstanceOf[js.Any])
  }
}
