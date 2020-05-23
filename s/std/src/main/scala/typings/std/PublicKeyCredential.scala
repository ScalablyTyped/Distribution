package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredential extends Credential {
  val rawId: ArrayBuffer
  val response: AuthenticatorResponse
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
}

