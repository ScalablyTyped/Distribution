package typings.slateReact.mod

import typings.react.mod.SyntheticEvent
import typings.slate.mod.Range
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "getEventRange")
@js.native
object getEventRange extends js.Object {
  def apply(event: SyntheticEvent[Element, Event_], editor: typings.slate.mod.Editor): Range | Null = js.native
  def apply(event: Event_, editor: typings.slate.mod.Editor): Range | Null = js.native
}

