package typings.atPulumiKubernetes.storageV1beta1Mod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment")
@js.native
class VolumeAttachment protected ()
  extends typings.atPulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment {
  /**
    * Create a storage.v1beta1.VolumeAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1beta1Ns.VolumeAttachment,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachment")
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
  def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.storageV1beta1VolumeAttachmentMod.VolumeAttachment = js.native
  /**
    * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/VolumeAttachment.VolumeAttachment */ Boolean = js.native
}

