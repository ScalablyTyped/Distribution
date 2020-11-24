package typings.pulumiAws.dmsCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateArgs extends js.Object {
  
  /**
    * The certificate identifier.
    */
  val certificateId: Input[String] = js.native
  
  /**
    * The contents of the .pem X.509 certificate file for the certificate. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificatePem: js.UndefOr[Input[String]] = js.native
  
  /**
    * The contents of the Oracle Wallet certificate for use with SSL. Either `certificatePem` or `certificateWallet` must be set.
    */
  val certificateWallet: js.UndefOr[Input[String]] = js.native
}
object CertificateArgs {
  
  @scala.inline
  def apply(certificateId: Input[String]): CertificateArgs = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateArgs]
  }
  
  @scala.inline
  implicit class CertificateArgsOps[Self <: CertificateArgs] (val x: Self) extends AnyVal {
    
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
    def setCertificateId(value: Input[String]): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePem(value: Input[String]): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    
    @scala.inline
    def setCertificateWallet(value: Input[String]): Self = this.set("certificateWallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateWallet: Self = this.set("certificateWallet", js.undefined)
  }
}
