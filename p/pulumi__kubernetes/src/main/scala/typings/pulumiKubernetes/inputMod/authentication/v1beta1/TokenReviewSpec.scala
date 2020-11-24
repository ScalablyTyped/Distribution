package typings.pulumiKubernetes.inputMod.authentication.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TokenReviewSpec is a description of the token authentication request.
  */
@js.native
trait TokenReviewSpec extends js.Object {
  
  /**
    * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
    */
  var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Token is the opaque bearer token.
    */
  var token: js.UndefOr[Input[String]] = js.native
}
object TokenReviewSpec {
  
  @scala.inline
  def apply(): TokenReviewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenReviewSpec]
  }
  
  @scala.inline
  implicit class TokenReviewSpecOps[Self <: TokenReviewSpec] (val x: Self) extends AnyVal {
    
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
    def setToken(value: Input[String]): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
