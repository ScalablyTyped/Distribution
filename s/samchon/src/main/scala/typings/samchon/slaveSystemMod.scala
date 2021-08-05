package typings.samchon

import typings.samchon.icommunicatorMod.ICommunicator
import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slaveSystemMod {
  
  @JSImport("samchon/templates/slave/SlaveSystem", "SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends StObject
       with IProtocol {
    
    /* private */ var _Complete_process: js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Reply_data(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ var communicator_ : ICommunicator = js.native
    
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
  }
}
