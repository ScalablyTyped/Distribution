package typings.pulumiKubernetes.coreV1Mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1", "ComponentStatus")
@js.native
class ComponentStatus protected ()
  extends typings.pulumiKubernetes.componentStatusMod.ComponentStatus {
  /**
    * Create a core.v1.ComponentStatus resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.pulumiKubernetes.inputMod.core.v1.ComponentStatus) = this()
  def this(
    name: String,
    args: typings.pulumiKubernetes.inputMod.core.v1.ComponentStatus,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1", "ComponentStatus")
@js.native
object ComponentStatus extends js.Object {
  /**
    * Get the state of an existing `ComponentStatus` resource, as identified by `id`.
    * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
    * Kubernetes convention) the ID becomes `default/<name>`.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.componentStatusMod.ComponentStatus = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.componentStatusMod.ComponentStatus = js.native
  /**
    * Returns true if the given object is an instance of ComponentStatus.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/ComponentStatus.ComponentStatus */ Boolean = js.native
}

