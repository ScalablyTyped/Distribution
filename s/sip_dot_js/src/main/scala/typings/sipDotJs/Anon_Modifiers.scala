package typings.sipDotJs

import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modifiers extends js.Object {
  var modifiers: js.UndefOr[SessionDescriptionHandlerModifiers] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object Anon_Modifiers {
  @scala.inline
  def apply(
    modifiers: SessionDescriptionHandlerModifiers = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): Anon_Modifiers = {
    val __obj = js.Dynamic.literal()
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions)
    __obj.asInstanceOf[Anon_Modifiers]
  }
}

