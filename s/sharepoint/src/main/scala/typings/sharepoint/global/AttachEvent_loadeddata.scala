package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.loadeddata
import typings.std.Event
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_loadeddata extends js.Object {
  def apply(
    `type`: loadeddata,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

