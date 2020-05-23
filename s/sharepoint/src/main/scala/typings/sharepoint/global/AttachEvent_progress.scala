package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.progress
import typings.std.EventTarget
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_progress extends js.Object {
  def apply(
    `type`: progress,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

