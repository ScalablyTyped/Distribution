package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource
  var transports: js.UndefOr[js.Array[AuthenticatorTransport]] = js.undefined
  var `type`: PublicKeyCredentialType
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(
    id: BufferSource,
    `type`: PublicKeyCredentialType,
    transports: js.Array[AuthenticatorTransport] = null
  ): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

