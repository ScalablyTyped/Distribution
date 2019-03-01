package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultichannelAddress extends js.Object {
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var app_id: java.lang.String
  /** The communication channel used to reach recipient. Valid values are “email”, “gcm”, “apns”. */
  var channel: java.lang.String
  /** Valid email address. Required if channel is “email”. */
  var email: java.lang.String
  /** Email address to display in the “To” header instead of address.email (for BCC). Used when channel is “email” */
  var header_to: java.lang.String
  /** User-friendly name for the email address. Used when channel is “email” */
  var name: java.lang.String
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var token: java.lang.String
}

object MultichannelAddress {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    channel: java.lang.String,
    email: java.lang.String,
    header_to: java.lang.String,
    name: java.lang.String,
    token: java.lang.String
  ): MultichannelAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_id")(app_id)
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("header_to")(header_to)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[MultichannelAddress]
  }
}

