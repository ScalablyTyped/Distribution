package typings.samchon

import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icommunicatorMod {
  
  @js.native
  trait ICommunicator extends IProtocol {
    
    /**
      * Close connection.
      */
    def close(): Unit = js.native
    
    /**
      * Test connection.
      *
      * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
      * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
      * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
      *
      * @return true if connected, otherwise false.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Callback function for connection closed.
      */
    var onClose: js.Function = js.native
  }
  object ICommunicator {
    
    @scala.inline
    def apply(
      close: () => Unit,
      isConnected: () => Boolean,
      onClose: js.Function,
      replyData: Invoke => Unit,
      sendData: Invoke => Unit
    ): ICommunicator = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isConnected = js.Any.fromFunction0(isConnected), onClose = onClose.asInstanceOf[js.Any], replyData = js.Any.fromFunction1(replyData), sendData = js.Any.fromFunction1(sendData))
      __obj.asInstanceOf[ICommunicator]
    }
    
    @scala.inline
    implicit class ICommunicatorMutableBuilder[Self <: ICommunicator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    }
  }
}
