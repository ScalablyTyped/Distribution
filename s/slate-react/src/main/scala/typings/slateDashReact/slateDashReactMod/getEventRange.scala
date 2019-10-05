package typings.slateDashReact.slateDashReactMod

import typings.react.Element
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "getEventRange")
@js.native
object getEventRange extends js.Object {
  def apply(event: SyntheticEvent[Element, Event], editor: typings.slate.slateMod.Editor): Range | Null = js.native
  def apply(event: typings.std.Event, editor: typings.slate.slateMod.Editor): Range | Null = js.native
}

