package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.dblclick
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_dblclick extends js.Object {
  def apply(
    `type`: dblclick,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

