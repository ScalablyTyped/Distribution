package typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of StatefulSet is deprecated by apps/v1beta2/StatefulSet. See
  * the release notes for more information. StatefulSet represents a set of pods with consistent
  * identities. Identities are defined as:
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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `apps/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[StatefulSet]
  }
}

