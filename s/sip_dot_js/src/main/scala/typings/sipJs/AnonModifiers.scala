package typings.sipJs

import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModifiers extends js.Object {
  var modifiers: js.UndefOr[SessionDescriptionHandlerModifiers] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object AnonModifiers {
  @scala.inline
  def apply(
    modifiers: SessionDescriptionHandlerModifiers = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): AnonModifiers = {
    val __obj = js.Dynamic.literal()
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModifiers]
  }
}

