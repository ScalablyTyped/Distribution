package typings.rcSelect.generatorMod

import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTagProps extends js.Object {
  var closable: Boolean = js.native
  var disabled: Boolean = js.native
  var label: DefaultValueType = js.native
  var value: DefaultValueType = js.native
  def onClose(): Unit = js.native
  def onClose(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
}

