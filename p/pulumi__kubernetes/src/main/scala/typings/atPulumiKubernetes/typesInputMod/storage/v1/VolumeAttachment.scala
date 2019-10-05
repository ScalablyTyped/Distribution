package typings.atPulumiKubernetes.typesInputMod.storage.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[`storageDOTk8sDOTio/v1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachment]] = js.undefined
  /**
    * Standard object metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
    * system.
    */
  var spec: Input[VolumeAttachmentSpec]
}

object VolumeAttachment {
  @scala.inline
  def apply(
    spec: Input[VolumeAttachmentSpec],
    apiVersion: Input[`storageDOTk8sDOTio/v1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachment] = null,
    metadata: Input[ObjectMeta] = null
  ): VolumeAttachment = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachment]
  }
}

