package typings.pulumiAws.iotCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateState extends js.Object {
  
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The ARN of the created certificate.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The certificate data, in PEM format.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  
  /**
    * The certificate signing request. Review
    * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on generating a certificate from a certificate signing request (CSR).
    * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
    * for more information on generating keys and a certificate.
    */
  val csr: js.UndefOr[Input[String]] = js.native
  
  /**
    * When no CSR is provided, the private key.
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * When no CSR is provided, the public key.
    */
  val publicKey: js.UndefOr[Input[String]] = js.native
}
object CertificateState {
  
  @scala.inline
  def apply(): CertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateState]
  }
  
  @scala.inline
  implicit class CertificateStateOps[Self <: CertificateState] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Input[Boolean]): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: Input[String]): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    
    @scala.inline
    def setCsr(value: Input[String]): Self = this.set("csr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsr: Self = this.set("csr", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: Input[String]): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setPublicKey(value: Input[String]): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKey: Self = this.set("publicKey", js.undefined)
  }
}
