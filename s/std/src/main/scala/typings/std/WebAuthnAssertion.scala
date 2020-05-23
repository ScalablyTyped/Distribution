package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAuthnAssertion extends js.Object {
  val authenticatorData: ArrayBuffer
  val clientData: ArrayBuffer
  val credential: ScopedCredential
  val signature: ArrayBuffer
}

object WebAuthnAssertion {
  @scala.inline
  def apply(
    authenticatorData: ArrayBuffer,
    clientData: ArrayBuffer,
    credential: ScopedCredential,
    signature: ArrayBuffer
  ): WebAuthnAssertion = {
    val __obj = js.Dynamic.literal(authenticatorData = authenticatorData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthnAssertion]
  }
}

