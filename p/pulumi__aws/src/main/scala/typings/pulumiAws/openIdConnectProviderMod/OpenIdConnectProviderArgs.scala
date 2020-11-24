package typings.pulumiAws.openIdConnectProviderMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenIdConnectProviderArgs extends js.Object {
  
  /**
    * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the clientId parameter on OAuth requests.)
    */
  val clientIdLists: Input[js.Array[Input[String]]] = js.native
  
  /**
    * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
    */
  val thumbprintLists: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The URL of the identity provider. Corresponds to the _iss_ claim.
    */
  val url: Input[String] = js.native
}
object OpenIdConnectProviderArgs {
  
  @scala.inline
  def apply(
    clientIdLists: Input[js.Array[Input[String]]],
    thumbprintLists: Input[js.Array[Input[String]]],
    url: Input[String]
  ): OpenIdConnectProviderArgs = {
    val __obj = js.Dynamic.literal(clientIdLists = clientIdLists.asInstanceOf[js.Any], thumbprintLists = thumbprintLists.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIdConnectProviderArgs]
  }
  
  @scala.inline
  implicit class OpenIdConnectProviderArgsOps[Self <: OpenIdConnectProviderArgs] (val x: Self) extends AnyVal {
    
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
    def setClientIdListsVarargs(value: Input[String]*): Self = this.set("clientIdLists", js.Array(value :_*))
    
    @scala.inline
    def setClientIdLists(value: Input[js.Array[Input[String]]]): Self = this.set("clientIdLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintListsVarargs(value: Input[String]*): Self = this.set("thumbprintLists", js.Array(value :_*))
    
    @scala.inline
    def setThumbprintLists(value: Input[js.Array[Input[String]]]): Self = this.set("thumbprintLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Input[String]): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
