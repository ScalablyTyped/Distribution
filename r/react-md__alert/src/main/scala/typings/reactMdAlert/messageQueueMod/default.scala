package typings.reactMdAlert.messageQueueMod

import typings.react.mod.ReactElement
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/alert/types/MessageQueue", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This component is used to be able to create a queue of messages with the `Snackbar` and
    * `Toast` components with a _fairly_ decent API out of the box.
    */
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

