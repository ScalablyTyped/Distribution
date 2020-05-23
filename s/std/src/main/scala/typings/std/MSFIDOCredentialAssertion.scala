package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOCredentialAssertion extends MSAssertion {
  val algorithm: java.lang.String | Algorithm
  val attestation: js.Any
  val publicKey: java.lang.String
  val transportHints: js.Array[MSTransportType]
}

object MSFIDOCredentialAssertion {
  @scala.inline
  def apply(
    algorithm: java.lang.String | Algorithm,
    attestation: js.Any,
    id: java.lang.String,
    publicKey: java.lang.String,
    transportHints: js.Array[MSTransportType],
    `type`: MSCredentialType
  ): MSFIDOCredentialAssertion = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], attestation = attestation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], transportHints = transportHints.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOCredentialAssertion]
  }
}

