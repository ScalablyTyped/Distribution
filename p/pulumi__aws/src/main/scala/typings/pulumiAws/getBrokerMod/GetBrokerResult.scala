package typings.pulumiAws.getBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.mq.GetBrokerConfiguration
import typings.pulumiAws.outputMod.mq.GetBrokerEncryptionOption
import typings.pulumiAws.outputMod.mq.GetBrokerInstance
import typings.pulumiAws.outputMod.mq.GetBrokerLogs
import typings.pulumiAws.outputMod.mq.GetBrokerMaintenanceWindowStartTime
import typings.pulumiAws.outputMod.mq.GetBrokerUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBrokerResult extends js.Object {
  
  val arn: String = js.native
  
  val autoMinorVersionUpgrade: Boolean = js.native
  
  val brokerId: String = js.native
  
  val brokerName: String = js.native
  
  val configuration: GetBrokerConfiguration = js.native
  
  val deploymentMode: String = js.native
  
  val encryptionOptions: js.Array[GetBrokerEncryptionOption] = js.native
  
  val engineType: String = js.native
  
  val engineVersion: String = js.native
  
  val hostInstanceType: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val instances: js.Array[GetBrokerInstance] = js.native
  
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  
  val maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime = js.native
  
  val publiclyAccessible: Boolean = js.native
  
  val securityGroups: js.Array[String] = js.native
  
  val subnetIds: js.Array[String] = js.native
  
  val tags: StringDictionary[String] = js.native
  
  val users: js.Array[GetBrokerUser] = js.native
}
object GetBrokerResult {
  
  @scala.inline
  def apply(
    arn: String,
    autoMinorVersionUpgrade: Boolean,
    brokerId: String,
    brokerName: String,
    configuration: GetBrokerConfiguration,
    deploymentMode: String,
    encryptionOptions: js.Array[GetBrokerEncryptionOption],
    engineType: String,
    engineVersion: String,
    hostInstanceType: String,
    id: String,
    instances: js.Array[GetBrokerInstance],
    maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime,
    publiclyAccessible: Boolean,
    securityGroups: js.Array[String],
    subnetIds: js.Array[String],
    tags: StringDictionary[String],
    users: js.Array[GetBrokerUser]
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], autoMinorVersionUpgrade = autoMinorVersionUpgrade.asInstanceOf[js.Any], brokerId = brokerId.asInstanceOf[js.Any], brokerName = brokerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], deploymentMode = deploymentMode.asInstanceOf[js.Any], encryptionOptions = encryptionOptions.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], maintenanceWindowStartTime = maintenanceWindowStartTime.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerResult]
  }
  
  @scala.inline
  implicit class GetBrokerResultOps[Self <: GetBrokerResult] (val x: Self) extends AnyVal {
    
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
    def setAutoMinorVersionUpgrade(value: Boolean): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerId(value: String): Self = this.set("brokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerName(value: String): Self = this.set("brokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: GetBrokerConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentMode(value: String): Self = this.set("deploymentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptionsVarargs(value: GetBrokerEncryptionOption*): Self = this.set("encryptionOptions", js.Array(value :_*))
    
    @scala.inline
    def setEncryptionOptions(value: js.Array[GetBrokerEncryptionOption]): Self = this.set("encryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineType(value: String): Self = this.set("engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceType(value: String): Self = this.set("hostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: GetBrokerInstance*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[GetBrokerInstance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowStartTime(value: GetBrokerMaintenanceWindowStartTime): Self = this.set("maintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: GetBrokerUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[GetBrokerUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogs(value: GetBrokerLogs): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
  }
}
