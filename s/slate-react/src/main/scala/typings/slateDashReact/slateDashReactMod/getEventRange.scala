package typings.slateDashReact.slateDashReactMod

import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Range
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "getEventRange")
@js.native
object getEventRange extends js.Object {
  def apply(event: SyntheticEvent[Element, Event], editor: typings.slate.slateMod.Editor): Range | Null = js.native
  def apply(event: Event, editor: typings.slate.slateMod.Editor): Range | Null = js.native
}

