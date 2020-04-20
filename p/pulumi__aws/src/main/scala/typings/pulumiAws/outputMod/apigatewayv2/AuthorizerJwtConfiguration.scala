package typings.pulumiAws.outputMod.apigatewayv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerJwtConfiguration extends js.Object {
  /**
    * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in this list.
    */
  var audiences: js.UndefOr[js.Array[String]] = js.native
  /**
    * The base domain of the identity provider that issues JSON Web Tokens, such as the `endpoint` attribute of the [`aws.cognito.UserPool`](https://www.terraform.io/docs/providers/aws/r/cognito_user_pool.html) resource.
    */
  var issuer: js.UndefOr[String] = js.native
}

object AuthorizerJwtConfiguration {
  @scala.inline
  def apply(audiences: js.Array[String] = null, issuer: String = null): AuthorizerJwtConfiguration = {
    val __obj = js.Dynamic.literal()
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerJwtConfiguration]
  }
}

