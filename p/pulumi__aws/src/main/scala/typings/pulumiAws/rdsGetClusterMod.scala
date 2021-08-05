package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetClusterMod {
  
  @JSImport("@pulumi/aws/rds/getCluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetClusterResult]]
  inline def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCluster")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetClusterResult]]
  
  trait GetClusterArgs extends StObject {
    
    /**
      * The cluster identifier of the RDS cluster.
      */
    val clusterIdentifier: String
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetClusterArgs {
    
    inline def apply(clusterIdentifier: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    extension [Self <: GetClusterArgs](x: Self) {
      
      inline def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetClusterResult extends StObject {
    
    val arn: String
    
    val availabilityZones: js.Array[String]
    
    val backtrackWindow: Double
    
    val backupRetentionPeriod: Double
    
    val clusterIdentifier: String
    
    val clusterMembers: js.Array[String]
    
    val clusterResourceId: String
    
    val databaseName: String
    
    val dbClusterParameterGroupName: String
    
    val dbSubnetGroupName: String
    
    val enabledCloudwatchLogsExports: js.Array[String]
    
    val endpoint: String
    
    val engine: String
    
    val engineVersion: String
    
    val finalSnapshotIdentifier: String
    
    val hostedZoneId: String
    
    val iamDatabaseAuthenticationEnabled: Boolean
    
    val iamRoles: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val kmsKeyId: String
    
    val masterUsername: String
    
    val port: Double
    
    val preferredBackupWindow: String
    
    val preferredMaintenanceWindow: String
    
    val readerEndpoint: String
    
    val replicationSourceIdentifier: String
    
    val storageEncrypted: Boolean
    
    val tags: StringDictionary[String]
    
    val vpcSecurityGroupIds: js.Array[String]
  }
  object GetClusterResult {
    
    inline def apply(
      arn: String,
      availabilityZones: js.Array[String],
      backtrackWindow: Double,
      backupRetentionPeriod: Double,
      clusterIdentifier: String,
      clusterMembers: js.Array[String],
      clusterResourceId: String,
      databaseName: String,
      dbClusterParameterGroupName: String,
      dbSubnetGroupName: String,
      enabledCloudwatchLogsExports: js.Array[String],
      endpoint: String,
      engine: String,
      engineVersion: String,
      finalSnapshotIdentifier: String,
      hostedZoneId: String,
      iamDatabaseAuthenticationEnabled: Boolean,
      iamRoles: js.Array[String],
      id: String,
      kmsKeyId: String,
      masterUsername: String,
      port: Double,
      preferredBackupWindow: String,
      preferredMaintenanceWindow: String,
      readerEndpoint: String,
      replicationSourceIdentifier: String,
      storageEncrypted: Boolean,
      tags: StringDictionary[String],
      vpcSecurityGroupIds: js.Array[String]
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], backtrackWindow = backtrackWindow.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterMembers = clusterMembers.asInstanceOf[js.Any], clusterResourceId = clusterResourceId.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], dbClusterParameterGroupName = dbClusterParameterGroupName.asInstanceOf[js.Any], dbSubnetGroupName = dbSubnetGroupName.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], finalSnapshotIdentifier = finalSnapshotIdentifier.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], readerEndpoint = readerEndpoint.asInstanceOf[js.Any], replicationSourceIdentifier = replicationSourceIdentifier.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    extension [Self <: GetClusterResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setBacktrackWindow(value: Double): Self = StObject.set(x, "backtrackWindow", value.asInstanceOf[js.Any])
      
      inline def setBackupRetentionPeriod(value: Double): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      inline def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      inline def setClusterMembers(value: js.Array[String]): Self = StObject.set(x, "clusterMembers", value.asInstanceOf[js.Any])
      
      inline def setClusterMembersVarargs(value: String*): Self = StObject.set(x, "clusterMembers", js.Array(value :_*))
      
      inline def setClusterResourceId(value: String): Self = StObject.set(x, "clusterResourceId", value.asInstanceOf[js.Any])
      
      inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      inline def setDbClusterParameterGroupName(value: String): Self = StObject.set(x, "dbClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      inline def setDbSubnetGroupName(value: String): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      inline def setEnabledCloudwatchLogsExports(value: js.Array[String]): Self = StObject.set(x, "enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      inline def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "enabledCloudwatchLogsExports", js.Array(value :_*))
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      inline def setFinalSnapshotIdentifier(value: String): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      inline def setIamRoles(value: js.Array[String]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      inline def setIamRolesVarargs(value: String*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setMasterUsername(value: String): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPreferredBackupWindow(value: String): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      inline def setReaderEndpoint(value: String): Self = StObject.set(x, "readerEndpoint", value.asInstanceOf[js.Any])
      
      inline def setReplicationSourceIdentifier(value: String): Self = StObject.set(x, "replicationSourceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
