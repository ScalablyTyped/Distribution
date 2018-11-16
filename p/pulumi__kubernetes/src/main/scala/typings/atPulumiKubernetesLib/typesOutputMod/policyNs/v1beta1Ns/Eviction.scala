package typings
package atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Eviction evicts a pod from its node subject to certain policies and safety constraints. This
         * is a subresource of Pod.  A request to cause such an eviction is created by POSTing to
         * .../pods/<pod name>/evictions.
         */

trait Eviction extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * DeleteOptions may be provided
               */
  val deleteOptions: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.DeleteOptions
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * ObjectMeta describes the pod that is being evicted.
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
}

