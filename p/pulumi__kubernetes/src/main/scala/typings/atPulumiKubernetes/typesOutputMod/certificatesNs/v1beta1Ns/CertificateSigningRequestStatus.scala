package typings.atPulumiKubernetes.typesOutputMod.certificatesNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSigningRequestStatus extends js.Object {
  /**
    * If request was approved, the controller will place the issued certificate here.
    */
  val certificate: String
  /**
    * Conditions applied to the request, such as approval or denial.
    */
  val conditions: js.Array[CertificateSigningRequestCondition]
}

object CertificateSigningRequestStatus {
  @scala.inline
  def apply(certificate: String, conditions: js.Array[CertificateSigningRequestCondition]): CertificateSigningRequestStatus = {
    val __obj = js.Dynamic.literal(certificate = certificate, conditions = conditions)
  
    __obj.asInstanceOf[CertificateSigningRequestStatus]
  }
}

