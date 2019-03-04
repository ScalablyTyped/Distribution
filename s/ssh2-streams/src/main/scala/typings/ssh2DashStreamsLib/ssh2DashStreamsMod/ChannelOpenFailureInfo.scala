package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOpenFailureInfo extends js.Object {
  var description: java.lang.String
  var reason: java.lang.String
  var reasonCode: scala.Double
  var recipient: scala.Double
}

object ChannelOpenFailureInfo {
  @scala.inline
  def apply(
    description: java.lang.String,
    reason: java.lang.String,
    reasonCode: scala.Double,
    recipient: scala.Double
  ): ChannelOpenFailureInfo = {
    val __obj = js.Dynamic.literal(description = description, reason = reason, reasonCode = reasonCode, recipient = recipient)
  
    __obj.asInstanceOf[ChannelOpenFailureInfo]
  }
}

