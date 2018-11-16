package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
         * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
         * should always be able to check whether they can perform an action
         */

trait SelfSubjectAccessReview extends js.Object {
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
               * Spec holds information about the request being evaluated.  user and groups must be empty
               */
  val spec: SelfSubjectAccessReviewSpec
  /**
               * Status is filled in by the server and indicates whether the request is allowed or not
               */
  val status: SubjectAccessReviewStatus
}

