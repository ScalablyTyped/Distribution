package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import typings.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    var _Handle_close: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Handle_error: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Listen_data: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Listen_header: js.Any = js.native
    
    /**
      * @hidden
      */
    var _Listen_piece: js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Start_listen(): Unit = js.native
    
    /**
      * @hidden
      */
    var data_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var data_index_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var header_bytes_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var listening_ : js.Any = js.native
    
    /**
      * @hidden
      */
    var socket_ : js.Any = js.native
  }
}
