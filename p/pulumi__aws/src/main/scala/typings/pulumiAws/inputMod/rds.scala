package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rds {
  
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * "immediate" (default), or "pending-reboot". Some
      * engines can't apply some parameters without a reboot, and you will need to
      * specify "pending-reboot" here.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the DB parameter.
      */
    var name: Input[String]
    
    /**
      * The value of the DB parameter.
      */
    var value: Input[String]
  }
  object ClusterParameterGroupParameter {
    
    inline def apply(name: Input[String], value: Input[String]): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    extension [Self <: ClusterParameterGroupParameter](x: Self) {
      
      inline def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterRestoreToPointInTime extends StObject {
    
    /**
      * Date and time in UTC format to restore the database cluster to. Conflicts with `useLatestRestorableTime`.
      */
    var restoreToTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Type of restore to be performed.
      * Valid options are `full-copy` (default) and `copy-on-write`.
      */
    var restoreType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the source database cluster from which to restore.
      */
    var sourceClusterIdentifier: Input[String]
    
    /**
      * Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restoreToTime`.
      */
    var useLatestRestorableTime: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object ClusterRestoreToPointInTime {
    
    inline def apply(sourceClusterIdentifier: Input[String]): ClusterRestoreToPointInTime = {
      val __obj = js.Dynamic.literal(sourceClusterIdentifier = sourceClusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRestoreToPointInTime]
    }
    
    extension [Self <: ClusterRestoreToPointInTime](x: Self) {
      
      inline def setRestoreToTime(value: Input[String]): Self = StObject.set(x, "restoreToTime", value.asInstanceOf[js.Any])
      
      inline def setRestoreToTimeUndefined: Self = StObject.set(x, "restoreToTime", js.undefined)
      
      inline def setRestoreType(value: Input[String]): Self = StObject.set(x, "restoreType", value.asInstanceOf[js.Any])
      
      inline def setRestoreTypeUndefined: Self = StObject.set(x, "restoreType", js.undefined)
      
      inline def setSourceClusterIdentifier(value: Input[String]): Self = StObject.set(x, "sourceClusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUseLatestRestorableTime(value: Input[Boolean]): Self = StObject.set(x, "useLatestRestorableTime", value.asInstanceOf[js.Any])
      
      inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "useLatestRestorableTime", js.undefined)
    }
  }
  
  trait ClusterS3Import extends StObject {
    
    /**
      * The bucket name where your backup is stored
      */
    var bucketName: Input[String]
    
    /**
      * Can be blank, but is the path to your backup
      */
    var bucketPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Role applied to load the data.
      */
    var ingestionRole: Input[String]
    
    /**
      * Source engine for the backup
      */
    var sourceEngine: Input[String]
    
    /**
      * Version of the source engine used to make the backup
      */
    var sourceEngineVersion: Input[String]
  }
  object ClusterS3Import {
    
    inline def apply(
      bucketName: Input[String],
      ingestionRole: Input[String],
      sourceEngine: Input[String],
      sourceEngineVersion: Input[String]
    ): ClusterS3Import = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterS3Import]
    }
    
    extension [Self <: ClusterS3Import](x: Self) {
      
      inline def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setIngestionRole(value: Input[String]): Self = StObject.set(x, "ingestionRole", value.asInstanceOf[js.Any])
      
      inline def setSourceEngine(value: Input[String]): Self = StObject.set(x, "sourceEngine", value.asInstanceOf[js.Any])
      
      inline def setSourceEngineVersion(value: Input[String]): Self = StObject.set(x, "sourceEngineVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterScalingConfiguration extends StObject {
    
    /**
      * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
      */
    var autoPause: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The maximum capacity. The maximum capacity must be greater than or equal to the minimum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `16`.
      */
    var maxCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The minimum capacity. The minimum capacity must be lesser than or equal to the maximum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `1`.
      */
    var minCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
      */
    var secondsUntilAutoPause: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
      */
    var timeoutAction: js.UndefOr[Input[String]] = js.undefined
  }
  object ClusterScalingConfiguration {
    
    inline def apply(): ClusterScalingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterScalingConfiguration]
    }
    
    extension [Self <: ClusterScalingConfiguration](x: Self) {
      
      inline def setAutoPause(value: Input[Boolean]): Self = StObject.set(x, "autoPause", value.asInstanceOf[js.Any])
      
      inline def setAutoPauseUndefined: Self = StObject.set(x, "autoPause", js.undefined)
      
      inline def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      inline def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      inline def setMinCapacity(value: Input[Double]): Self = StObject.set(x, "minCapacity", value.asInstanceOf[js.Any])
      
      inline def setMinCapacityUndefined: Self = StObject.set(x, "minCapacity", js.undefined)
      
      inline def setSecondsUntilAutoPause(value: Input[Double]): Self = StObject.set(x, "secondsUntilAutoPause", value.asInstanceOf[js.Any])
      
      inline def setSecondsUntilAutoPauseUndefined: Self = StObject.set(x, "secondsUntilAutoPause", js.undefined)
      
      inline def setTimeoutAction(value: Input[String]): Self = StObject.set(x, "timeoutAction", value.asInstanceOf[js.Any])
      
      inline def setTimeoutActionUndefined: Self = StObject.set(x, "timeoutAction", js.undefined)
    }
  }
  
  trait GlobalClusterGlobalClusterMember extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of member DB Cluster
      */
    var dbClusterArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the member is the primary DB Cluster
      */
    var isWriter: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object GlobalClusterGlobalClusterMember {
    
    inline def apply(): GlobalClusterGlobalClusterMember = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalClusterGlobalClusterMember]
    }
    
    extension [Self <: GlobalClusterGlobalClusterMember](x: Self) {
      
      inline def setDbClusterArn(value: Input[String]): Self = StObject.set(x, "dbClusterArn", value.asInstanceOf[js.Any])
      
      inline def setDbClusterArnUndefined: Self = StObject.set(x, "dbClusterArn", js.undefined)
      
      inline def setIsWriter(value: Input[Boolean]): Self = StObject.set(x, "isWriter", value.asInstanceOf[js.Any])
      
      inline def setIsWriterUndefined: Self = StObject.set(x, "isWriter", js.undefined)
    }
  }
  
  trait InstanceRestoreToPointInTime extends StObject {
    
    /**
      * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `useLatestRestorableTime`.
      */
    var restoreTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `sourceDbiResourceId` is not specified.
      */
    var sourceDbInstanceIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The resource ID of the source DB instance from which to restore. Required if `sourceDbInstanceIdentifier` is not specified.
      */
    var sourceDbiResourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restoreTime`.
      */
    var useLatestRestorableTime: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object InstanceRestoreToPointInTime {
    
    inline def apply(): InstanceRestoreToPointInTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceRestoreToPointInTime]
    }
    
    extension [Self <: InstanceRestoreToPointInTime](x: Self) {
      
      inline def setRestoreTime(value: Input[String]): Self = StObject.set(x, "restoreTime", value.asInstanceOf[js.Any])
      
      inline def setRestoreTimeUndefined: Self = StObject.set(x, "restoreTime", js.undefined)
      
      inline def setSourceDbInstanceIdentifier(value: Input[String]): Self = StObject.set(x, "sourceDbInstanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSourceDbInstanceIdentifierUndefined: Self = StObject.set(x, "sourceDbInstanceIdentifier", js.undefined)
      
      inline def setSourceDbiResourceId(value: Input[String]): Self = StObject.set(x, "sourceDbiResourceId", value.asInstanceOf[js.Any])
      
      inline def setSourceDbiResourceIdUndefined: Self = StObject.set(x, "sourceDbiResourceId", js.undefined)
      
      inline def setUseLatestRestorableTime(value: Input[Boolean]): Self = StObject.set(x, "useLatestRestorableTime", value.asInstanceOf[js.Any])
      
      inline def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "useLatestRestorableTime", js.undefined)
    }
  }
  
  trait InstanceS3Import extends StObject {
    
    /**
      * The bucket name where your backup is stored
      */
    var bucketName: Input[String]
    
    /**
      * Can be blank, but is the path to your backup
      */
    var bucketPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Role applied to load the data.
      */
    var ingestionRole: Input[String]
    
    /**
      * Source engine for the backup
      */
    var sourceEngine: Input[String]
    
    /**
      * Version of the source engine used to make the backup
      */
    var sourceEngineVersion: Input[String]
  }
  object InstanceS3Import {
    
    inline def apply(
      bucketName: Input[String],
      ingestionRole: Input[String],
      sourceEngine: Input[String],
      sourceEngineVersion: Input[String]
    ): InstanceS3Import = {
      val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], ingestionRole = ingestionRole.asInstanceOf[js.Any], sourceEngine = sourceEngine.asInstanceOf[js.Any], sourceEngineVersion = sourceEngineVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceS3Import]
    }
    
    extension [Self <: InstanceS3Import](x: Self) {
      
      inline def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setIngestionRole(value: Input[String]): Self = StObject.set(x, "ingestionRole", value.asInstanceOf[js.Any])
      
      inline def setSourceEngine(value: Input[String]): Self = StObject.set(x, "sourceEngine", value.asInstanceOf[js.Any])
      
      inline def setSourceEngineVersion(value: Input[String]): Self = StObject.set(x, "sourceEngineVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionGroupOption extends StObject {
    
    /**
      * A list of DB Security Groups for which the option is enabled.
      */
    var dbSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The Name of the Option (e.g. MEMCACHED).
      */
    var optionName: Input[String]
    
    /**
      * A list of option settings to apply.
      */
    var optionSettings: js.UndefOr[Input[js.Array[Input[OptionGroupOptionOptionSetting]]]] = js.undefined
    
    /**
      * The Port number when connecting to the Option (e.g. 11211).
      */
    var port: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The version of the option (e.g. 13.1.0.0).
      */
    var version: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of VPC Security Groups for which the option is enabled.
      */
    var vpcSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object OptionGroupOption {
    
    inline def apply(optionName: Input[String]): OptionGroupOption = {
      val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionGroupOption]
    }
    
    extension [Self <: OptionGroupOption](x: Self) {
      
      inline def setDbSecurityGroupMemberships(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "dbSecurityGroupMemberships", value.asInstanceOf[js.Any])
      
      inline def setDbSecurityGroupMembershipsUndefined: Self = StObject.set(x, "dbSecurityGroupMemberships", js.undefined)
      
      inline def setDbSecurityGroupMembershipsVarargs(value: Input[String]*): Self = StObject.set(x, "dbSecurityGroupMemberships", js.Array(value :_*))
      
      inline def setOptionName(value: Input[String]): Self = StObject.set(x, "optionName", value.asInstanceOf[js.Any])
      
      inline def setOptionSettings(value: Input[js.Array[Input[OptionGroupOptionOptionSetting]]]): Self = StObject.set(x, "optionSettings", value.asInstanceOf[js.Any])
      
      inline def setOptionSettingsUndefined: Self = StObject.set(x, "optionSettings", js.undefined)
      
      inline def setOptionSettingsVarargs(value: Input[OptionGroupOptionOptionSetting]*): Self = StObject.set(x, "optionSettings", js.Array(value :_*))
      
      inline def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setVpcSecurityGroupMemberships(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupMembershipsUndefined: Self = StObject.set(x, "vpcSecurityGroupMemberships", js.undefined)
      
      inline def setVpcSecurityGroupMembershipsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupMemberships", js.Array(value :_*))
    }
  }
  
  trait OptionGroupOptionOptionSetting extends StObject {
    
    /**
      * The Name of the setting.
      */
    var name: Input[String]
    
    /**
      * The Value of the setting.
      */
    var value: Input[String]
  }
  object OptionGroupOptionOptionSetting {
    
    inline def apply(name: Input[String], value: Input[String]): OptionGroupOptionOptionSetting = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionGroupOptionOptionSetting]
    }
    
    extension [Self <: OptionGroupOptionOptionSetting](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParameterGroupParameter extends StObject {
    
    /**
      * "immediate" (default), or "pending-reboot". Some
      * engines can't apply some parameters without a reboot, and you will need to
      * specify "pending-reboot" here.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the DB parameter.
      */
    var name: Input[String]
    
    /**
      * The value of the DB parameter.
      */
    var value: Input[String]
  }
  object ParameterGroupParameter {
    
    inline def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterGroupParameter]
    }
    
    extension [Self <: ParameterGroupParameter](x: Self) {
      
      inline def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyAuth extends StObject {
    
    /**
      * The type of authentication that the proxy uses for connections from the proxy to the underlying database. One of `SECRETS`.
      */
    var authScheme: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A user-specified description about the authentication used by a proxy to log in as a specific database user.
      */
    var description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy. One of `DISABLED`, `REQUIRED`.
      */
    var iamAuth: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
      */
    var secretArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ProxyAuth {
    
    inline def apply(): ProxyAuth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyAuth]
    }
    
    extension [Self <: ProxyAuth](x: Self) {
      
      inline def setAuthScheme(value: Input[String]): Self = StObject.set(x, "authScheme", value.asInstanceOf[js.Any])
      
      inline def setAuthSchemeUndefined: Self = StObject.set(x, "authScheme", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIamAuth(value: Input[String]): Self = StObject.set(x, "iamAuth", value.asInstanceOf[js.Any])
      
      inline def setIamAuthUndefined: Self = StObject.set(x, "iamAuth", js.undefined)
      
      inline def setSecretArn(value: Input[String]): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
      
      inline def setSecretArnUndefined: Self = StObject.set(x, "secretArn", js.undefined)
    }
  }
  
  trait ProxyDefaultTargetGroupConnectionPoolConfig extends StObject {
    
    /**
      * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
      */
    var connectionBorrowTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
      */
    var initQuery: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
      */
    var maxConnectionsPercent: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
      */
    var maxIdleConnectionsPercent: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
      */
    var sessionPinningFilters: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ProxyDefaultTargetGroupConnectionPoolConfig {
    
    inline def apply(): ProxyDefaultTargetGroupConnectionPoolConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyDefaultTargetGroupConnectionPoolConfig]
    }
    
    extension [Self <: ProxyDefaultTargetGroupConnectionPoolConfig](x: Self) {
      
      inline def setConnectionBorrowTimeout(value: Input[Double]): Self = StObject.set(x, "connectionBorrowTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionBorrowTimeoutUndefined: Self = StObject.set(x, "connectionBorrowTimeout", js.undefined)
      
      inline def setInitQuery(value: Input[String]): Self = StObject.set(x, "initQuery", value.asInstanceOf[js.Any])
      
      inline def setInitQueryUndefined: Self = StObject.set(x, "initQuery", js.undefined)
      
      inline def setMaxConnectionsPercent(value: Input[Double]): Self = StObject.set(x, "maxConnectionsPercent", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsPercentUndefined: Self = StObject.set(x, "maxConnectionsPercent", js.undefined)
      
      inline def setMaxIdleConnectionsPercent(value: Input[Double]): Self = StObject.set(x, "maxIdleConnectionsPercent", value.asInstanceOf[js.Any])
      
      inline def setMaxIdleConnectionsPercentUndefined: Self = StObject.set(x, "maxIdleConnectionsPercent", js.undefined)
      
      inline def setSessionPinningFilters(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "sessionPinningFilters", value.asInstanceOf[js.Any])
      
      inline def setSessionPinningFiltersUndefined: Self = StObject.set(x, "sessionPinningFilters", js.undefined)
      
      inline def setSessionPinningFiltersVarargs(value: Input[String]*): Self = StObject.set(x, "sessionPinningFilters", js.Array(value :_*))
    }
  }
  
  trait SecurityGroupIngress extends StObject {
    
    /**
      * The CIDR block to accept
      */
    var cidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the security group to authorize
      */
    var securityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the security group to authorize
      */
    var securityGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The owner Id of the security group provided
      * by `securityGroupName`.
      */
    var securityGroupOwnerId: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityGroupIngress {
    
    inline def apply(): SecurityGroupIngress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupIngress]
    }
    
    extension [Self <: SecurityGroupIngress](x: Self) {
      
      inline def setCidr(value: Input[String]): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      inline def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      inline def setSecurityGroupName(value: Input[String]): Self = StObject.set(x, "securityGroupName", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNameUndefined: Self = StObject.set(x, "securityGroupName", js.undefined)
      
      inline def setSecurityGroupOwnerId(value: Input[String]): Self = StObject.set(x, "securityGroupOwnerId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupOwnerIdUndefined: Self = StObject.set(x, "securityGroupOwnerId", js.undefined)
    }
  }
}
