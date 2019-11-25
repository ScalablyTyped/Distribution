package typings.sipDotJs.libApiInvitationDashAcceptDashOptionsMod

import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvitationAcceptOptions extends js.Object {
  /**
    * @deprecated Use delegate instead.
    * @internal
    */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.undefined
  /**
    * Modifiers to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.undefined
  /**
    * Options to pass to SessionDescriptionHandler's getDescription() and setDescription().
    */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.undefined
}

object InvitationAcceptOptions {
  @scala.inline
  def apply(
    onInfo: /* request */ IncomingRequestMessage => Unit = null,
    sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = null,
    sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = null
  ): InvitationAcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1(onInfo))
    if (sessionDescriptionHandlerModifiers != null) __obj.updateDynamic("sessionDescriptionHandlerModifiers")(sessionDescriptionHandlerModifiers.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitationAcceptOptions]
  }
}

