package typings.sipJs.anon

import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers extends js.Object {
  var modifiers: js.UndefOr[typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object Modifiers {
  @scala.inline
  def apply(
    modifiers: typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandlerModifiers = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}

