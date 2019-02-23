package typings
package atPulumiAwsLib.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache", "ReplicationGroup")
@js.native
class ReplicationGroup protected ()
  extends atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroup {
  /**
    * Create a ReplicationGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroupArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroupState
  ): atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticacheReplicationGroupMod.ReplicationGroup = js.native
}

