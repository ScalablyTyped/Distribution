package typings.atPulumiAws.dmsReplicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms/replicationSubnetGroup", "ReplicationSubnetGroup")
@js.native
class ReplicationSubnetGroup protected () extends CustomResource {
  /**
    * Create a ReplicationSubnetGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationSubnetGroupArgs) = this()
  def this(name: String, args: ReplicationSubnetGroupArgs, opts: CustomResourceOptions) = this()
  val replicationSubnetGroupArn: Output[String] = js.native
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: Output[String] = js.native
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: Output[String] = js.native
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the VPC the subnet group is in.
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dms/replicationSubnetGroup", "ReplicationSubnetGroup")
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
  def get(name: String, id: Input[ID]): ReplicationSubnetGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState): ReplicationSubnetGroup = js.native
  def get(name: String, id: Input[ID], state: ReplicationSubnetGroupState, opts: CustomResourceOptions): ReplicationSubnetGroup = js.native
  /**
    * Returns true if the given object is an instance of ReplicationSubnetGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationSubnetGroup.ReplicationSubnetGroup */ Boolean = js.native
}

