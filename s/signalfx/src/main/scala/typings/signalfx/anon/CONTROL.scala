package typings.signalfx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONTROL extends js.Object {
  
  var CONTROL: String = js.native
  
  var DATA: String = js.native
  
  var EVENT: String = js.native
  
  var METADATA: String = js.native
}
object CONTROL {
  
  @scala.inline
  def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
    val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONTROL]
  }
  
  @scala.inline
  implicit class CONTROLOps[Self <: CONTROL] (val x: Self) extends AnyVal {
    
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
    def setCONTROL(value: String): Self = this.set("CONTROL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDATA(value: String): Self = this.set("DATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEVENT(value: String): Self = this.set("EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMETADATA(value: String): Self = this.set("METADATA", value.asInstanceOf[js.Any])
  }
}
