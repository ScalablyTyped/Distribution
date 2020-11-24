package typings.pulumiAws.apnsSandboxChannelMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsSandboxChannelState extends js.Object {
  
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID assigned to your iOS app. To find this value, choose Certificates, IDs & Profiles, choose App IDs in the Identifiers section, and choose your app.
    */
  val bundleId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The pem encoded TLS Certificate from Apple.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The default authentication method used for APNs Sandbox.
    * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
    * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
    * If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
    */
  val defaultAuthenticationMethod: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Certificate Private Key file (ie. `.key` file).
    */
  val privateKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
    */
  val teamId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The `.p8` file that you download from your Apple developer account when you create an authentication key.
    */
  val tokenKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID assigned to your signing key. To find this value, choose Certificates, IDs & Profiles, and choose your key in the Keys section.
    */
  val tokenKeyId: js.UndefOr[Input[String]] = js.native
}
object ApnsSandboxChannelState {
  
  @scala.inline
  def apply(): ApnsSandboxChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsSandboxChannelState]
  }
  
  @scala.inline
  implicit class ApnsSandboxChannelStateOps[Self <: ApnsSandboxChannelState] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setBundleId(value: Input[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setCertificate(value: Input[String]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    
    @scala.inline
    def setDefaultAuthenticationMethod(value: Input[String]): Self = this.set("defaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAuthenticationMethod: Self = this.set("defaultAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: Input[String]): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setTeamId(value: Input[String]): Self = this.set("teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamId: Self = this.set("teamId", js.undefined)
    
    @scala.inline
    def setTokenKey(value: Input[String]): Self = this.set("tokenKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKey: Self = this.set("tokenKey", js.undefined)
    
    @scala.inline
    def setTokenKeyId(value: Input[String]): Self = this.set("tokenKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenKeyId: Self = this.set("tokenKeyId", js.undefined)
  }
}
