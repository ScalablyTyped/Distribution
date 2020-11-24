package typings.pulumiAws.inputMod.apigatewayv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizerJwtConfiguration extends js.Object {
  
  /**
    * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
    */
  var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the `aws.cognito.UserPool` resource.
    */
  var issuer: js.UndefOr[Input[String]] = js.native
}
object AuthorizerJwtConfiguration {
  
  @scala.inline
  def apply(): AuthorizerJwtConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerJwtConfiguration]
  }
  
  @scala.inline
  implicit class AuthorizerJwtConfigurationOps[Self <: AuthorizerJwtConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAudiencesVarargs(value: Input[String]*): Self = this.set("audiences", js.Array(value :_*))
    
    @scala.inline
    def setAudiences(value: Input[js.Array[Input[String]]]): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiences: Self = this.set("audiences", js.undefined)
    
    @scala.inline
    def setIssuer(value: Input[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
  }
}
