package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.keypress
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_keypress extends js.Object {
  
  def apply(
    `type`: keypress,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
