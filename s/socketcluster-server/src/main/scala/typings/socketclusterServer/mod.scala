package typings.socketclusterServer

import typings.node.httpMod.Server
import typings.socketclusterServer.serverMod.AGServerOptions
import typings.socketclusterServer.serverMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketcluster-server", "AGServer")
  @js.native
  class AGServer () extends ^ {
    def this(options: AGServerOptions) = this()
  }
  
  @JSImport("socketcluster-server", "AGServerSocket")
  @js.native
  class AGServerSocket protected ()
    extends typings.socketclusterServer.serversocketMod.^ {
    def this(id: String, server: ^, socket: typings.ws.mod.^, protocolVersion: Double) = this()
  }
  
  @JSImport("socketcluster-server", "attach")
  @js.native
  def attach(server: Server): AGServer = js.native
  @JSImport("socketcluster-server", "attach")
  @js.native
  def attach(server: Server, options: AGServerOptions): AGServer = js.native
  
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: js.UndefOr[scala.Nothing], options: AGServerOptions): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: js.UndefOr[scala.Nothing], options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: Double): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: Double, options: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: Double, options: AGServerOptions): AGServer = js.native
  @JSImport("socketcluster-server", "listen")
  @js.native
  def listen(port: Double, options: AGServerOptions, listeningListener: js.Function0[Unit]): AGServer = js.native
}
