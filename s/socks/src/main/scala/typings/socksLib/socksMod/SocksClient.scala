package typings
package socksLib.socksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks", "SocksClient")
@js.native
class SocksClient protected ()
  extends socksLib.typingsClientSocksclientMod.SocksClient {
  def this(options: socksLib.typingsCommonConstantsMod.SocksClientOptions) = this()
}

/* static members */
@JSImport("socks", "SocksClient")
@js.native
object SocksClient extends js.Object {
  /**
    * Creates a new SOCKS connection.
    *
    * Note: Supports callbacks and promises. Only supports the connect command.
    * @param options { SocksClientOptions } Options.
    * @param callback { Function } An optional callback function.
    * @returns { Promise }
    */
  def createConnection(options: socksLib.typingsCommonConstantsMod.SocksClientOptions): js.Promise[socksLib.typingsCommonConstantsMod.SocksClientEstablishedEvent] = js.native
  def createConnection(options: socksLib.typingsCommonConstantsMod.SocksClientOptions, callback: js.Function): js.Promise[socksLib.typingsCommonConstantsMod.SocksClientEstablishedEvent] = js.native
  /**
    * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
    *
    * Note: Supports callbacks and promises. Only supports the connect method.
    * Note: Implemented via createConnection() factory function.
    * @param options { SocksClientChainOptions } Options
    * @param callback { Function } An optional callback function.
    * @returns { Promise }
    */
  def createConnectionChain(options: socksLib.typingsCommonConstantsMod.SocksClientChainOptions): js.Promise[socksLib.typingsCommonConstantsMod.SocksClientEstablishedEvent] = js.native
  def createConnectionChain(options: socksLib.typingsCommonConstantsMod.SocksClientChainOptions, callback: js.Function): js.Promise[socksLib.typingsCommonConstantsMod.SocksClientEstablishedEvent] = js.native
  /**
    * Creates a SOCKS UDP Frame.
    * @param options
    */
  def createUDPFrame(options: socksLib.typingsCommonConstantsMod.SocksUDPFrameDetails): nodeLib.Buffer = js.native
  /**
    * Parses a SOCKS UDP frame.
    * @param data
    */
  def parseUDPFrame(data: nodeLib.Buffer): socksLib.typingsCommonConstantsMod.SocksUDPFrameDetails = js.native
}

