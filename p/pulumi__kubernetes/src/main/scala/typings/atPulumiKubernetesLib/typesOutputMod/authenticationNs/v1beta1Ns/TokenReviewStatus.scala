package typings
package atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * TokenReviewStatus is the result of the token authentication request.
         */

trait TokenReviewStatus extends js.Object {
  /**
               * Authenticated indicates that the token was associated with a known user.
               */
  val authenticated: scala.Boolean
  /**
               * Error indicates that the token couldn't be checked
               */
  val error: java.lang.String
  /**
               * User is the UserInfo associated with the provided token.
               */
  val user: UserInfo
}

