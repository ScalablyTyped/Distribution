package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEXTENSION_RESPONSE extends js.Object {
  
  var cmd: String = js.native
  
  var params: js.Object = js.native
  
  var sourceRoom: Double = js.native
}
object IEXTENSION_RESPONSE {
  
  @scala.inline
  def apply(cmd: String, params: js.Object, sourceRoom: Double): IEXTENSION_RESPONSE = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], sourceRoom = sourceRoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEXTENSION_RESPONSE]
  }
  
  @scala.inline
  implicit class IEXTENSION_RESPONSEOps[Self <: IEXTENSION_RESPONSE] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoom(value: Double): Self = this.set("sourceRoom", value.asInstanceOf[js.Any])
  }
}
