package typings
package sccDashBrokerDashClientLib.clientDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishData extends js.Object {
  var channel: java.lang.String
  var data: js.Any
  var poolIndex: scala.Double
  var targetURI: java.lang.String
}

object PublishData {
  @scala.inline
  def apply(channel: java.lang.String, data: js.Any, poolIndex: scala.Double, targetURI: java.lang.String): PublishData = {
    val __obj = js.Dynamic.literal(channel = channel, data = data, poolIndex = poolIndex, targetURI = targetURI)
  
    __obj.asInstanceOf[PublishData]
  }
}

