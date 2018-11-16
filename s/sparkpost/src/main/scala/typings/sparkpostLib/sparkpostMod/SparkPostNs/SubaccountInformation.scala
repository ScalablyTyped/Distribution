package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubaccountInformation extends js.Object {
  var compliance_status: java.lang.String
  /** ID of subaccount */
  var id: scala.Double
  /** The ID of the default IP Pool assigned to this subaccount’s transmissions */
  var ip_pool: js.UndefOr[java.lang.String] = js.undefined
  /** User friendly identifier for a specific subaccount */
  var name: java.lang.String
  /** Status of the account */
  var status: sparkpostLib.sparkpostLibStrings.active | sparkpostLib.sparkpostLibStrings.suspended | sparkpostLib.sparkpostLibStrings.terminated
}

