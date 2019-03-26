package typings
package atPulumiKubernetesLib.storageV1beta1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList")
@js.native
class CSIDriverList protected ()
  extends atPulumiKubernetesLib.storageV1beta1CSIDriverListMod.CSIDriverList {
  /**
    * Create a storage.v1beta1.CSIDriverList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.CSIDriverList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.storageNs.v1beta1Ns.CSIDriverList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/storage/v1beta1", "CSIDriverList")
@js.native
object CSIDriverList extends js.Object {
  /**
    * Get the state of an existing `CSIDriverList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.storageV1beta1CSIDriverListMod.CSIDriverList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.storageV1beta1CSIDriverListMod.CSIDriverList = js.native
}

