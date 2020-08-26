package typings.pulumiKubernetes.coreMod.v1

import typings.pulumiKubernetes.componentStatusMod.ComponentStatusArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core", "v1.ComponentStatus")
@js.native
class ComponentStatus protected ()
  extends typings.pulumiKubernetes.coreV1Mod.ComponentStatus {
  /**
    * Create a ComponentStatus resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ComponentStatusArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ComponentStatusArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/core", "v1.ComponentStatus")
@js.native
object ComponentStatus extends js.Object {
  /**
    * Get an existing ComponentStatus resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.componentStatusMod.ComponentStatus = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.componentStatusMod.ComponentStatus = js.native
  /**
    * Returns true if the given object is an instance of ComponentStatus.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/componentStatus.ComponentStatus */ Boolean = js.native
}

