package typings.pulumiAws.rdsClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.engineTypeMod.EngineType
import typings.pulumiAws.rdsInstanceTypeMod.InstanceType
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInstanceArgs extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of the `aws.rds.Cluster` in which to launch this instance.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the DB parameter group to associate with this instance.
    */
  val dbParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` of the attached `aws.rds.Cluster`.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: js.UndefOr[Input[EngineType]] = js.native
  /**
    * The database engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The instance class to use. For details on CPU
    * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
    */
  val instanceClass: Input[String | InstanceType] = js.native
  /**
    * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN for the IAM role that permits RDS to send
    * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether Performance Insights is enabled or not.
    */
  val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true.
    */
  val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    * Eg: "04:00-09:00"
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
    */
  val promotionTier: js.UndefOr[Input[Double]] = js.native
  /**
    * Bool to control if instance is publicly accessible.
    * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
    * details on controlling this property.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A map of tags to assign to the instance.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ClusterInstanceArgs {
  @scala.inline
  def apply(clusterIdentifier: Input[String], instanceClass: Input[String | InstanceType]): ClusterInstanceArgs = {
    val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceArgs]
  }
  @scala.inline
  implicit class ClusterInstanceArgsOps[Self <: ClusterInstanceArgs] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceClass(value: Input[String | InstanceType]): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
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
    def setCaCertIdentifier(value: Input[String]): Self = this.set("caCertIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaCertIdentifier: Self = this.set("caCertIdentifier", js.undefined)
    @scala.inline
    def setCopyTagsToSnapshot(value: Input[Boolean]): Self = this.set("copyTagsToSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("copyTagsToSnapshot", js.undefined)
    @scala.inline
    def setDbParameterGroupName(value: Input[String]): Self = this.set("dbParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbParameterGroupName: Self = this.set("dbParameterGroupName", js.undefined)
    @scala.inline
    def setDbSubnetGroupName(value: Input[String]): Self = this.set("dbSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("dbSubnetGroupName", js.undefined)
    @scala.inline
    def setEngine(value: Input[EngineType]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setIdentifier(value: Input[String]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIdentifierPrefix(value: Input[String]): Self = this.set("identifierPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifierPrefix: Self = this.set("identifierPrefix", js.undefined)
    @scala.inline
    def setMonitoringInterval(value: Input[Double]): Self = this.set("monitoringInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringInterval: Self = this.set("monitoringInterval", js.undefined)
    @scala.inline
    def setMonitoringRoleArn(value: Input[String]): Self = this.set("monitoringRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringRoleArn: Self = this.set("monitoringRoleArn", js.undefined)
    @scala.inline
    def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = this.set("performanceInsightsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsEnabled: Self = this.set("performanceInsightsEnabled", js.undefined)
    @scala.inline
    def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = this.set("performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceInsightsKmsKeyId: Self = this.set("performanceInsightsKmsKeyId", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: Input[String]): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("preferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPromotionTier(value: Input[Double]): Self = this.set("promotionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionTier: Self = this.set("promotionTier", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

