package typings.sparkpost.sparkpostMod

import typings.sparkpost.sparkpostStrings.active
import typings.sparkpost.sparkpostStrings.suspended
import typings.sparkpost.sparkpostStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountInformation extends js.Object {
  var compliance_status: String
  /** ID of subaccount */
  var id: Double
  /** The ID of the default IP Pool assigned to this subaccount’s transmissions */
  var ip_pool: js.UndefOr[String] = js.undefined
  /** User friendly identifier for a specific subaccount */
  var name: String
  /** Status of the account */
  var status: active | suspended | terminated
}

object SubaccountInformation {
  @scala.inline
  def apply(
    compliance_status: String,
    id: Double,
    name: String,
    status: active | suspended | terminated,
    ip_pool: String = null
  ): SubaccountInformation = {
    val __obj = js.Dynamic.literal(compliance_status = compliance_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountInformation]
  }
}

