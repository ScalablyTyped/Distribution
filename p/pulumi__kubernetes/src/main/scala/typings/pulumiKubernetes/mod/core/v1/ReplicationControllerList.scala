package typings.pulumiKubernetes.mod.core.v1

import typings.pulumiKubernetes.replicationControllerListMod.ReplicationControllerListArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "core.v1.ReplicationControllerList")
@js.native
class ReplicationControllerList protected ()
  extends typings.pulumiKubernetes.coreMod.v1.ReplicationControllerList {
  /**
    * Create a ReplicationControllerList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ReplicationControllerListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ReplicationControllerListArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes", "core.v1.ReplicationControllerList")
@js.native
object ReplicationControllerList extends js.Object {
  /**
    * Get an existing ReplicationControllerList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.replicationControllerListMod.ReplicationControllerList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.replicationControllerListMod.ReplicationControllerList = js.native
  /**
    * Returns true if the given object is an instance of ReplicationControllerList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/replicationControllerList.ReplicationControllerList */ Boolean = js.native
}

