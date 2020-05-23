package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.touchmove
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_touchmove extends js.Object {
  def apply(
    `type`: touchmove,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

