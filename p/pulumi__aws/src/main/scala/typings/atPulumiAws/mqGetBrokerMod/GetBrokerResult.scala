package typings.atPulumiAws.mqGetBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerConfiguration
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerEncryptionOption
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerInstance
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerLogs
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerMaintenanceWindowStartTime
import typings.atPulumiAws.typesOutputMod.mq.GetBrokerUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val instances: js.Array[GetBrokerInstance]
  val logs: js.UndefOr[GetBrokerLogs] = js.undefined
  val maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime
  val publiclyAccessible: Boolean
  val securityGroups: js.Array[String]
  val subnetIds: js.Array[String]
  val tags: StringDictionary[js.Any]
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
    tags: StringDictionary[js.Any],
    users: js.Array[GetBrokerUser],
    logs: GetBrokerLogs = null
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal(arn = arn, autoMinorVersionUpgrade = autoMinorVersionUpgrade, brokerId = brokerId, brokerName = brokerName, configuration = configuration, deploymentMode = deploymentMode, encryptionOptions = encryptionOptions, engineType = engineType, engineVersion = engineVersion, hostInstanceType = hostInstanceType, id = id, instances = instances, maintenanceWindowStartTime = maintenanceWindowStartTime, publiclyAccessible = publiclyAccessible, securityGroups = securityGroups, subnetIds = subnetIds, tags = tags, users = users)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    __obj.asInstanceOf[GetBrokerResult]
  }
}

