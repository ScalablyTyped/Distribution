package typings.atPulumiAws.mqGetBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AuditGeneralBoolean
import typings.atPulumiAws.Anon_ConsoleAccessGroupsUsername
import typings.atPulumiAws.Anon_ConsoleUrl
import typings.atPulumiAws.Anon_DayOfWeek
import typings.atPulumiAws.Anon_IdRevision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerResult extends js.Object {
  val arn: String
  val autoMinorVersionUpgrade: Boolean
  val brokerId: String
  val brokerName: String
  val configuration: Anon_IdRevision
  val deploymentMode: String
  val engineType: String
  val engineVersion: String
  val hostInstanceType: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val instances: js.Array[Anon_ConsoleUrl]
  val logs: js.UndefOr[Anon_AuditGeneralBoolean] = js.undefined
  val maintenanceWindowStartTime: Anon_DayOfWeek
  val publiclyAccessible: Boolean
  val securityGroups: js.Array[String]
  val subnetIds: js.Array[String]
  val tags: StringDictionary[js.Any]
  val users: js.Array[Anon_ConsoleAccessGroupsUsername]
}

object GetBrokerResult {
  @scala.inline
  def apply(
    arn: String,
    autoMinorVersionUpgrade: Boolean,
    brokerId: String,
    brokerName: String,
    configuration: Anon_IdRevision,
    deploymentMode: String,
    engineType: String,
    engineVersion: String,
    hostInstanceType: String,
    id: String,
    instances: js.Array[Anon_ConsoleUrl],
    maintenanceWindowStartTime: Anon_DayOfWeek,
    publiclyAccessible: Boolean,
    securityGroups: js.Array[String],
    subnetIds: js.Array[String],
    tags: StringDictionary[js.Any],
    users: js.Array[Anon_ConsoleAccessGroupsUsername],
    logs: Anon_AuditGeneralBoolean = null
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal(arn = arn, autoMinorVersionUpgrade = autoMinorVersionUpgrade, brokerId = brokerId, brokerName = brokerName, configuration = configuration, deploymentMode = deploymentMode, engineType = engineType, engineVersion = engineVersion, hostInstanceType = hostInstanceType, id = id, instances = instances, maintenanceWindowStartTime = maintenanceWindowStartTime, publiclyAccessible = publiclyAccessible, securityGroups = securityGroups, subnetIds = subnetIds, tags = tags, users = users)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    __obj.asInstanceOf[GetBrokerResult]
  }
}

