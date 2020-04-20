package typings.pulumiKubernetes.outputMod.authentication.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReviewStatus is the result of the token authentication request.
  */
trait TokenReviewStatus extends js.Object {
  /**
    * Audiences are audience identifiers chosen by the authenticator that are compatible with
    * both the TokenReview and token. An identifier is any identifier in the intersection of the
    * TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that
    * sets the spec.audiences field should validate that a compatible audience identifier is
    * returned in the status.audiences field to ensure that the TokenReview server is audience
    * aware. If a TokenReview returns an empty status.audience field where status.authenticated
    * is "true", the token is valid against the audience of the Kubernetes API server.
    */
  val audiences: js.Array[String]
  /**
    * Authenticated indicates that the token was associated with a known user.
    */
  val authenticated: Boolean
  /**
    * Error indicates that the token couldn't be checked
    */
  val error: String
  /**
    * User is the UserInfo associated with the provided token.
    */
  val user: UserInfo
}

object TokenReviewStatus {
  @scala.inline
  def apply(audiences: js.Array[String], authenticated: Boolean, error: String, user: UserInfo): TokenReviewStatus = {
    val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], authenticated = authenticated.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenReviewStatus]
  }
}

