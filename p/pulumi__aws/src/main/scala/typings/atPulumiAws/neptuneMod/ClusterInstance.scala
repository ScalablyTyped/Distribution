package typings.atPulumiAws.neptuneMod

import typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstanceArgs
import typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstanceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune", "ClusterInstance")
@js.native
class ClusterInstance protected ()
  extends typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterInstanceArgs) = this()
  def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/neptune", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState): typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.neptuneClusterInstanceMod.ClusterInstance = js.native
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
}

