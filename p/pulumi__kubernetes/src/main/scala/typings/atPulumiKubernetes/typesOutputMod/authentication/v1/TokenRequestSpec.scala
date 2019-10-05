package typings.atPulumiKubernetes.typesOutputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenRequestSpec contains client provided parameters of a token request.
  */
trait TokenRequestSpec extends js.Object {
  /**
    * Audiences are the intendend audiences of the token. A recipient of a token must identitfy
    * themself with an identifier in the list of audiences of the token, and otherwise should
    * reject the token. A token issued for multiple audiences may be used to authenticate against
    * any of the audiences listed but implies a high degree of trust between the target
    * audiences.
    */
  val audiences: js.Array[String]
  /**
    * BoundObjectRef is a reference to an object that the token will be bound to. The token will
    * only be valid for as long as the bound object exists. NOTE: The API server's TokenReview
    * endpoint will validate the BoundObjectRef, but other audiences may not. Keep
    * ExpirationSeconds small if you want prompt revocation.
    */
  val boundObjectRef: BoundObjectReference
  /**
    * ExpirationSeconds is the requested duration of validity of the request. The token issuer
    * may return a token with a different validity duration so a client needs to check the
    * 'expiration' field in a response.
    */
  val expirationSeconds: Double
}

object TokenRequestSpec {
  @scala.inline
  def apply(audiences: js.Array[String], boundObjectRef: BoundObjectReference, expirationSeconds: Double): TokenRequestSpec = {
    val __obj = js.Dynamic.literal(audiences = audiences, boundObjectRef = boundObjectRef, expirationSeconds = expirationSeconds)
  
    __obj.asInstanceOf[TokenRequestSpec]
  }
}

