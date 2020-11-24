package typings.samchon

import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.sharedWorkerCommunicatorMod.SharedWorkerCommunicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/communicator/server_connector/SharedWorkerServerConnector", JSImport.Namespace)
@js.native
object sharedWorkerServerConnectorMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.icommunicatorMod.ICommunicator because Already inherited
  - typings.samchon.iserverconnectorMod.IServerConnector because var conflicts: onClose. Inlined onConnect, connect */ @js.native
  class SharedWorkerServerConnector protected () extends SharedWorkerCommunicator {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * Connect to a server.
      *
      * Connects to a server with specified *host* address and *port* number. After the connection has
      * succeeded, callback function {@link onConnect} is called. Listening data from the connected server also begins.
      * Replied messages from the connected server will be converted to {@link Invoke} classes and will be shifted to
      * the {@link WebCommunicator.listener listener}'s {@link IProtocol.replyData replyData()} method.
      *
      * If the connection fails immediately, either an event is dispatched or an exception is thrown: an error
      * event is dispatched if a host was specified, and an exception is thrown if no host was specified. Otherwise,
      * the status of the connection is reported by an event. If the socket is already connected, the existing
      * connection is closed first.
      *
      * @param ip The name or IP address of the host to connect to.
      *			 If no host is specified, the host that is contacted is the host where the calling file resides.
      *			 If you do not specify a host, use an event listener to determine whether the connection was
      *			 successful.
      * @param port The port number to connect to.
      */
    def connect(ip: String, port: Double): Unit = js.native
    /**
      * Connect to a SharedWorker.
      *
      * Connects to a server with specified *jstFile* path. If a SharedWorker instance of the *jsFile* is not
      * constructed yet, then the SharedWorker will be newly constructed. Otherwise the SharedWorker already exists,
      * then connect to the SharedWorker. After those processes, callback function {@link onConnect} is called.
      * Listening data from the connected server also begins. Replied messages from the connected server will be
      * converted to {@link Invoke} classes and will be shifted to the {@link WebCommunicator.listener listener}'s
      * {@link IProtocol.replyData replyData()} method.
      *
      * If the connection fails immediately, either an event is dispatched or an exception is thrown: an error
      * event is dispatched if a host was specified, and an exception is thrown if no host was specified. Otherwise,
      * the status of the connection is reported by an event. If the socket is already connected, the existing
      * connection is closed first.
      *
      * @param jsFile Path of JavaScript file to execute who defines SharedWorker.
      */
    def connect(jsFile: String): Unit = js.native
    
    /**
      * @inheritdoc
      */
    var onConnect: js.Function = js.native
  }
}
