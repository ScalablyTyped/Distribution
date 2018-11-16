package typings
package soupbintcpLib.soupbintcpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soupbintcp", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(callback: js.Function2[/* packetType */ PacketType, /* payload */ nodeLib.Buffer, scala.Unit]) = this()
  def parse(data: nodeLib.Buffer): scala.Unit = js.native
}

