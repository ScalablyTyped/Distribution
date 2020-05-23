package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.error
import typings.std.ErrorEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_error extends js.Object {
  def apply(
    `type`: error,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

