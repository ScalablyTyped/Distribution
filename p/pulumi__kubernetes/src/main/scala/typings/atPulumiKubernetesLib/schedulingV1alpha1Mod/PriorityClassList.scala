package typings
package atPulumiKubernetesLib.schedulingV1alpha1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClassList")
@js.native
class PriorityClassList protected ()
  extends atPulumiKubernetesLib.schedulingV1alpha1PriorityClassListMod.PriorityClassList {
  /**
    * Create a scheduling.v1alpha1.PriorityClassList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClassList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/scheduling/v1alpha1", "PriorityClassList")
@js.native
object PriorityClassList extends js.Object {
  /**
    * Get the state of an existing `PriorityClassList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.schedulingV1alpha1PriorityClassListMod.PriorityClassList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.schedulingV1alpha1PriorityClassListMod.PriorityClassList = js.native
  /**
    * Returns true if the given object is an instance of PriorityClassList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/scheduling/v1alpha1/PriorityClassList.PriorityClassList */ scala.Boolean = js.native
}

