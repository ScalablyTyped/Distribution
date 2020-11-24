package typings.pulumiAws.rdsClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsRdsMod.EngineType
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance")
@js.native
class ClusterInstance protected () extends CustomResource {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterInstanceArgs) = this()
  def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: Output_[Boolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of cluster instance
    */
  val arn: Output_[String] = js.native
  
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * The identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: Output_[String] = js.native
  
  /**
    * The identifier of the `aws.rds.Cluster` in which to launch this instance.
    */
  val clusterIdentifier: Output_[String] = js.native
  
  /**
    * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
    */
  val copyTagsToSnapshot: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The name of the DB parameter group to associate with this instance.
    */
  val dbParameterGroupName: Output_[String] = js.native
  
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` of the attached `aws.rds.Cluster`.
    */
  val dbSubnetGroupName: Output_[String] = js.native
  
  /**
    * The region-unique, immutable identifier for the DB instance.
    */
  val dbiResourceId: Output_[String] = js.native
  
  /**
    * The DNS address for this instance. May not be writable
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: Output_[js.UndefOr[EngineType]] = js.native
  
  /**
    * The database engine version
    */
  val engineVersion: Output_[String] = js.native
  
  /**
    * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: Output_[String] = js.native
  
  /**
    * The instance class to use. For details on CPU
    * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
    */
  val instanceClass: Output_[String] = js.native
  
  /**
    * The ARN for the KMS encryption key if one is set to the cluster.
    */
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The ARN for the IAM role that permits RDS to send
    * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: Output_[String] = js.native
  
  /**
    * Specifies whether Performance Insights is enabled or not.
    */
  val performanceInsightsEnabled: Output_[Boolean] = js.native
  
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true.
    */
  val performanceInsightsKmsKeyId: Output_[String] = js.native
  
  /**
    * The database port
    */
  val port: Output_[Double] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    * Eg: "04:00-09:00"
    */
  val preferredBackupWindow: Output_[String] = js.native
  
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: Output_[String] = js.native
  
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
    */
  val promotionTier: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * Bool to control if instance is publicly accessible.
    * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
    * details on controlling this property.
    */
  val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  val storageEncrypted: Output_[Boolean] = js.native
  
  /**
    * A map of tags to assign to the instance.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: Output_[Boolean] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = js.native
  
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = js.native
}
