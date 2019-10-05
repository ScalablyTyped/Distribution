package typings.atPulumiKubernetes.typesInputMod.authentication.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var expirationTimestamp: Input[String]
  /**
    * Token is the opaque bearer token.
    */
  var token: Input[String]
}

object TokenRequestStatus {
  @scala.inline
  def apply(expirationTimestamp: Input[String], token: Input[String]): TokenRequestStatus = {
    val __obj = js.Dynamic.literal(expirationTimestamp = expirationTimestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TokenRequestStatus]
  }
}

