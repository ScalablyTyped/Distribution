package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCredentialParameters extends js.Object {
  var alg: COSEAlgorithmIdentifier = js.native
  var `type`: PublicKeyCredentialType = js.native
}

object PublicKeyCredentialParameters {
  @scala.inline
  def apply(alg: COSEAlgorithmIdentifier, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
  @scala.inline
  implicit class PublicKeyCredentialParametersOps[Self <: PublicKeyCredentialParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlg(value: COSEAlgorithmIdentifier): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PublicKeyCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

