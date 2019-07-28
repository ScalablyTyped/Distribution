package typings.atPulumiAws.dmsReplicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationSubnetGroupState extends js.Object {
  val replicationSubnetGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The ID of the VPC the subnet group is in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object ReplicationSubnetGroupState {
  @scala.inline
  def apply(
    replicationSubnetGroupArn: Input[String] = null,
    replicationSubnetGroupDescription: Input[String] = null,
    replicationSubnetGroupId: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): ReplicationSubnetGroupState = {
    val __obj = js.Dynamic.literal()
    if (replicationSubnetGroupArn != null) __obj.updateDynamic("replicationSubnetGroupArn")(replicationSubnetGroupArn.asInstanceOf[js.Any])
    if (replicationSubnetGroupDescription != null) __obj.updateDynamic("replicationSubnetGroupDescription")(replicationSubnetGroupDescription.asInstanceOf[js.Any])
    if (replicationSubnetGroupId != null) __obj.updateDynamic("replicationSubnetGroupId")(replicationSubnetGroupId.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroupState]
  }
}

