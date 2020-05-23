package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSFIDOSignatureAssertion extends MSAssertion {
  val signature: MSFIDOSignature
}

object MSFIDOSignatureAssertion {
  @scala.inline
  def apply(id: java.lang.String, signature: MSFIDOSignature, `type`: MSCredentialType): MSFIDOSignatureAssertion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignatureAssertion]
  }
}

