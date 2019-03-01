package typings
package atPulumiAwsLib.dmsReplicationInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationInstanceState extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
    */
  val allocatedStorage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The EC2 Availability Zone that the replication instance will be created in.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The engine version number of the replication instance.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
    */
  val multiAz: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
    */
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
    */
  val replicationInstanceClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  val replicationInstanceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of the private IP addresses of the replication instance.
    */
  val replicationInstancePrivateIps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of the public IP addresses of the replication instance.
    */
  val replicationInstancePublicIps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A subnet group to associate with the replication instance.
    */
  val replicationSubnetGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
    */
  val vpcSecurityGroupIds: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object ReplicationInstanceState {
  @scala.inline
  def apply(
    allocatedStorage: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    applyImmediately: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    autoMinorVersionUpgrade: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    multiAz: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    preferredMaintenanceWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    publiclyAccessible: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    replicationInstanceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationInstanceClass: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationInstanceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    replicationInstancePrivateIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    replicationInstancePublicIps: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    replicationSubnetGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcSecurityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): ReplicationInstanceState = {
    val __obj = js.Dynamic.literal()
    if (allocatedStorage != null) __obj.updateDynamic("allocatedStorage")(allocatedStorage.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (multiAz != null) __obj.updateDynamic("multiAz")(multiAz.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (replicationInstanceArn != null) __obj.updateDynamic("replicationInstanceArn")(replicationInstanceArn.asInstanceOf[js.Any])
    if (replicationInstanceClass != null) __obj.updateDynamic("replicationInstanceClass")(replicationInstanceClass.asInstanceOf[js.Any])
    if (replicationInstanceId != null) __obj.updateDynamic("replicationInstanceId")(replicationInstanceId.asInstanceOf[js.Any])
    if (replicationInstancePrivateIps != null) __obj.updateDynamic("replicationInstancePrivateIps")(replicationInstancePrivateIps.asInstanceOf[js.Any])
    if (replicationInstancePublicIps != null) __obj.updateDynamic("replicationInstancePublicIps")(replicationInstancePublicIps.asInstanceOf[js.Any])
    if (replicationSubnetGroupId != null) __obj.updateDynamic("replicationSubnetGroupId")(replicationSubnetGroupId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcSecurityGroupIds != null) __obj.updateDynamic("vpcSecurityGroupIds")(vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationInstanceState]
  }
}

