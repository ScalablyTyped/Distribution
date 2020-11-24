package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.keydown
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_keydown extends js.Object {
  
  def apply(
    `type`: keydown,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
