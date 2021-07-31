package typings.socks

import typings.node.Buffer
import typings.socks.constantsMod.SocksClientChainOptions
import typings.socks.constantsMod.SocksClientEstablishedEvent
import typings.socks.constantsMod.SocksClientOptions
import typings.socks.constantsMod.SocksUDPFrameDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socks", "SocksClient")
  @js.native
  class SocksClient protected ()
    extends typings.socks.socksclientMod.SocksClient {
    def this(options: SocksClientOptions) = this()
  }
  object SocksClient {
    
    @JSImport("socks", "SocksClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SOCKS connection.
      *
      * Note: Supports callbacks and promises. Only supports the connect command.
      * @param options { SocksClientOptions } Options.
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    @scala.inline
    def createConnection(options: SocksClientOptions): js.Promise[SocksClientEstablishedEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    @scala.inline
    def createConnection(options: SocksClientOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    
    /**
      * Creates a new SOCKS connection chain to a destination host through 2 or more SOCKS proxies.
      *
      * Note: Supports callbacks and promises. Only supports the connect method.
      * Note: Implemented via createConnection() factory function.
      * @param options { SocksClientChainOptions } Options
      * @param callback { Function } An optional callback function.
      * @returns { Promise }
      */
    /* static member */
    @scala.inline
    def createConnectionChain(options: SocksClientChainOptions): js.Promise[SocksClientEstablishedEvent] = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionChain")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    @scala.inline
    def createConnectionChain(options: SocksClientChainOptions, callback: js.Function): js.Promise[SocksClientEstablishedEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnectionChain")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SocksClientEstablishedEvent]]
    
    /**
      * Creates a SOCKS UDP Frame.
      * @param options
      */
    /* static member */
    @scala.inline
    def createUDPFrame(options: SocksUDPFrameDetails): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createUDPFrame")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Parses a SOCKS UDP frame.
      * @param data
      */
    /* static member */
    @scala.inline
    def parseUDPFrame(data: Buffer): SocksUDPFrameDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUDPFrame")(data.asInstanceOf[js.Any]).asInstanceOf[SocksUDPFrameDetails]
  }
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks", "SocksClientError")
  @js.native
  class SocksClientError protected ()
    extends typings.socks.socksclientMod.SocksClientError {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
  }
}
