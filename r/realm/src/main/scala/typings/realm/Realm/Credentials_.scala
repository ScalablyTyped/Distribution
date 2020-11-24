package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Add providerCapabilities?
/**
  * End-users enter credentials to authenticate toward your MongoDB Realm App.
  */
@js.native
trait Credentials_[PayloadType /* <: js.Object */] extends js.Object {
  
  /**
    * A simple object which can be passed to the server as the body of a request to authenticate.
    */
  val payload: PayloadType = js.native
  
  /**
    * Name of the authentication provider.
    */
  val providerName: String = js.native
  
  /**
    * Type of the authentication provider.
    */
  val providerType: String = js.native
}
object Credentials_ {
  
  @scala.inline
  def apply[PayloadType /* <: js.Object */](payload: PayloadType, providerName: String, providerType: String): Credentials_[PayloadType] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials_[PayloadType]]
  }
  
  @scala.inline
  implicit class Credentials_Ops[Self <: Credentials_[_], PayloadType /* <: js.Object */] (val x: Self with Credentials_[PayloadType]) extends AnyVal {
    
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
    def setPayload(value: PayloadType): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderType(value: String): Self = this.set("providerType", value.asInstanceOf[js.Any])
  }
}
