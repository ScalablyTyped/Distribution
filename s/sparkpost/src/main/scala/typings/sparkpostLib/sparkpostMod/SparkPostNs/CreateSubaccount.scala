package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[java.lang.String] = js.undefined
  /** list of grants to give the subaccount API key */
  var key_grants: js.Array[java.lang.String]
  /** user-friendly identifier for subaccount API key */
  var key_label: java.lang.String
  /** list of IPs the subaccount may be used from */
  var key_valid_ips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** user-friendly name */
  var name: java.lang.String
}

