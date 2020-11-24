package typings.pulumiAws.websiteCertificateAuthorityAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsiteCertificateAuthorityAssociationArgs extends js.Object {
  
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: Input[String] = js.native
  
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the fleet.
    */
  val fleetArn: Input[String] = js.native
}
object WebsiteCertificateAuthorityAssociationArgs {
  
  @scala.inline
  def apply(certificate: Input[String], fleetArn: Input[String]): WebsiteCertificateAuthorityAssociationArgs = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
  }
  
  @scala.inline
  implicit class WebsiteCertificateAuthorityAssociationArgsOps[Self <: WebsiteCertificateAuthorityAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setFleetArn(value: Input[String]): Self = this.set("fleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: Input[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
}
