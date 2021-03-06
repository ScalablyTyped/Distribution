package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsRdsMod.EngineType
import typings.pulumiAws.enumsRdsMod.InstanceType
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsClusterInstanceMod {
  
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
  object ClusterInstance {
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = js.native
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = js.native
  }
  
  @js.native
  trait ClusterInstanceArgs extends StObject {
    
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
      * The database engine version
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
    implicit class ClusterInstanceArgsMutableBuilder[Self <: ClusterInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDbParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbParameterGroupNameUndefined: Self = StObject.set(x, "dbParameterGroupName", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      @scala.inline
      def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ClusterInstanceState extends StObject {
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is`false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of cluster instance
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
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
    val clusterIdentifier: js.UndefOr[Input[String]] = js.native
    
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
      * The region-unique, immutable identifier for the DB instance.
      */
    val dbiResourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS address for this instance. May not be writable
      */
    val endpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
      * For information on the difference between the available Aurora MySQL engines
      * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
      * in the Amazon RDS User Guide.
      */
    val engine: js.UndefOr[Input[EngineType]] = js.native
    
    /**
      * The database engine version
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
    val instanceClass: js.UndefOr[Input[String | InstanceType]] = js.native
    
    /**
      * The ARN for the KMS encryption key if one is set to the cluster.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
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
      * The database port
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
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
      * Specifies whether the DB cluster is encrypted.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
      */
    val writer: js.UndefOr[Input[Boolean]] = js.native
  }
  object ClusterInstanceState {
    
    @scala.inline
    def apply(): ClusterInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterInstanceState]
    }
    
    @scala.inline
    implicit class ClusterInstanceStateMutableBuilder[Self <: ClusterInstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      @scala.inline
      def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      @scala.inline
      def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      @scala.inline
      def setDbParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbParameterGroupNameUndefined: Self = StObject.set(x, "dbParameterGroupName", js.undefined)
      
      @scala.inline
      def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      @scala.inline
      def setDbiResourceId(value: Input[String]): Self = StObject.set(x, "dbiResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbiResourceIdUndefined: Self = StObject.set(x, "dbiResourceId", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      @scala.inline
      def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      @scala.inline
      def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      @scala.inline
      def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      @scala.inline
      def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setWriter(value: Input[Boolean]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
