package typings.samchon

import typings.samchon.icommunicatorMod.ICommunicator
import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object communicatorBaseMod {
  
  @JSImport("samchon/protocol/communicator/communicator/_CommunicatorBase", "_CommunicatorBase")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class CommunicatorBase ()
    extends StObject
       with ICommunicator {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_binary(binary: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_string(str: String): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Is_binary_invoke(): Boolean = js.native
    
    /**
      * @hidden
      */
    /* private */ var binary_invoke_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var binary_parameters_ : Any = js.native
    
    /**
      * Close connection.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ var connected_ : Boolean = js.native
    
    /**
      * Test connection.
      *
      * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
      * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
      * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
      *
      * @return true if connected, otherwise false.
      */
    /* CompleteClass */
    override def isConnected(): Boolean = js.native
    
    /**
      * @hidden
      */
    /* protected */ var listener_ : IProtocol = js.native
    
    /**
      * Callback function for connection closed.
      */
    /* CompleteClass */
    var onClose: js.Function = js.native
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var unhandled_invokes_ : Any = js.native
  }
}
