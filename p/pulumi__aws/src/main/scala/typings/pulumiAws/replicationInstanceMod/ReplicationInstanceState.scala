package typings.pulumiAws.replicationInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstanceState extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the replication instance will be created in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The engine version number of the replication instance.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kmsKeyArn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies if the replication instance is a multi-az deployment. You cannot set the `availabilityZone` parameter if the `multiAz` parameter is set to `true`.
    */
  val multiAz: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
    */
  val replicationInstanceClass: js.UndefOr[Input[String]] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  val replicationInstanceId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of the private IP addresses of the replication instance.
    */
  val replicationInstancePrivateIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of the public IP addresses of the replication instance.
    */
  val replicationInstancePublicIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A subnet group to associate with the replication instance.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ReplicationInstanceState {
  @scala.inline
  def apply(
    allocatedStorage: Input[Double] = null,
    applyImmediately: Input[Boolean] = null,
    autoMinorVersionUpgrade: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    engineVersion: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    multiAz: Input[Boolean] = null,
    preferredMaintenanceWindow: Input[String] = null,
    publiclyAccessible: Input[Boolean] = null,
    replicationInstanceArn: Input[String] = null,
    replicationInstanceClass: Input[String] = null,
    replicationInstanceId: Input[String] = null,
    replicationInstancePrivateIps: Input[js.Array[Input[String]]] = null,
    replicationInstancePublicIps: Input[js.Array[Input[String]]] = null,
    replicationSubnetGroupId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcSecurityGroupIds: Input[js.Array[Input[String]]] = null
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

