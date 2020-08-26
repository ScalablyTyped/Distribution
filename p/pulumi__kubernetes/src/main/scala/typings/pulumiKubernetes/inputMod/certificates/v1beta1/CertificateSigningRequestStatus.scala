package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSigningRequestStatus extends js.Object {
  /**
    * If request was approved, the controller will place the issued certificate here.
    */
  var certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Conditions applied to the request, such as approval or denial.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.native
}

object CertificateSigningRequestStatus {
  @scala.inline
  def apply(): CertificateSigningRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSigningRequestStatus]
  }
  @scala.inline
  implicit class CertificateSigningRequestStatusOps[Self <: CertificateSigningRequestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: Input[String]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Input[CertificateSigningRequestCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[CertificateSigningRequestCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
  
}

