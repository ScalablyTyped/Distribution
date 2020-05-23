package typings.sipJs.anon

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescriptionHandlerModifiers extends js.Object {
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object SessionDescriptionHandlerModifiers {
  @scala.inline
  def apply(
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): SessionDescriptionHandlerModifiers = {
    val __obj = js.Dynamic.literal()
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescriptionHandlerModifiers]
  }
}

