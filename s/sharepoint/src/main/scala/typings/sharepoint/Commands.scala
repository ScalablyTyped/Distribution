package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Commands")
@js.native
object Commands extends js.Object {
  @js.native
  class CommandIds () extends js.Object
  
  @js.native
  class GlobalRedoProperties () extends js.Object
  
  @js.native
  class GlobalUndoProperties () extends js.Object
  
  @js.native
  class RedoProperties () extends js.Object
  
  @js.native
  class UndoProperties () extends js.Object
  
  /* static members */
  @js.native
  object CommandIds extends js.Object {
    var ApplicationStateChanged: String = js.native
    var GlobalRedo: String = js.native
    var GlobalUndo: String = js.native
    var Redo: String = js.native
    var Undo: String = js.native
  }
  
  /* static members */
  @js.native
  object GlobalRedoProperties extends js.Object {
    var SequenceNumber: String = js.native
  }
  
  /* static members */
  @js.native
  object GlobalUndoProperties extends js.Object {
    var SequenceNumber: String = js.native
  }
  
  /* static members */
  @js.native
  object RedoProperties extends js.Object {
    var SequenceNumber: String = js.native
  }
  
  /* static members */
  @js.native
  object UndoProperties extends js.Object {
    var SequenceNumber: String = js.native
  }
  
}

