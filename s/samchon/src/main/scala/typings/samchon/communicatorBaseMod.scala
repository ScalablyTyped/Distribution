package typings.samchon

import typings.samchon.icommunicatorMod.ICommunicator
import typings.samchon.iprotocolMod.IProtocol
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object communicatorBaseMod {
  
  @JSImport("samchon/protocol/communicator/communicator/_CommunicatorBase", "_CommunicatorBase")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class CommunicatorBase () extends ICommunicator {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_binary(binary: Uint8Array): Unit = js.native
    
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
    var binary_invoke_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var binary_parameters_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var connected_ : Boolean = js.native
    
    /**
      * @hidden
      */
    var listener_ : IProtocol = js.native
    
    /**
      * @hidden
      */
    var unhandled_invokes_ : js.Any = js.native
  }
}
