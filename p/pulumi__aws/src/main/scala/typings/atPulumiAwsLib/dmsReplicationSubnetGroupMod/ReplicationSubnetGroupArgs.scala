package typings
package atPulumiAwsLib.dmsReplicationSubnetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationSubnetGroupArgs extends js.Object {
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object ReplicationSubnetGroupArgs {
  @scala.inline
  def apply(
    replicationSubnetGroupDescription: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    replicationSubnetGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ReplicationSubnetGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("replicationSubnetGroupDescription")(replicationSubnetGroupDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("replicationSubnetGroupId")(replicationSubnetGroupId.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroupArgs]
  }
}

