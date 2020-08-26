package typings.pulumiKubernetes.outputMod.authentication.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReviewStatus is the result of the token authentication request.
  */
@js.native
trait TokenReviewStatus extends js.Object {
  /**
    * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
    */
  var audiences: js.Array[String] = js.native
  /**
    * Authenticated indicates that the token was associated with a known user.
    */
  var authenticated: Boolean = js.native
  /**
    * Error indicates that the token couldn't be checked
    */
  var error: String = js.native
  /**
    * User is the UserInfo associated with the provided token.
    */
  var user: UserInfo = js.native
}

object TokenReviewStatus {
  @scala.inline
  def apply(audiences: js.Array[String], authenticated: Boolean, error: String, user: UserInfo): TokenReviewStatus = {
    val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], authenticated = authenticated.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenReviewStatus]
  }
  @scala.inline
  implicit class TokenReviewStatusOps[Self <: TokenReviewStatus] (val x: Self) extends AnyVal {
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
    def setAuthenticated(value: Boolean): Self = this.set("authenticated", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserInfo): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

