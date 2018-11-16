package typings
package socketDotIoDashParserLib.socketDotIoDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io-parser", "Decoder")
@js.native
class Decoder () extends js.Object {
  def add(encodedPacket: EncodedPacket): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* decodedPacket */ Packet, scala.Unit]): scala.Unit = js.native
}

