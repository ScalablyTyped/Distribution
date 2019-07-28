package typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta2Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta2`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of DaemonSet is deprecated by apps/v1/DaemonSet. See the
  * release notes for more information. DaemonSet represents the configuration of a daemon set.
  */
trait DaemonSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `apps/v1beta2`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSet
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * The desired behavior of this daemon set. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: DaemonSetSpec
  /**
    * The current status of this daemon set. This data may be out of date by some window of time.
    * Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val status: DaemonSetStatus
}

object DaemonSet {
  @scala.inline
  def apply(
    apiVersion: `apps/v1beta2`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.DaemonSet,
    metadata: ObjectMeta,
    spec: DaemonSetSpec,
    status: DaemonSetStatus
  ): DaemonSet = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[DaemonSet]
  }
}

