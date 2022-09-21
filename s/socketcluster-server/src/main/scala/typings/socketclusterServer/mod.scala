package typings.socketclusterServer

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.socketclusterServer.serverMod.AGServerOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-server", "AGServer")
  @js.native
  open class AGServer ()
    extends typings.socketclusterServer.serverMod.^ {
    def this(options: AGServerOptions) = this()
  }
  
  @JSImport("socketcluster-server", "AGServerSocket")
  @js.native
  open class AGServerSocket protected ()
    extends typings.socketclusterServer.serversocketMod.^ {
    def this(
      id: String,
      server: typings.socketclusterServer.serverMod.^,
      socket: WebSocket,
      protocolVersion: Double
    ) = this()
  }
  
  inline def attach(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any]).asInstanceOf[AGServer]
  inline def attach(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    options: AGServerOptions
  ): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  
  inline def listen(): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")().asInstanceOf[AGServer]
  inline def listen(port: Double): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any]).asInstanceOf[AGServer]
  inline def listen(port: Double, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: AGServerOptions): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Double, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: Unit, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: AGServerOptions): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  inline def listen(port: Unit, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listeningListener.asInstanceOf[js.Any])).asInstanceOf[AGServer]
}
