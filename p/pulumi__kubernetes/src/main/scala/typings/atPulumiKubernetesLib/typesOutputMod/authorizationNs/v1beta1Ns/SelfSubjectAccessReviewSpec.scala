package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
         * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
         */

trait SelfSubjectAccessReviewSpec extends js.Object {
  /**
               * NonResourceAttributes describes information for a non-resource access request
               */
  val nonResourceAttributes: NonResourceAttributes
  /**
               * ResourceAuthorizationAttributes describes information for a resource access request
               */
  val resourceAttributes: ResourceAttributes
}

