package typings.pulumiAws.certificateValidationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateValidationState extends js.Object {
  /**
    * The ARN of the certificate that is being validated.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
    */
  val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object CertificateValidationState {
  @scala.inline
  def apply(): CertificateValidationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidationState]
  }
  @scala.inline
  implicit class CertificateValidationStateOps[Self <: CertificateValidationState] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setValidationRecordFqdnsVarargs(value: Input[String]*): Self = this.set("validationRecordFqdns", js.Array(value :_*))
    @scala.inline
    def setValidationRecordFqdns(value: Input[js.Array[Input[String]]]): Self = this.set("validationRecordFqdns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRecordFqdns: Self = this.set("validationRecordFqdns", js.undefined)
  }
  
}

