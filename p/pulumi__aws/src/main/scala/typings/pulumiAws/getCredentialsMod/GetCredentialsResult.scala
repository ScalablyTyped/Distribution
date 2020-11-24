package typings.pulumiAws.getCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialsResult extends js.Object {
  
  val authorizationToken: String = js.native
  
  val expiresAt: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val proxyEndpoint: String = js.native
  
  val registryId: String = js.native
}
object GetCredentialsResult {
  
  @scala.inline
  def apply(
    authorizationToken: String,
    expiresAt: String,
    id: String,
    proxyEndpoint: String,
    registryId: String
  ): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResult]
  }
  
  @scala.inline
  implicit class GetCredentialsResultOps[Self <: GetCredentialsResult] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationToken(value: String): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: String): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyEndpoint(value: String): Self = this.set("proxyEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: String): Self = this.set("registryId", value.asInstanceOf[js.Any])
  }
}
