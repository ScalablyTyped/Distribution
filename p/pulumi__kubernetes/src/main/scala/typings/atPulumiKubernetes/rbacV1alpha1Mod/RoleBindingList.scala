package typings.atPulumiKubernetes.rbacV1alpha1Mod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingList")
@js.native
class RoleBindingList protected ()
  extends typings.atPulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList {
  /**
    * Create a rbac.v1alpha1.RoleBindingList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/rbac/v1alpha1", "RoleBindingList")
@js.native
object RoleBindingList extends js.Object {
  /**
    * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.rbacV1alpha1RoleBindingListMod.RoleBindingList = js.native
  /**
    * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/RoleBindingList.RoleBindingList */ Boolean = js.native
}

