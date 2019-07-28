package typings.socks.socksMod

import typings.node.Buffer
import typings.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typings.socks.typingsCommonConstantsMod.SocksClientEstablishedEvent
import typings.socks.typingsCommonConstantsMod.SocksClientOptions
import typings.socks.typingsCommonConstantsMod.SocksUDPFrameDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks", "SocksClient")
@js.native
class SocksClient protected ()
  extends typings.socks.typingsClientSocksclientMod.SocksClient {
  def this(options: SocksClientOptions) = this()
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
  def createConnection(options: SocksClientOptions): js.Promise[SocksClientEstablishedEvent] = js.native
  def createConnection(options: SocksClientOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
  /**
    * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
    *
    * Note: Supports callbacks and promises. Only supports the connect method.
    * Note: Implemented via createConnection() factory function.
    * @param options { SocksClientChainOptions } Options
    * @param callback { Function } An optional callback function.
    * @returns { Promise }
    */
  def createConnectionChain(options: SocksClientChainOptions): js.Promise[SocksClientEstablishedEvent] = js.native
  def createConnectionChain(options: SocksClientChainOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = js.native
  /**
    * Creates a SOCKS UDP Frame.
    * @param options
    */
  def createUDPFrame(options: SocksUDPFrameDetails): Buffer = js.native
  /**
    * Parses a SOCKS UDP frame.
    * @param data
    */
  def parseUDPFrame(data: Buffer): SocksUDPFrameDetails = js.native
}

