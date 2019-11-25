package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated apps/v1beta1/StatefulSet is not supported by Kubernetes 1.16+ clusters. Use
  * apps/v1/StatefulSet instead.
  *
  * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
  *  - Network: A single stable DNS and hostname.
  *  - Storage: As many VolumeClaims as requested.
  * The StatefulSet guarantees that a given network identity will always map to the same storage
  * identity.
  */
trait StatefulSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `apps/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet
  val metadata: ObjectMeta
  /**
    * Spec defines the desired identities of pods in this set.
    */
  val spec: StatefulSetSpec
  /**
    * Status is the current status of Pods in this StatefulSet. This data may be out of date by
    * some window of time.
    */
  val status: StatefulSetStatus
}

object StatefulSet {
  @scala.inline
  def apply(
    apiVersion: `apps/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet,
    metadata: ObjectMeta,
    spec: StatefulSetSpec,
    status: StatefulSetStatus
  ): StatefulSet = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatefulSet]
  }
}

