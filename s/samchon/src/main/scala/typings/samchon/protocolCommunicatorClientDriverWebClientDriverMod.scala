package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorWebCommunicatorMod.WebCommunicator
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorClientDriverWebClientDriverMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typings.samchon.protocolCommunicatorIcommunicatorMod.ICommunicator because Already inherited
  - typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/WebClientDriver", "WebClientDriver")
  @js.native
  open class WebClientDriver protected () extends WebCommunicator {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: Any, path: String, session_id: String) = this()
    
    /**
      * Get requested path.
      */
    def getPath(): String = js.native
    
    /**
      * Get session ID, an identifier of the remote client.
      */
    def getSessionID(): String = js.native
    
    /**
      * @inheritdoc
      */
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var listening_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var path_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var session_id_ : Any = js.native
  }
}
