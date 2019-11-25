package typings.atPulumiKubernetes.typesOutputMod.storage.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachment captures the intent to attach or detach the specified volume to/from the
  * specified node.
  *
  * VolumeAttachment objects are non-namespaced.
  */
trait VolumeAttachment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `storageDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachment
  /**
    * Standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
    * system.
    */
  val spec: VolumeAttachmentSpec
  /**
    * Status of the VolumeAttachment request. Populated by the entity completing the attach or
    * detach operation, i.e. the external-attacher.
    */
  val status: VolumeAttachmentStatus
}

object VolumeAttachment {
  @scala.inline
  def apply(
    apiVersion: `storageDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachment,
    metadata: ObjectMeta,
    spec: VolumeAttachmentSpec,
    status: VolumeAttachmentStatus
  ): VolumeAttachment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VolumeAttachment]
  }
}

