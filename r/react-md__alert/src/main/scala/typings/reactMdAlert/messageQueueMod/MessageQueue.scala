package typings.reactMdAlert.messageQueueMod

import typings.react.mod.ReactElement
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/alert/types/MessageQueue", "MessageQueue")
@js.native
object MessageQueue extends js.Object {
  
  def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = js.native
  
  @js.native
  object propTypes extends js.Object {
    
    var children: js.Any = js.native
    
    var defaultQueue: js.Any = js.native
    
    var duplicates: js.Any = js.native
    
    var onActionClick: js.Any = js.native
    
    var timeout: js.Any = js.native
  }
}
