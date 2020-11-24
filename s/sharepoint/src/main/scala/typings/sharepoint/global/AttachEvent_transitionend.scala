package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.transitionend
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_transitionend extends js.Object {
  
  def apply(
    `type`: transitionend,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
