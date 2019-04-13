package typings
package sparkpostLib.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[java.lang.String] = js.undefined
  /** user-friendly name */
  var name: java.lang.String
  /** status of the subaccount */
  var status: java.lang.String
}

object UpdateSubaccount {
  @scala.inline
  def apply(name: java.lang.String, status: java.lang.String, ip_pool: java.lang.String = null): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name, status = status)
    if (ip_pool != null) __obj.updateDynamic("ip_pool")(ip_pool)
    __obj.asInstanceOf[UpdateSubaccount]
  }
}

