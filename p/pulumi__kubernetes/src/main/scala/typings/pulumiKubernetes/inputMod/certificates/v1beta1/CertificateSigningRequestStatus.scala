package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait CertificateSigningRequestStatus extends js.Object {
  /**
    * If request was approved, the controller will place the issued certificate here.
    */
  var certificate: js.UndefOr[Input[String]] = js.undefined
  /**
    * Conditions applied to the request, such as approval or denial.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CertificateSigningRequestCondition]]]] = js.undefined
}

object CertificateSigningRequestStatus {
  @scala.inline
  def apply(
    certificate: Input[String] = null,
    conditions: Input[js.Array[Input[CertificateSigningRequestCondition]]] = null
  ): CertificateSigningRequestStatus = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestStatus]
  }
}

