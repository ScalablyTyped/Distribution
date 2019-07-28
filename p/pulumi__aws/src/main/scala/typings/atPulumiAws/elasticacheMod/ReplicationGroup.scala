package typings.atPulumiAws.elasticacheMod

import typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroupArgs
import typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache", "ReplicationGroup")
@js.native
class ReplicationGroup protected ()
  extends typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup {
  /**
    * Create a ReplicationGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationGroupArgs) = this()
  def this(name: String, args: ReplicationGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticache", "ReplicationGroup")
@js.native
object ReplicationGroup extends js.Object {
  /**
    * Get an existing ReplicationGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationGroupState): typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationGroupState, opts: CustomResourceOptions): typings.atPulumiAws.elasticacheReplicationGroupMod.ReplicationGroup = js.native
  /**
    * Returns true if the given object is an instance of ReplicationGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean = js.native
}

