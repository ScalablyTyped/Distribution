package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource = js.native
  var transports: js.UndefOr[js.Array[AuthenticatorTransport]] = js.native
  var `type`: PublicKeyCredentialType = js.native
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(id: BufferSource, `type`: PublicKeyCredentialType): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
  @scala.inline
  implicit class PublicKeyCredentialDescriptorOps[Self <: PublicKeyCredentialDescriptor] (val x: Self) extends AnyVal {
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
    def setId(value: BufferSource): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PublicKeyCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportsVarargs(value: AuthenticatorTransport*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[AuthenticatorTransport]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
  }
  
}

