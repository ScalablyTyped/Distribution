package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
  */
trait ReplicaSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet
  /**
    * If the Labels of a ReplicaSet are empty, they are defaulted to be the same as the Pod(s)
    * that the ReplicaSet manages. Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Spec defines the specification of the desired behavior of the ReplicaSet. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: ReplicaSetSpec
  /**
    * Status is the most recently observed status of the ReplicaSet. This data may be out of date
    * by some window of time. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: ReplicaSetStatus
}

object ReplicaSet {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.ReplicaSet,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: ReplicaSetSpec,
    status: ReplicaSetStatus
  ): ReplicaSet = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[ReplicaSet]
  }
}

