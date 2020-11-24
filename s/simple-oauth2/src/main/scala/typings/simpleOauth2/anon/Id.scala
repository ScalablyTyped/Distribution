package typings.simpleOauth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id[ClientIdName /* <: String */] extends js.Object {
  
  /** Service registered client id. Required. */
  var id: String = js.native
  
  /** Parameter name used to send the client id. Default to client_id. */
  var idParamName: js.UndefOr[ClientIdName] = js.native
  
  /** Service registered client secret. Required. */
  var secret: String = js.native
  
  /** Parameter name used to send the client secret. Default to client_secret. */
  var secretParamName: js.UndefOr[String] = js.native
}
object Id {
  
  @scala.inline
  def apply[ClientIdName /* <: String */](id: String, secret: String): Id[ClientIdName] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[ClientIdName]]
  }
  
  @scala.inline
  implicit class IdOps[Self <: Id[_], ClientIdName /* <: String */] (val x: Self with Id[ClientIdName]) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdParamName(value: ClientIdName): Self = this.set("idParamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdParamName: Self = this.set("idParamName", js.undefined)
    
    @scala.inline
    def setSecretParamName(value: String): Self = this.set("secretParamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretParamName: Self = this.set("secretParamName", js.undefined)
  }
}
