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
  val configuration: atPulumiAwsLib.Anon_Revision
  val deploymentMode: java.lang.String
  val engineType: java.lang.String
  val engineVersion: java.lang.String
  val hostInstanceType: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val instances: js.Array[atPulumiAwsLib.Anon_Endpoints]
  val maintenanceWindowStartTime: atPulumiAwsLib.Anon_DayOfWeek
  val publiclyAccessible: scala.Boolean
  val securityGroups: js.Array[java.lang.String]
  val subnetIds: js.Array[java.lang.String]
  val users: js.Array[atPulumiAwsLib.Anon_UsernameConsoleAccess]
}

