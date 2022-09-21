package typings.pusherJs

import typings.pusherJs.socketHooksMod.SocketHooks
import typings.pusherJs.socketMod.Socket
import typings.pusherJs.stateMod.State
import typings.pusherJs.urlLocationMod.URLLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpSocketMod {
  
  @JSImport("pusher-js/types/src/core/http/http_socket", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HTTPSocket {
    def this(hooks: SocketHooks, url: String) = this()
  }
  
  @js.native
  trait HTTPSocket
    extends StObject
       with Socket {
    
    /* private */ var closeStream: Any = js.native
    
    var hooks: SocketHooks = js.native
    
    var location: URLLocation = js.native
    
    /* private */ var onActivity: Any = js.native
    
    /* private */ var onChunk: Any = js.native
    
    def onClose(code: Any, reason: Any, wasClean: Any): Unit = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var onEvent: Any = js.native
    
    /* private */ var onOpen: Any = js.native
    
    @JSName("onactivity")
    def onactivity_MHTTPSocket(): Unit = js.native
    
    @JSName("onclose")
    def onclose_MHTTPSocket(closeEvent: Any): Unit = js.native
    
    @JSName("onerror")
    def onerror_MHTTPSocket(error: Any): Unit = js.native
    
    @JSName("onmessage")
    def onmessage_MHTTPSocket(message: Any): Unit = js.native
    
    @JSName("onopen")
    def onopen_MHTTPSocket(): Unit = js.native
    
    /* private */ var openStream: Any = js.native
    
    @JSName("ping")
    def ping_MHTTPSocket(): Unit = js.native
    
    var readyState: State = js.native
    
    def reconnect(): Unit = js.native
    
    @JSName("sendRaw")
    def sendRaw_MHTTPSocket(payload: Any): Boolean = js.native
    
    var session: String = js.native
    
    var stream: typings.pusherJs.httpRequestMod.default = js.native
  }
}
