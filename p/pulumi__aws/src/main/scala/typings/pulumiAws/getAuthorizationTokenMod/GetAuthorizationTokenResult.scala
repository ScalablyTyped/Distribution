package typings.pulumiAws.getAuthorizationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizationTokenResult extends js.Object {
  
  /**
    * Temporary authorization token.
    */
  val authorizationToken: String = js.native
  
  val domain: String = js.native
  
  val domainOwner: String = js.native
  
  val durationSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The time in UTC RFC3339 format when the authorization token expires.
    */
  val expiration: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}
object GetAuthorizationTokenResult {
  
  @scala.inline
  def apply(authorizationToken: String, domain: String, domainOwner: String, expiration: String, id: String): GetAuthorizationTokenResult = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], domainOwner = domainOwner.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenResult]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenResultOps[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: String): Self = this.set("domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: String): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSeconds(value: Double): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
  }
}
