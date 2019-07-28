package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.undefined
  /** list of grants to give the subaccount API key */
  var key_grants: js.Array[String]
  /** user-friendly identifier for subaccount API key */
  var key_label: String
  /** list of IPs the subaccount may be used from */
  var key_valid_ips: js.UndefOr[js.Array[String]] = js.undefined
  /** user-friendly name */
  var name: String
}

object CreateSubaccount {
  @scala.inline
  def apply(
    key_grants: js.Array[String],
    key_label: String,
    name: String,
    ip_pool: String = null,
    key_valid_ips: js.Array[String] = null
  ): CreateSubaccount = {
    val __obj = js.Dynamic.literal(key_grants = key_grants, key_label = key_label, name = name)
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool)
    if (key_valid_ips != null) __obj.updateDynamic("key_valid_ips")(key_valid_ips)
    __obj.asInstanceOf[CreateSubaccount]
  }
}

