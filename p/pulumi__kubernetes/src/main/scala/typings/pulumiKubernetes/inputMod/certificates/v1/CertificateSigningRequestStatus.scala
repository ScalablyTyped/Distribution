package typings.pulumiKubernetes.inputMod.certificates.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
  */
@js.native
trait CertificateSigningRequestStatus extends js.Object {
  
  /**
    * certificate is populated with an issued certificate by the signer after an Approved condition is present. This field is set via the /status subresource. Once populated, this field is immutable.
    *
    * If the certificate signing request is denied, a condition of type "Denied" is added and this field remains empty. If the signer cannot issue the certificate, a condition of type "Failed" is added and this field remains empty.
    *
    * Validation requirements:
    *  1. certificate must contain one or more PEM blocks.
    *  2. All PEM blocks must have the "CERTIFICATE" label, contain no headers, and the encoded data
    *   must be a BER-encoded ASN.1 Certificate structure as described in section 4 of RFC5280.
    *  3. Non-PEM content may appear before or after the "CERTIFICATE" PEM blocks and is unvalidated,
    *   to allow for explanatory text as described in section 5.2 of RFC7468.
    *
    * If more than one PEM block is present, and the definition of the requested spec.signerName does not indicate otherwise, the first block is the issued certificate, and subsequent blocks should be treated as intermediate certificates and presented in TLS handshakes.
    *
    * The certificate is encoded in PEM format.
    *
    * When serialized as JSON or YAML, the data is additionally base64-encoded, so it consists of:
    *
    *     base64(
    *     -----BEGIN CERTIFICATE-----
    *     ...
    *     -----END CERTIFICATE-----
    *     )
    */
  var certificate: js.UndefOr[Input[String]] = js.native
  
  /**
    * conditions applied to the request. Known conditions are "Approved", "Denied", and "Failed".
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
