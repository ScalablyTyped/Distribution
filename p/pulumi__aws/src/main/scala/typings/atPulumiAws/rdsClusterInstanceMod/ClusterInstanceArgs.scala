package typings.atPulumiAws.rdsClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.rdsEngineTypeMod.EngineType
import typings.atPulumiAws.rdsInstanceTypeMod.InstanceType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceArgs extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The identifier of the [`aws_rds_cluster`](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: Input[String]
  /**
    * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of the DB parameter group to associate with this instance.
    */
  val dbParameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached [`aws_rds_cluster`](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html).
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: js.UndefOr[Input[EngineType]] = js.undefined
  /**
    * The database engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.undefined
  val identifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The instance class to use. For details on CPU
    * and memory, see [Scaling Aurora DB Instances][4]. Aurora uses `db.*` instance classes/types. Please see [AWS Documentation][7] for currently available instance classes and complete details.
    */
  val instanceClass: Input[String | InstanceType]
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The ARN for the IAM role that permits RDS to send
    * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether Performance Insights is enabled or not.
    */
  val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
    */
  val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    * Eg: "04:00-09:00"
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Bool to control if instance is publicly accessible.
    * Default `false`. See the documentation on [Creating DB Instances][6] for more
    * details on controlling this property.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ClusterInstanceArgs {
  @scala.inline
  def apply(
    clusterIdentifier: Input[String],
    instanceClass: Input[String | InstanceType],
    applyImmediately: Input[Boolean] = null,
    autoMinorVersionUpgrade: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    copyTagsToSnapshot: Input[Boolean] = null,
    dbParameterGroupName: Input[String] = null,
    dbSubnetGroupName: Input[String] = null,
    engine: Input[EngineType] = null,
    engineVersion: Input[String] = null,
    identifier: Input[String] = null,
    identifierPrefix: Input[String] = null,
    monitoringInterval: Input[Double] = null,
    monitoringRoleArn: Input[String] = null,
    performanceInsightsEnabled: Input[Boolean] = null,
    performanceInsightsKmsKeyId: Input[String] = null,
    preferredBackupWindow: Input[String] = null,
    preferredMaintenanceWindow: Input[String] = null,
    promotionTier: Input[Double] = null,
    publiclyAccessible: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClusterInstanceArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (copyTagsToSnapshot != null) __obj.updateDynamic("copyTagsToSnapshot")(copyTagsToSnapshot.asInstanceOf[js.Any])
    if (dbParameterGroupName != null) __obj.updateDynamic("dbParameterGroupName")(dbParameterGroupName.asInstanceOf[js.Any])
    if (dbSubnetGroupName != null) __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (identifierPrefix != null) __obj.updateDynamic("identifierPrefix")(identifierPrefix.asInstanceOf[js.Any])
    if (monitoringInterval != null) __obj.updateDynamic("monitoringInterval")(monitoringInterval.asInstanceOf[js.Any])
    if (monitoringRoleArn != null) __obj.updateDynamic("monitoringRoleArn")(monitoringRoleArn.asInstanceOf[js.Any])
    if (performanceInsightsEnabled != null) __obj.updateDynamic("performanceInsightsEnabled")(performanceInsightsEnabled.asInstanceOf[js.Any])
    if (performanceInsightsKmsKeyId != null) __obj.updateDynamic("performanceInsightsKmsKeyId")(performanceInsightsKmsKeyId.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (promotionTier != null) __obj.updateDynamic("promotionTier")(promotionTier.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceArgs]
  }
}

