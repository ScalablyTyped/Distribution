package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSFIDOSignature extends js.Object {
  val authnrData: java.lang.String = js.native
  val clientData: java.lang.String = js.native
  val signature: java.lang.String = js.native
}

object MSFIDOSignature {
  @scala.inline
  def apply(authnrData: java.lang.String, clientData: java.lang.String, signature: java.lang.String): MSFIDOSignature = {
    val __obj = js.Dynamic.literal(authnrData = authnrData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignature]
  }
  @scala.inline
  implicit class MSFIDOSignatureOps[Self <: MSFIDOSignature] (val x: Self) extends AnyVal {
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
    def setAuthnrData(value: java.lang.String): Self = this.set("authnrData", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientData(value: java.lang.String): Self = this.set("clientData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: java.lang.String): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

