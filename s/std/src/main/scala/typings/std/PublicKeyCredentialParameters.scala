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
    val __obj = js.Dynamic.literal(alg = alg)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
}

