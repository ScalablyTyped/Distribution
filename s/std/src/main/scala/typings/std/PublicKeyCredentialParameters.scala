package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialParameters extends js.Object {
  var alg: COSEAlgorithmIdentifier
  var `type`: PublicKeyCredentialType
}

object PublicKeyCredentialParameters {
  @scala.inline
  def apply(alg: COSEAlgorithmIdentifier, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
}

