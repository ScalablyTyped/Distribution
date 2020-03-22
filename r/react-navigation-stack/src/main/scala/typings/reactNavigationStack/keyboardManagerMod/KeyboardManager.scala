package typings.reactNavigationStack.keyboardManagerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardManager
  extends Component[Props, js.Object, js.Any] {
  var clearKeyboardTimeout: js.Any = js.native
  var handlePageChangeCancel: js.Any = js.native
  var handlePageChangeConfirm: js.Any = js.native
  var handlePageChangeStart: js.Any = js.native
  var keyboardTimeout: js.Any = js.native
  var previouslyFocusedTextInput: js.Any = js.native
  var startTimestamp: js.Any = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MKeyboardManager(): Unit = js.native
}

