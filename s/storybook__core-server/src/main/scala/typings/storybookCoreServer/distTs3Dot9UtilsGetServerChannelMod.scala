package typings.storybookCoreServer

import typings.ws.mod.WebSocketServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsGetServerChannelMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/get-server-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/get-server-channel", "ServerChannel")
  @js.native
  open class ServerChannel protected () extends StObject {
    def this(server: Server) = this()
    
    def emit(`type`: String): Unit = js.native
    def emit(`type`: String, args: js.Array[Any]): Unit = js.native
    
    var webSocketServer: WebSocketServer = js.native
  }
  
  inline def getServerChannel(server: Server): ServerChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerChannel")(server.asInstanceOf[js.Any]).asInstanceOf[ServerChannel]
  
  type Server = /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new <T extends ws.ws.WebSocket = ws.ws.WebSocket>(options : ws.ws.ServerOptions | undefined, callback : (): void | undefined): ws.ws.Server<T>>[0]['server'] */ js.Any
}
