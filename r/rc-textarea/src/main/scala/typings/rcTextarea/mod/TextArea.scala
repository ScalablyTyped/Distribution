package typings.rcTextarea.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextArea
  extends Component[TextAreaProps, TextAreaState, js.Any] {
  var resizableTextArea: typings.rcTextarea.resizableTextAreaMod.default = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  def handleKeyDown(e: KeyboardEvent[HTMLTextAreaElement]): Unit = js.native
  def saveTextArea(resizableTextArea: typings.rcTextarea.resizableTextAreaMod.default): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, callback: js.Function0[Unit]): Unit = js.native
}

