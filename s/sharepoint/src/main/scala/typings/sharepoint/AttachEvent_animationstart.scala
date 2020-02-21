package typings.sharepoint

import typings.sharepoint.sharepointStrings.animationstart
import typings.std.AnimationEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_animationstart extends js.Object {
  def apply(
    `type`: animationstart,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

