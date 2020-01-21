package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/Communicator", JSImport.Namespace)
@js.native
object communicatorMod extends js.Object {
  @js.native
  abstract class Communicator () extends CommunicatorBase {
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
    /**
      * @hidden
      */
    /* protected */ def _Start_listen(): Unit = js.native
  }
  
}

