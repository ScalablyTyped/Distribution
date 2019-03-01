package typings
package atPulumiAwsLib.dmsReplicationSubnetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationSubnetGroupState extends js.Object {
  val replicationSubnetGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the VPC the subnet group is in.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ReplicationSubnetGroupState {
  @scala.inline
  def apply(
    replicationSubnetGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationSubnetGroupDescription: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationSubnetGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

