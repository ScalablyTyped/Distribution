package typings.pulumiAws.replicationInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstanceArgs extends js.Object {
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
    * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
    */
  val replicationInstanceClass: Input[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  val replicationInstanceId: Input[String] = js.native
  /**
    * A subnet group to associate with the replication instance.
    */
  val replicationSubnetGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ReplicationInstanceArgs {
  @scala.inline
  def apply(replicationInstanceClass: Input[String], replicationInstanceId: Input[String]): ReplicationInstanceArgs = {
    val __obj = js.Dynamic.literal(replicationInstanceClass = replicationInstanceClass.asInstanceOf[js.Any], replicationInstanceId = replicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationInstanceArgs]
  }
  @scala.inline
  implicit class ReplicationInstanceArgsOps[Self <: ReplicationInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicationInstanceClass(value: Input[String]): Self = this.set("replicationInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationInstanceId(value: Input[String]): Self = this.set("replicationInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocatedStorage(value: Input[Double]): Self = this.set("allocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("allocatedStorage", js.undefined)
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setMultiAz(value: Input[Boolean]): Self = this.set("multiAz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAz: Self = this.set("multiAz", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setReplicationSubnetGroupId(value: Input[String]): Self = this.set("replicationSubnetGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationSubnetGroupId: Self = this.set("replicationSubnetGroupId", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("vpcSecurityGroupIds", js.undefined)
  }
  
}

