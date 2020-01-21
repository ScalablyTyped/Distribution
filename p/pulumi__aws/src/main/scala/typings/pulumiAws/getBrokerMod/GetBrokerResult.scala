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
import scala.scalajs.js.annotation._

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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instances: js.Array[GetBrokerInstance] = js.native
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  val maintenanceWindowStartTime: GetBrokerMaintenanceWindowStartTime = js.native
  val publiclyAccessible: Boolean = js.native
  val securityGroups: js.Array[String] = js.native
  val subnetIds: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    users: js.Array[GetBrokerUser],
    logs: GetBrokerLogs = null
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], autoMinorVersionUpgrade = autoMinorVersionUpgrade.asInstanceOf[js.Any], brokerId = brokerId.asInstanceOf[js.Any], brokerName = brokerName.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], deploymentMode = deploymentMode.asInstanceOf[js.Any], encryptionOptions = encryptionOptions.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], maintenanceWindowStartTime = maintenanceWindowStartTime.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerResult]
  }
}

