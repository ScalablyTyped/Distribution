package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.pointerup
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointerup extends js.Object {
  
  def apply(
    `type`: pointerup,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
