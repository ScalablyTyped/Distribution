package typings.atPulumiAws.dmsMod

import typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceArgs
import typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstanceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", "ReplicationInstance")
@js.native
class ReplicationInstance protected ()
  extends typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance {
  /**
    * Create a ReplicationInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationInstanceArgs) = this()
  def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dms", "ReplicationInstance")
@js.native
object ReplicationInstance extends js.Object {
  /**
    * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
  def get(name: String, id: Input[ID], state: ReplicationInstanceState): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
  def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): typings.atPulumiAws.dmsReplicationInstanceMod.ReplicationInstance = js.native
  /**
    * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
}

