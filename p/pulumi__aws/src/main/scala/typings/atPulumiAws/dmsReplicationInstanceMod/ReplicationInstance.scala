package typings.atPulumiAws.dmsReplicationInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance")
@js.native
class ReplicationInstance protected () extends CustomResource {
  /**
    * Create a ReplicationInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationInstanceArgs) = this()
  def this(name: String, args: ReplicationInstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
    */
  val allocatedStorage: Output[Double] = js.native
  /**
    * Indicates whether the changes should be applied immediately or during the next maintenance window. Only used when updating an existing resource.
    */
  val applyImmediately: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window.
    */
  val autoMinorVersionUpgrade: Output[Boolean] = js.native
  /**
    * The EC2 Availability Zone that the replication instance will be created in.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The engine version number of the replication instance.
    */
  val engineVersion: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: Output[String] = js.native
  /**
    * Specifies if the replication instance is a multi-az deployment. You cannot set the `availability_zone` parameter if the `multi_az` parameter is set to `true`.
    */
  val multiAz: Output[Boolean] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  val preferredMaintenanceWindow: Output[String] = js.native
  /**
    * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address.
    */
  val publiclyAccessible: Output[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: Output[String] = js.native
  /**
    * The compute and memory capacity of the replication instance as specified by the replication instance class. Can be one of `dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge`
    */
  val replicationInstanceClass: Output[String] = js.native
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  val replicationInstanceId: Output[String] = js.native
  /**
    * A list of the private IP addresses of the replication instance.
    */
  val replicationInstancePrivateIps: Output[js.Array[String]] = js.native
  /**
    * A list of the public IP addresses of the replication instance.
    */
  val replicationInstancePublicIps: Output[js.Array[String]] = js.native
  /**
    * A subnet group to associate with the replication instance.
    */
  val replicationSubnetGroupId: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A list of VPC security group IDs to be used with the replication instance. The VPC security groups must work with the VPC containing the replication instance.
    */
  val vpcSecurityGroupIds: Output[js.Array[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dms/replicationInstance", "ReplicationInstance")
@js.native
object ReplicationInstance extends js.Object {
  /**
    * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ReplicationInstance = js.native
  def get(name: String, id: Input[ID], state: ReplicationInstanceState): ReplicationInstance = js.native
  def get(name: String, id: Input[ID], state: ReplicationInstanceState, opts: CustomResourceOptions): ReplicationInstance = js.native
  /**
    * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ Boolean = js.native
}

