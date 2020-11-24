package typings.registryAuthToken.mod

import typings.registryAuthToken.registryAuthTokenStrings.Basic
import typings.registryAuthToken.registryAuthTokenStrings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The generated authentication information
  */
@js.native
trait NpmCredentials extends js.Object {
  
  /**
    * The password used in `Basic`
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The token representing the users credentials
    */
  var token: String = js.native
  
  /**
    * The type of token
    */
  var `type`: Basic | Bearer = js.native
  
  /**
    * The username used in `Basic`
    */
  var username: js.UndefOr[String] = js.native
}
object NpmCredentials {
  
  @scala.inline
  def apply(token: String, `type`: Basic | Bearer): NpmCredentials = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmCredentials]
  }
  
  @scala.inline
  implicit class NpmCredentialsOps[Self <: NpmCredentials] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Basic | Bearer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
