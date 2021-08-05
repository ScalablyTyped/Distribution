package typings.socketclusterServer

import typings.node.httpMod.Server
import typings.socketclusterServer.serverMod.AGServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socketcluster-server", "AGServer")
  @js.native
  class AGServer ()
    extends typings.socketclusterServer.serverMod.^ {
    def this(options: AGServerOptions) = this()
  }
  
  @JSImport("socketcluster-server", "AGServerSocket")
  @js.native
  class AGServerSocket protected ()
    extends typings.socketclusterServer.serversocketMod.^ {
    def this(
      id: String,
      server: typings.socketclusterServer.serverMod.^,
      socket: typings.ws.mod.^,
      protocolVersion: Double
    ) = this()
  }
  
  inline def attach(server: Server): AGServer = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any]).asInstanceOf[AGServer]
  inline def attach(server: Server, options: AGServerOptions): AGServer = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AGServer]
  
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
