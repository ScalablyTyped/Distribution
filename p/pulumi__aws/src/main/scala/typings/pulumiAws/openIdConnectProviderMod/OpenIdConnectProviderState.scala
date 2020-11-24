package typings.pulumiAws.openIdConnectProviderMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenIdConnectProviderState extends js.Object {
  
  /**
    * The ARN assigned by AWS for this provider.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
    */
  val clientIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: js.UndefOr[Input[String]] = js.native
}
object OpenIdConnectProviderState {
  
  @scala.inline
  def apply(): OpenIdConnectProviderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIdConnectProviderState]
  }
  
  @scala.inline
  implicit class OpenIdConnectProviderStateOps[Self <: OpenIdConnectProviderState] (val x: Self) extends AnyVal {
    
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
    def setClientIdListsVarargs(value: Input[String]*): Self = this.set("clientIdLists", js.Array(value :_*))
    
    @scala.inline
    def setClientIdLists(value: Input[js.Array[Input[String]]]): Self = this.set("clientIdLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIdLists: Self = this.set("clientIdLists", js.undefined)
    
    @scala.inline
    def setThumbprintListsVarargs(value: Input[String]*): Self = this.set("thumbprintLists", js.Array(value :_*))
    
    @scala.inline
    def setThumbprintLists(value: Input[js.Array[Input[String]]]): Self = this.set("thumbprintLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbprintLists: Self = this.set("thumbprintLists", js.undefined)
    
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
