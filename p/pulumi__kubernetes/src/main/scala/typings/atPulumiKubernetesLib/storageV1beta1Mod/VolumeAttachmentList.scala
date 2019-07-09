package typings
package atPulumiKubernetesLib.storageV1beta1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList")
@js.native
class VolumeAttachmentList protected ()
  extends atPulumiKubernetesLib.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList {
  /**
    * Create a storage.v1beta1.VolumeAttachmentList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.VolumeAttachmentList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/storage/v1beta1", "VolumeAttachmentList")
@js.native
object VolumeAttachmentList extends js.Object {
  /**
    * Get the state of an existing `VolumeAttachmentList` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.storageV1beta1VolumeAttachmentListMod.VolumeAttachmentList = js.native
  /**
    * Returns true if the given object is an instance of VolumeAttachmentList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/VolumeAttachmentList.VolumeAttachmentList */ scala.Boolean = js.native
}

