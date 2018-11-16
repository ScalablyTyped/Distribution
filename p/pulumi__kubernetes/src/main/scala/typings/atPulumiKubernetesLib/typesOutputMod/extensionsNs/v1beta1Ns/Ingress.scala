package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Ingress is a collection of rules that allow inbound connections to reach the endpoints
         * defined by a backend. An Ingress can be configured to give services externally-reachable
         * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
         */

trait Ingress extends js.Object {
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
               * Spec is the desired state of the Ingress. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val spec: IngressSpec
  /**
               * Status is the current state of the Ingress. More info:
               * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
               */
  val status: IngressStatus
}

