package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object communicatorMod {
  
  @JSImport("samchon/protocol/communicator/communicator/Communicator", "Communicator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Communicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* private */ var _Handle_close: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Handle_error: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Listen_data: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Listen_header: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Listen_piece: Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Start_listen(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var data_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var data_index_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var header_bytes_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var listening_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var socket_ : Any = js.native
  }
}
