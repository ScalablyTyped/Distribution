package typings
package atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns

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
  val audiences: js.Array[java.lang.String]
  /**
    * Token is the opaque bearer token.
    */
  val token: java.lang.String
}

object TokenReviewSpec {
  @scala.inline
  def apply(audiences: js.Array[java.lang.String], token: java.lang.String): TokenReviewSpec = {
    val __obj = js.Dynamic.literal(audiences = audiences, token = token)
  
    __obj.asInstanceOf[TokenReviewSpec]
  }
}

