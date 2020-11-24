package typings.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typings.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateAuthorityState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: js.UndefOr[Input[CertificateAuthorityCertificateAuthorityConfiguration]] = js.native
  
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: js.UndefOr[Input[String]] = js.native
  
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfiguration]] = js.native
  
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: js.UndefOr[Input[String]] = js.native
  
  /**
    * Status of the certificate authority.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object CertificateAuthorityState {
  
  @scala.inline
  def apply(): CertificateAuthorityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityState]
  }
  
  @scala.inline
  implicit class CertificateAuthorityStateOps[Self <: CertificateAuthorityState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCertificate(value: Input[String]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setCertificateAuthorityConfiguration(value: Input[CertificateAuthorityCertificateAuthorityConfiguration]): Self = this.set("certificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateAuthorityConfiguration: Self = this.set("certificateAuthorityConfiguration", js.undefined)
    
    @scala.inline
    def setCertificateChain(value: Input[String]): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    
    @scala.inline
    def setCertificateSigningRequest(value: Input[String]): Self = this.set("certificateSigningRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateSigningRequest: Self = this.set("certificateSigningRequest", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setNotAfter(value: Input[String]): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: Input[String]): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
    
    @scala.inline
    def setPermanentDeletionTimeInDays(value: Input[Double]): Self = this.set("permanentDeletionTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermanentDeletionTimeInDays: Self = this.set("permanentDeletionTimeInDays", js.undefined)
    
    @scala.inline
    def setRevocationConfiguration(value: Input[CertificateAuthorityRevocationConfiguration]): Self = this.set("revocationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationConfiguration: Self = this.set("revocationConfiguration", js.undefined)
    
    @scala.inline
    def setSerial(value: Input[String]): Self = this.set("serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
