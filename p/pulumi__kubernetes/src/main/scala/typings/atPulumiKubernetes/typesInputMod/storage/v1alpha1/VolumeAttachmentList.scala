package typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.storageDotk8sDotioSlashv1alpha1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeAttachmentList is a collection of VolumeAttachment objects.
  */
trait VolumeAttachmentList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1alpha1]] = js.undefined
  /**
    * Items is the list of VolumeAttachments
    */
  var items: Input[js.Array[Input[VolumeAttachment]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachmentList]] = js.undefined
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object VolumeAttachmentList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[VolumeAttachment]]],
    apiVersion: Input[storageDotk8sDotioSlashv1alpha1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachmentList] = null,
    metadata: Input[ListMeta] = null
  ): VolumeAttachmentList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentList]
  }
}

