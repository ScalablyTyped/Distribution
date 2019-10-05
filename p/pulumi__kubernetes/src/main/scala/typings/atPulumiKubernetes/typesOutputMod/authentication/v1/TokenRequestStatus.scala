package typings.atPulumiKubernetes.typesOutputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenRequestStatus is the result of a token request.
  */
trait TokenRequestStatus extends js.Object {
  /**
    * ExpirationTimestamp is the time of expiration of the returned token.
    */
  val expirationTimestamp: String
  /**
    * Token is the opaque bearer token.
    */
  val token: String
}

object TokenRequestStatus {
  @scala.inline
  def apply(expirationTimestamp: String, token: String): TokenRequestStatus = {
    val __obj = js.Dynamic.literal(expirationTimestamp = expirationTimestamp, token = token)
  
    __obj.asInstanceOf[TokenRequestStatus]
  }
}

