package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.wheel
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_wheel extends js.Object {
  
  def apply(
    `type`: wheel,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
