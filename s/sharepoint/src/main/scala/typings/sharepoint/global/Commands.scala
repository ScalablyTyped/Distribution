package typings.sharepoint.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Commands")
@js.native
object Commands extends js.Object {
  
  @js.native
  class CommandIds ()
    extends typings.sharepoint.Commands.CommandIds
  /* static members */
  @js.native
  object CommandIds extends js.Object {
    
    var ApplicationStateChanged: String = js.native
    
    var GlobalRedo: String = js.native
    
    var GlobalUndo: String = js.native
    
    var Redo: String = js.native
    
    var Undo: String = js.native
  }
  
  @js.native
  class GlobalRedoProperties ()
    extends typings.sharepoint.Commands.GlobalRedoProperties
  /* static members */
  @js.native
  object GlobalRedoProperties extends js.Object {
    
    var SequenceNumber: String = js.native
  }
  
  @js.native
  class GlobalUndoProperties ()
    extends typings.sharepoint.Commands.GlobalUndoProperties
  /* static members */
  @js.native
  object GlobalUndoProperties extends js.Object {
    
    var SequenceNumber: String = js.native
  }
  
  @js.native
  class RedoProperties ()
    extends typings.sharepoint.Commands.RedoProperties
  /* static members */
  @js.native
  object RedoProperties extends js.Object {
    
    var SequenceNumber: String = js.native
  }
  
  @js.native
  class UndoProperties ()
    extends typings.sharepoint.Commands.UndoProperties
  /* static members */
  @js.native
  object UndoProperties extends js.Object {
    
    var SequenceNumber: String = js.native
  }
}
