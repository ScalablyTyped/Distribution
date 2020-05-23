package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.focusin
import typings.std.FocusEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_focusin extends js.Object {
  def apply(
    `type`: focusin,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

