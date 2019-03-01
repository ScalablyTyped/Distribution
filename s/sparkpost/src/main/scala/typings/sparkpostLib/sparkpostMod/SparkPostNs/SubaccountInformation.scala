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

object SubaccountInformation {
  @scala.inline
  def apply(
    compliance_status: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    status: sparkpostLib.sparkpostLibStrings.active | sparkpostLib.sparkpostLibStrings.suspended | sparkpostLib.sparkpostLibStrings.terminated,
    ip_pool: java.lang.String = null
  ): SubaccountInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compliance_status")(compliance_status)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool)
    __obj.asInstanceOf[SubaccountInformation]
  }
}

