package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOBJECT_MESSAGE extends js.Object {
  
  var message: String = js.native
  
  var sender: SFSUser = js.native
}
object IOBJECT_MESSAGE {
  
  @scala.inline
  def apply(message: String, sender: SFSUser): IOBJECT_MESSAGE = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOBJECT_MESSAGE]
  }
  
  @scala.inline
  implicit class IOBJECT_MESSAGEOps[Self <: IOBJECT_MESSAGE] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: SFSUser): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
}
