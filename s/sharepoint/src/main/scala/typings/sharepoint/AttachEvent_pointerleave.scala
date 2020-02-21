package typings.sharepoint

import typings.sharepoint.sharepointStrings.pointerleave
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointerleave extends js.Object {
  def apply(
    `type`: pointerleave,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

