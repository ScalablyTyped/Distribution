package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticatorAssertionResponse extends AuthenticatorResponse {
  val authenticatorData: ArrayBuffer
  val signature: ArrayBuffer
  val userHandle: ArrayBuffer | Null
}

object AuthenticatorAssertionResponse {
  @scala.inline
  def apply(
    authenticatorData: ArrayBuffer,
    clientDataJSON: ArrayBuffer,
    signature: ArrayBuffer,
    userHandle: ArrayBuffer = null
  ): AuthenticatorAssertionResponse = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientDataJSON = clientDataJSON.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userHandle = userHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticatorAssertionResponse]
  }
}

