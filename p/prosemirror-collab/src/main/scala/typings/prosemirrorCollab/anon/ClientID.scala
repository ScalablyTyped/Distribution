package typings.prosemirrorCollab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientID extends js.Object {
  
  var clientID: js.UndefOr[Double | String | Null] = js.native
  
  var version: js.UndefOr[Double | Null] = js.native
}
object ClientID {
  
  @scala.inline
  def apply(): ClientID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientID]
  }
  
  @scala.inline
  implicit class ClientIDOps[Self <: ClientID] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: Double | String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    
    @scala.inline
    def setClientIDNull: Self = this.set("clientID", null)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
