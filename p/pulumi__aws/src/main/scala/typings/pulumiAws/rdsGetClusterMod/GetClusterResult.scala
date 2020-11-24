package typings.pulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterResult extends js.Object {
  
  val arn: String = js.native
  
  val availabilityZones: js.Array[String] = js.native
  
  val backtrackWindow: Double = js.native
  
  val backupRetentionPeriod: Double = js.native
  
  val clusterIdentifier: String = js.native
  
  val clusterMembers: js.Array[String] = js.native
  
  val clusterResourceId: String = js.native
  
  val databaseName: String = js.native
  
  val dbClusterParameterGroupName: String = js.native
  
  val dbSubnetGroupName: String = js.native
  
  val enabledCloudwatchLogsExports: js.Array[String] = js.native
  
  val endpoint: String = js.native
  
  val engine: String = js.native
  
  val engineVersion: String = js.native
  
  val finalSnapshotIdentifier: String = js.native
  
  val hostedZoneId: String = js.native
  
  val iamDatabaseAuthenticationEnabled: Boolean = js.native
  
  val iamRoles: js.Array[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val kmsKeyId: String = js.native
  
  val masterUsername: String = js.native
  
  val port: Double = js.native
  
  val preferredBackupWindow: String = js.native
  
  val preferredMaintenanceWindow: String = js.native
  
  val readerEndpoint: String = js.native
  
  val replicationSourceIdentifier: String = js.native
  
  val storageEncrypted: Boolean = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val vpcSecurityGroupIds: js.Array[String] = js.native
}
object GetClusterResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackWindow(value: Double): Self = this.set("backtrackWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriod(value: Double): Self = this.set("backupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterMembersVarargs(value: String*): Self = this.set("clusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setClusterMembers(value: js.Array[String]): Self = this.set("clusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterResourceId(value: String): Self = this.set("clusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterParameterGroupName(value: String): Self = this.set("dbClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupName(value: String): Self = this.set("dbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = this.set("enabledCloudwatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudwatchLogsExports(value: js.Array[String]): Self = this.set("enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalSnapshotIdentifier(value: String): Self = this.set("finalSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneId(value: String): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRolesVarargs(value: String*): Self = this.set("iamRoles", js.Array(value :_*))
    
    @scala.inline
    def setIamRoles(value: js.Array[String]): Self = this.set("iamRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderEndpoint(value: String): Self = this.set("readerEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSourceIdentifier(value: String): Self = this.set("replicationSourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroupIds(value: js.Array[String]): Self = this.set("vpcSecurityGroupIds", value.asInstanceOf[js.Any])
  }
}
