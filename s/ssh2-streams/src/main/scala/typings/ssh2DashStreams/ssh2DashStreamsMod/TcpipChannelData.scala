package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipChannelData extends js.Object {
  var destIP: String
  var destPort: Double
  var srcIP: String
  var srcPort: Double
}

object TcpipChannelData {
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpipChannelData = {
    val __obj = js.Dynamic.literal(destIP = destIP, destPort = destPort, srcIP = srcIP, srcPort = srcPort)
  
    __obj.asInstanceOf[TcpipChannelData]
  }
}

