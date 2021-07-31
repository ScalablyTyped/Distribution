package typings.simpleWebsocket

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-websocket", JSImport.Namespace)
  @js.native
  class ^ protected () extends Socket {
    def this(options: String) = this()
    def this(options: Options) = this()
  }
  @JSImport("simple-websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("simple-websocket", "WEBSOCKET_SUPPORT")
  @js.native
  def WEBSOCKET_SUPPORT: Boolean = js.native
  @scala.inline
  def WEBSOCKET_SUPPORT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEBSOCKET_SUPPORT")(x.asInstanceOf[js.Any])
  
  trait Options
    extends StObject
       with DuplexOptions {
    
    /** raw websocket instance to wrap */
    var socket: js.UndefOr[typings.ws.mod.^] = js.undefined
    
    /** websocket server url */
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocket(value: typings.ws.mod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Socket extends Duplex {
    
    /** Send text/binary data to the WebSocket server */
    def send(chunk: js.Any): Unit = js.native
  }
}
