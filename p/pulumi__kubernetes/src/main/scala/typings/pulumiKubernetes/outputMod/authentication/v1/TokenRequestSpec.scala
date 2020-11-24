package typings.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenRequestSpec contains client provided parameters of a token request.
  */
@js.native
trait TokenRequestSpec extends js.Object {
  
  /**
    * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
    */
  var audiences: js.Array[String] = js.native
  
  /**
    * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
    */
  var boundObjectRef: BoundObjectReference = js.native
  
  /**
    * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
    */
  var expirationSeconds: Double = js.native
}
object TokenRequestSpec {
  
  @scala.inline
  def apply(audiences: js.Array[String], boundObjectRef: BoundObjectReference, expirationSeconds: Double): TokenRequestSpec = {
    val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], boundObjectRef = boundObjectRef.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequestSpec]
  }
  
  @scala.inline
  implicit class TokenRequestSpecOps[Self <: TokenRequestSpec] (val x: Self) extends AnyVal {
    
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
    def setAudiencesVarargs(value: String*): Self = this.set("audiences", js.Array(value :_*))
    
    @scala.inline
    def setAudiences(value: js.Array[String]): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundObjectRef(value: BoundObjectReference): Self = this.set("boundObjectRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationSeconds(value: Double): Self = this.set("expirationSeconds", value.asInstanceOf[js.Any])
  }
}
