package typings.sharepoint.global

import typings.sharepoint.sharepointStrings.animationend
import typings.std.AnimationEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_animationend extends js.Object {
  
  def apply(
    `type`: animationend,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}
