package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Pod is a collection of containers that can run on a host. This resource is created by clients
         * and scheduled onto hosts.
         */

trait Pod extends js.Object {
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
  /**
               * Standard object's metadata. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
               */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
               * Specification of the desired behavior of the pod. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val spec: PodSpec
  /**
               * Most recently observed status of the pod. This data may not be up to date. Populated by the
               * system. Read-only. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val status: PodStatus
}

