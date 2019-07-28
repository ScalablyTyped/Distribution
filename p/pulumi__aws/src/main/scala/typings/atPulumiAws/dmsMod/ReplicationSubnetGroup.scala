package typings.atPulumiAws.dmsMod

import typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupArgs
import typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup")
@js.native
class ReplicationSubnetGroup protected ()
  extends typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup {
  /**
    * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationSubnetGroupArgs) = this()
  def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dms", "ReplicationSubnetGroup")
@js.native
object ReplicationSubnetGroup extends js.Object {
  /**
    * Get an existing ReplicationSubnetGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): typings.atPulumiAws.dmsReplicationSubnetGroupMod.ReplicationSubnetGroup = js.native
  /**
    * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
}

