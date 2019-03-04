package typings
package sccDashBrokerDashClientLib.clientDashPoolMod.ClientPoolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeFailData extends SubscribeData {
  var error: nodeLib.Error
}

object SubscribeFailData {
  @scala.inline
  def apply(
    channel: java.lang.String,
    error: nodeLib.Error,
    poolIndex: scala.Double,
    targetURI: java.lang.String
  ): SubscribeFailData = {
    val __obj = js.Dynamic.literal(channel = channel, error = error, poolIndex = poolIndex, targetURI = targetURI)
  
    __obj.asInstanceOf[SubscribeFailData]
  }
}

