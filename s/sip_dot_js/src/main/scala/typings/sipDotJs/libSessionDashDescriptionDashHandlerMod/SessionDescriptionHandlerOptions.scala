package typings.sipDotJs.libSessionDashDescriptionDashHandlerMod

import typings.sipDotJs.Anon_Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescriptionHandlerOptions extends js.Object {
  var constraints: js.UndefOr[Anon_Audio] = js.undefined
  var modifiers: js.UndefOr[SessionDescriptionHandlerModifiers] = js.undefined
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(constraints: Anon_Audio = null, modifiers: SessionDescriptionHandlerModifiers = null): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
}

