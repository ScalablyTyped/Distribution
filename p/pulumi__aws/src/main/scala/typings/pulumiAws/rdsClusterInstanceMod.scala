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
    
    @JSImport("@pulumi/aws/rds/clusterInstance", "ClusterInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ClusterInstance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterInstance]
    inline def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClusterInstance]
    inline def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClusterInstance]
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/clusterInstance.ClusterInstance */ Boolean]
  }
  
  trait ClusterInstanceArgs extends StObject {
    
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
      * The identifier of the CA certificate for the DB instance.
      */
    val caCertIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.rds.Cluster` in which to launch this instance.
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
      * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` of the attached `aws.rds.Cluster`.
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
      * The database engine version
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance class to use. For details on CPU
      * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
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
      * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true.
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
      * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
      */
    val promotionTier: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Bool to control if instance is publicly accessible.
      * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
      * details on controlling this property.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ClusterInstanceArgs {
    
    inline def apply(clusterIdentifier: Input[String], instanceClass: Input[String | InstanceType]): ClusterInstanceArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterInstanceArgs]
    }
    
    extension [Self <: ClusterInstanceArgs](x: Self) {
      
      inline def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      inline def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      inline def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      inline def setDbParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbParameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setDbParameterGroupNameUndefined: Self = StObject.set(x, "dbParameterGroupName", js.undefined)
      
      inline def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      inline def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      inline def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      inline def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      inline def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      inline def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      inline def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      inline def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      inline def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      inline def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      inline def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ClusterInstanceState extends StObject {
    
    /**
      * Specifies whether any database modifications
      * are applied immediately, or during the next maintenance window. Default is`false`.
      */
    val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of cluster instance
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
      */
    val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the CA certificate for the DB instance.
      */
    val caCertIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the `aws.rds.Cluster` in which to launch this instance.
      */
    val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
      */
    val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of the DB parameter group to associate with this instance.
      */
    val dbParameterGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `dbSubnetGroupName` of the attached `aws.rds.Cluster`.
      */
    val dbSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The region-unique, immutable identifier for the DB instance.
      */
    val dbiResourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DNS address for this instance. May not be writable
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
      * For information on the difference between the available Aurora MySQL engines
      * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
      * in the Amazon RDS User Guide.
      */
    val engine: js.UndefOr[Input[EngineType]] = js.undefined
    
    /**
      * The database engine version
      */
    val engineVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
      */
    val identifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
      */
    val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance class to use. For details on CPU
      * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
      */
    val instanceClass: js.UndefOr[Input[String | InstanceType]] = js.undefined
    
    /**
      * The ARN for the KMS encryption key if one is set to the cluster.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
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
      * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true.
      */
    val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The database port
      */
    val port: js.UndefOr[Input[Double]] = js.undefined
    
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
      * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
      */
    val promotionTier: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Bool to control if instance is publicly accessible.
      * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
      * details on controlling this property.
      */
    val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether the DB cluster is encrypted.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the instance.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
      */
    val writer: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ClusterInstanceState {
    
    inline def apply(): ClusterInstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterInstanceState]
    }
    
    extension [Self <: ClusterInstanceState](x: Self) {
      
      inline def setApplyImmediately(value: Input[Boolean]): Self = StObject.set(x, "applyImmediately", value.asInstanceOf[js.Any])
      
      inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "applyImmediately", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      inline def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "autoMinorVersionUpgrade", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setCaCertIdentifier(value: Input[String]): Self = StObject.set(x, "caCertIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCaCertIdentifierUndefined: Self = StObject.set(x, "caCertIdentifier", js.undefined)
      
      inline def setClusterIdentifier(value: Input[String]): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
      
      inline def setCopyTagsToSnapshot(value: Input[Boolean]): Self = StObject.set(x, "copyTagsToSnapshot", value.asInstanceOf[js.Any])
      
      inline def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "copyTagsToSnapshot", js.undefined)
      
      inline def setDbParameterGroupName(value: Input[String]): Self = StObject.set(x, "dbParameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setDbParameterGroupNameUndefined: Self = StObject.set(x, "dbParameterGroupName", js.undefined)
      
      inline def setDbSubnetGroupName(value: Input[String]): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "dbSubnetGroupName", js.undefined)
      
      inline def setDbiResourceId(value: Input[String]): Self = StObject.set(x, "dbiResourceId", value.asInstanceOf[js.Any])
      
      inline def setDbiResourceIdUndefined: Self = StObject.set(x, "dbiResourceId", js.undefined)
      
      inline def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setEngine(value: Input[EngineType]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      inline def setIdentifier(value: Input[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefix(value: Input[String]): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setInstanceClass(value: Input[String | InstanceType]): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      inline def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setMonitoringInterval(value: Input[Double]): Self = StObject.set(x, "monitoringInterval", value.asInstanceOf[js.Any])
      
      inline def setMonitoringIntervalUndefined: Self = StObject.set(x, "monitoringInterval", js.undefined)
      
      inline def setMonitoringRoleArn(value: Input[String]): Self = StObject.set(x, "monitoringRoleArn", value.asInstanceOf[js.Any])
      
      inline def setMonitoringRoleArnUndefined: Self = StObject.set(x, "monitoringRoleArn", js.undefined)
      
      inline def setPerformanceInsightsEnabled(value: Input[Boolean]): Self = StObject.set(x, "performanceInsightsEnabled", value.asInstanceOf[js.Any])
      
      inline def setPerformanceInsightsEnabledUndefined: Self = StObject.set(x, "performanceInsightsEnabled", js.undefined)
      
      inline def setPerformanceInsightsKmsKeyId(value: Input[String]): Self = StObject.set(x, "performanceInsightsKmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setPerformanceInsightsKmsKeyIdUndefined: Self = StObject.set(x, "performanceInsightsKmsKeyId", js.undefined)
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPreferredBackupWindow(value: Input[String]): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      inline def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
      
      inline def setPreferredMaintenanceWindow(value: Input[String]): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
      
      inline def setPromotionTier(value: Input[Double]): Self = StObject.set(x, "promotionTier", value.asInstanceOf[js.Any])
      
      inline def setPromotionTierUndefined: Self = StObject.set(x, "promotionTier", js.undefined)
      
      inline def setPubliclyAccessible(value: Input[Boolean]): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
      
      inline def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      inline def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setWriter(value: Input[Boolean]): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
