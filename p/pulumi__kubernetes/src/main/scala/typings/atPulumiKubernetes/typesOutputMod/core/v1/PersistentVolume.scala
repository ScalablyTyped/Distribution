package typings.atPulumiKubernetes.typesOutputMod.core.v1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous
  * to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
  */
trait PersistentVolume extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PersistentVolume
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Spec defines a specification of a persistent volume owned by the cluster. Provisioned by an
    * administrator. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
    */
  val spec: PersistentVolumeSpec
  /**
    * Status represents the current information/status for the persistent volume. Populated by
    * the system. Read-only. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
    */
  val status: PersistentVolumeStatus
}

object PersistentVolume {
  @scala.inline
  def apply(
    apiVersion: typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PersistentVolume,
    metadata: ObjectMeta,
    spec: PersistentVolumeSpec,
    status: PersistentVolumeStatus
  ): PersistentVolume = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistentVolume]
  }
}

