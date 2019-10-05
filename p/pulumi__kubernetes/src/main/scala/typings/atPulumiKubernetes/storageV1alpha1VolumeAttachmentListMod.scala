package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.storageV1alpha1VolumeAttachmentListMod.VolumeAttachmentList
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typings.atPulumiKubernetes.typesOutputMod.storage.v1alpha1.VolumeAttachment
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1alpha1/VolumeAttachmentList", JSImport.Namespace)
@js.native
object storageV1alpha1VolumeAttachmentListMod extends js.Object {
  @js.native
  class VolumeAttachmentList protected () extends CustomResource {
    /**
      * Create a storage.v1alpha1.VolumeAttachmentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1.VolumeAttachmentList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1.VolumeAttachmentList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[`storageDOTk8sDOTio/v1alpha1`] = js.native
    /**
      * Items is the list of VolumeAttachments
      */
    val items: Output[js.Array[VolumeAttachment]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachmentList] = js.native
    /**
      * Standard list metadata More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object VolumeAttachmentList extends js.Object {
    /**
      * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): VolumeAttachmentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): VolumeAttachmentList = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/VolumeAttachmentList.VolumeAttachmentList */ Boolean = js.native
  }
  
}

