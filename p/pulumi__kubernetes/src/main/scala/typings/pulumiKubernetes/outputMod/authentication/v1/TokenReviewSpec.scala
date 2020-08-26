package typings.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReviewSpec is a description of the token authentication request.
  */
@js.native
trait TokenReviewSpec extends js.Object {
  /**
    * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
    */
  var audiences: js.Array[String] = js.native
  /**
    * Token is the opaque bearer token.
    */
  var token: String = js.native
}

object TokenReviewSpec {
  @scala.inline
  def apply(audiences: js.Array[String], token: String): TokenReviewSpec = {
    val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
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
    def setAudiencesVarargs(value: String*): Self = this.set("audiences", js.Array(value :_*))
    @scala.inline
    def setAudiences(value: js.Array[String]): Self = this.set("audiences", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

