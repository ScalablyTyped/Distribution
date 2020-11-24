package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.paste
import typings.std.ClipboardEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_paste extends js.Object {
  
  def apply(
    `type`: paste,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
