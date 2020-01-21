package typings.pulumiKubernetes.inputMod.authentication.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Authenticated indicates that the token was associated with a known user.
    */
  var authenticated: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Error indicates that the token couldn't be checked
    */
  var error: js.UndefOr[Input[String]] = js.undefined
  /**
    * User is the UserInfo associated with the provided token.
    */
  var user: js.UndefOr[Input[UserInfo]] = js.undefined
}

object TokenReviewStatus {
  @scala.inline
  def apply(
    audiences: Input[js.Array[Input[String]]] = null,
    authenticated: Input[Boolean] = null,
    error: Input[String] = null,
    user: Input[UserInfo] = null
  ): TokenReviewStatus = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (authenticated != null) __obj.updateDynamic("authenticated")(authenticated.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenReviewStatus]
  }
}

