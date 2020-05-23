package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.ratechange
import typings.std.Event
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_ratechange extends js.Object {
  def apply(
    `type`: ratechange,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

