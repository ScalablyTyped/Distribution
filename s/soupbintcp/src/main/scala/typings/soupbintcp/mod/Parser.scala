package typings.soupbintcp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soupbintcp", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(callback: js.Function2[/* packetType */ PacketType, /* payload */ Buffer, Unit]) = this()
  
  def parse(data: Buffer): Unit = js.native
}
