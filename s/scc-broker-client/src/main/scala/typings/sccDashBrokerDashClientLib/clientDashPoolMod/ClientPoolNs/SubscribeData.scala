package typings
package sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeData extends js.Object {
  var channel: java.lang.String
  var poolIndex: scala.Double
  var targetURI: java.lang.String
}

object SubscribeData {
  @scala.inline
  def apply(channel: java.lang.String, poolIndex: scala.Double, targetURI: java.lang.String): SubscribeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("poolIndex")(poolIndex)
    __obj.updateDynamic("targetURI")(targetURI)
    __obj.asInstanceOf[SubscribeData]
  }
}

