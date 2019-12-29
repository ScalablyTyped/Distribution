package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.storageDotk8sDotioSlashv1alpha1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.storage.v1alpha1.VolumeAttachmentSpec
import typings.atPulumiKubernetes.typesOutputMod.storage.v1alpha1.VolumeAttachmentStatus
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1alpha1/VolumeAttachment", JSImport.Namespace)
@js.native
object storageV1alpha1VolumeAttachmentMod extends js.Object {
  @js.native
  class VolumeAttachment protected () extends CustomResource {
    /**
      * Create a storage.v1alpha1.VolumeAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1.VolumeAttachment) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.storage.v1alpha1.VolumeAttachment,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[storageDotk8sDotioSlashv1alpha1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.VolumeAttachment] = js.native
    /**
      * Standard object metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes
      * system.
      */
    val spec: Output[VolumeAttachmentSpec] = js.native
    /**
      * Status of the VolumeAttachment request. Populated by the entity completing the attach or
      * detach operation, i.e. the external-attacher.
      */
    val status: Output[VolumeAttachmentStatus] = js.native
  }
  
  /* static members */
  @js.native
  object VolumeAttachment extends js.Object {
    /**
      * Get the state of an existing `VolumeAttachment` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): VolumeAttachment = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): VolumeAttachment = js.native
    /**
      * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/VolumeAttachment.VolumeAttachment */ Boolean = js.native
  }
  
}

