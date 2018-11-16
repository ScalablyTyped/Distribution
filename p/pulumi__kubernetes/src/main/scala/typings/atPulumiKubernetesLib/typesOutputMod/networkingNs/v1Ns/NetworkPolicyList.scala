package typings
package atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * NetworkPolicyList is a list of NetworkPolicy objects.
         */

trait NetworkPolicyList extends js.Object {
  /**
               * APIVersion defines the versioned schema of this representation of an object. Servers should
               * convert recognized schemas to the latest internal value, and may reject unrecognized
               * values. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
               */
  val apiVersion: java.lang.String
  /**
               * Items is a list of schema objects.
               */
  val items: js.Array[NetworkPolicy]
  /**
               * Kind is a string value representing the REST resource this object represents. Servers may
               * infer this from the endpoint the client submits requests to. Cannot be updated. In
               * CamelCase. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
               */
  val kind: java.lang.String
  /**
               * Standard list metadata. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

