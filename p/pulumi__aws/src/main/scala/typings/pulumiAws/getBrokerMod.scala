package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mq.GetBrokerLogs
import typings.pulumiAws.outputMod.mq.GetBrokerConfiguration
import typings.pulumiAws.outputMod.mq.GetBrokerEncryptionOption
import typings.pulumiAws.outputMod.mq.GetBrokerInstance
import typings.pulumiAws.outputMod.mq.GetBrokerMaintenanceWindowStartTime
import typings.pulumiAws.outputMod.mq.GetBrokerUser
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBrokerMod {
  
  @JSImport("@pulumi/aws/mq/getBroker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBroker(): js.Promise[GetBrokerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")().asInstanceOf[js.Promise[GetBrokerResult]]
  @scala.inline
  def getBroker(args: Unit, opts: InvokeOptions): js.Promise[GetBrokerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBrokerResult]]
  @scala.inline
  def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBrokerResult]]
  @scala.inline
  def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBroker")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBrokerResult]]
  
  trait GetBrokerArgs extends StObject {
    
    /**
      * The unique id of the mq broker.
      */
    val brokerId: js.UndefOr[String] = js.undefined
    
    /**
      * The unique name of the mq broker.
      */
    val brokerName: js.UndefOr[String] = js.undefined
    
    val logs: js.UndefOr[GetBrokerLogs] = js.undefined
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetBrokerArgs {
    
    @scala.inline
    def apply(): GetBrokerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetBrokerArgs]
    }
    
    @scala.inline
    implicit class GetBrokerArgsMutableBuilder[Self <: GetBrokerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrokerId(value: String): Self = StObject.set(x, "brokerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerIdUndefined: Self = StObject.set(x, "brokerId", js.undefined)
      
      @scala.inline
      def setBrokerName(value: String): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerNameUndefined: Self = StObject.set(x, "brokerName", js.undefined)
      
      @scala.inline
      def setLogs(value: GetBrokerLogs): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetBrokerResult extends StObject {
    
    val arn: String
    
    val autoMinorVersionUpgrade: Boolean
    
    val brokerId: String
    
    val brokerName: String
    
    val configuration: GetBrokerConfiguration
    
    val deploymentMode: String
    
    val encryptionOptions: js.Array[GetBrokerEncryptionOption]
    
    val engineType: String
    
    val engineVersion: String
    
    val hostInstanceType: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instances: js.Array[GetBrokerInstance]
    
    val logs: js.UndefOr[typings.pulumiAws.outputMod.mq.GetBrokerLogs] = js.undefined
    
    val maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime
    
    val publiclyAccessible: Boolean
    
    val securityGroups: js.Array[String]
    
    val subnetIds: js.Array[String]
    
    val tags: StringDictionary[String]
    
    val users: js.Array[GetBrokerUser]
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
    implicit class GetBrokerResultMutableBuilder[Self <: GetBrokerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoMinorVersionUpgrade(value: Boolean): Self = StObject.set(x, "autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerId(value: String): Self = StObject.set(x, "brokerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrokerName(value: String): Self = StObject.set(x, "brokerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguration(value: GetBrokerConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentMode(value: String): Self = StObject.set(x, "deploymentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptions(value: js.Array[GetBrokerEncryptionOption]): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptionsVarargs(value: GetBrokerEncryptionOption*): Self = StObject.set(x, "encryptionOptions", js.Array(value :_*))
      
      @scala.inline
      def setEngineType(value: String): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostInstanceType(value: String): Self = StObject.set(x, "hostInstanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstances(value: js.Array[GetBrokerInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesVarargs(value: GetBrokerInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setLogs(value: typings.pulumiAws.outputMod.mq.GetBrokerLogs): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setMaintenanceWindowStartTime(value: GetBrokerMaintenanceWindowStartTime): Self = StObject.set(x, "maintenanceWindowStartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroups(value: js.Array[String]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[GetBrokerUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: GetBrokerUser*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
