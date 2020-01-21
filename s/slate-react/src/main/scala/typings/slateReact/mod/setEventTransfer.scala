package typings.slateReact.mod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "setEventTransfer")
@js.native
object setEventTransfer extends js.Object {
  def apply(event: SyntheticEvent[Element, Event_], `type`: SlateType, data: js.Any): Unit = js.native
  def apply(event: Event_, `type`: SlateType, data: js.Any): Unit = js.native
}

