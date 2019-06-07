package typings
package atPulumiAwsLib.rdsClusterInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance")
@js.native
class ClusterInstance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterInstanceArgs) = this()
  def this(name: java.lang.String, args: ClusterInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of cluster instance
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The identifier of the [`aws_rds_cluster`](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
    */
  val copyTagsToSnapshot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The name of the DB parameter group to associate with this instance.
    */
  val dbParameterGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached [`aws_rds_cluster`](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html).
    */
  val dbSubnetGroupName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The region-unique, immutable identifier for the DB instance.
    */
  val dbiResourceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The DNS address for this instance. May not be writable
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The database engine version.
    */
  val engineVersion: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The indentifier for the RDS instance, if omitted, Terraform will assign a random, unique identifier.
    */
  val identifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The instance class to use. For details on CPU
    * and memory, see [Scaling Aurora DB Instances][4]. Aurora uses `db.*` instance classes/types. Please see [AWS Documentation][7] for currently available instance classes and complete details.
    */
  val instanceClass: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN for the KMS encryption key if one is set to the cluster.
    */
  val kmsKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send
    * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether Performance Insights is enabled or not.
    */
  val performanceInsightsEnabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
    */
  val performanceInsightsKmsKeyId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The database port
    */
  val port: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    * Eg: "04:00-09:00"
    */
  val preferredBackupWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Bool to control if instance is publicly accessible.
    * Default `false`. See the documentation on [Creating DB Instances][6] for more
    * details on controlling this property.
    */
  val publiclyAccessible: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  val storageEncrypted: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceState
  ): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsClusterInstanceMod.ClusterInstance = js.native
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ scala.Boolean = js.native
}

