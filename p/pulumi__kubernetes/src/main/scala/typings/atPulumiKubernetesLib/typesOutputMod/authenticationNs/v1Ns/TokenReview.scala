package typings
package atPulumiKubernetesLib.typesOutputMod.authenticationNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
         * be cached by the webhook token authenticator plugin in the kube-apiserver.
         */

trait TokenReview extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * Spec holds information about the request being evaluated
               */
  val spec: TokenReviewSpec
  /**
               * Status is filled in by the server and indicates whether the request can be authenticated.
               */
  val status: TokenReviewStatus
}

