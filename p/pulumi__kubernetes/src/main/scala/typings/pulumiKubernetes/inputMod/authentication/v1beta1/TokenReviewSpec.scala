package typings.pulumiKubernetes.inputMod.authentication.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TokenReviewSpec is a description of the token authentication request.
  */
trait TokenReviewSpec extends js.Object {
  /**
    * Audiences is a list of the identifiers that the resource server presented with the token
    * identifies as. Audience-aware token authenticators will verify that the token was intended
    * for at least one of the audiences in this list. If no audiences are provided, the audience
    * will default to the audience of the Kubernetes apiserver.
    */
  var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Token is the opaque bearer token.
    */
  var token: js.UndefOr[Input[String]] = js.undefined
}

object TokenReviewSpec {
  @scala.inline
  def apply(audiences: Input[js.Array[Input[String]]] = null, token: Input[String] = null): TokenReviewSpec = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenReviewSpec]
  }
}

