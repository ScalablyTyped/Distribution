package typings.pulumiAws.inputMod.ec2clientvpn

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointAuthenticationOption extends js.Object {
  
  /**
    * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
    */
  var activeDirectoryId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
    */
  var rootCertificateChainArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the IAM SAML identity provider if type is `federated-authentication`.
    */
  var samlProviderArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
    */
  var `type`: Input[String] = js.native
}
object EndpointAuthenticationOption {
  
  @scala.inline
  def apply(`type`: Input[String]): EndpointAuthenticationOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthenticationOption]
  }
  
  @scala.inline
  implicit class EndpointAuthenticationOptionOps[Self <: EndpointAuthenticationOption] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryId(value: Input[String]): Self = this.set("activeDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDirectoryId: Self = this.set("activeDirectoryId", js.undefined)
    
    @scala.inline
    def setRootCertificateChainArn(value: Input[String]): Self = this.set("rootCertificateChainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCertificateChainArn: Self = this.set("rootCertificateChainArn", js.undefined)
    
    @scala.inline
    def setSamlProviderArn(value: Input[String]): Self = this.set("samlProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamlProviderArn: Self = this.set("samlProviderArn", js.undefined)
  }
}
