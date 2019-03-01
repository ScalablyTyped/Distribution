package typings
package atPulumiAwsLib.mqGetBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerResult extends js.Object {
  val arn: java.lang.String
  val autoMinorVersionUpgrade: scala.Boolean
  val brokerId: java.lang.String
  val brokerName: java.lang.String
  val configuration: atPulumiAwsLib.Anon_IdRevision
  val deploymentMode: java.lang.String
  val engineType: java.lang.String
  val engineVersion: java.lang.String
  val hostInstanceType: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val instances: js.Array[atPulumiAwsLib.Anon_ConsoleUrl]
  val maintenanceWindowStartTime: atPulumiAwsLib.Anon_DayOfWeek
  val publiclyAccessible: scala.Boolean
  val securityGroups: js.Array[java.lang.String]
  val subnetIds: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val users: js.Array[atPulumiAwsLib.Anon_ConsoleAccessGroupsUsername]
}

object GetBrokerResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    autoMinorVersionUpgrade: scala.Boolean,
    brokerId: java.lang.String,
    brokerName: java.lang.String,
    configuration: atPulumiAwsLib.Anon_IdRevision,
    deploymentMode: java.lang.String,
    engineType: java.lang.String,
    engineVersion: java.lang.String,
    hostInstanceType: java.lang.String,
    id: java.lang.String,
    instances: js.Array[atPulumiAwsLib.Anon_ConsoleUrl],
    maintenanceWindowStartTime: atPulumiAwsLib.Anon_DayOfWeek,
    publiclyAccessible: scala.Boolean,
    securityGroups: js.Array[java.lang.String],
    subnetIds: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    users: js.Array[atPulumiAwsLib.Anon_ConsoleAccessGroupsUsername]
  ): GetBrokerResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade)
    __obj.updateDynamic("brokerId")(brokerId)
    __obj.updateDynamic("brokerName")(brokerName)
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("deploymentMode")(deploymentMode)
    __obj.updateDynamic("engineType")(engineType)
    __obj.updateDynamic("engineVersion")(engineVersion)
    __obj.updateDynamic("hostInstanceType")(hostInstanceType)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("instances")(instances)
    __obj.updateDynamic("maintenanceWindowStartTime")(maintenanceWindowStartTime)
    __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.updateDynamic("subnetIds")(subnetIds)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[GetBrokerResult]
  }
}

