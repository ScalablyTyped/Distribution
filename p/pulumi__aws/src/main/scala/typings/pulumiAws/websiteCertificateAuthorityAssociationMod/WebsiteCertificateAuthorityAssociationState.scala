package typings.pulumiAws.websiteCertificateAuthorityAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsiteCertificateAuthorityAssociationState extends js.Object {
  
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the fleet.
    */
  val fleetArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique identifier for the Certificate Authority.
    */
  val websiteCaId: js.UndefOr[Input[String]] = js.native
}
object WebsiteCertificateAuthorityAssociationState {
  
  @scala.inline
  def apply(): WebsiteCertificateAuthorityAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationState]
  }
  
  @scala.inline
  implicit class WebsiteCertificateAuthorityAssociationStateOps[Self <: WebsiteCertificateAuthorityAssociationState] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: Input[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFleetArn(value: Input[String]): Self = this.set("fleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetArn: Self = this.set("fleetArn", js.undefined)
    
    @scala.inline
    def setWebsiteCaId(value: Input[String]): Self = this.set("websiteCaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteCaId: Self = this.set("websiteCaId", js.undefined)
  }
}
