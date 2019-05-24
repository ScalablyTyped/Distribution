package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Modifiers extends js.Object {
  var modifiers: js.UndefOr[
    sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ] = js.undefined
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
}

object Anon_Modifiers {
  @scala.inline
  def apply(
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers = null,
    sessionDescriptionHandlerOptions: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions = null
  ): Anon_Modifiers = {
    val __obj = js.Dynamic.literal()
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (sessionDescriptionHandlerOptions != null) __obj.updateDynamic("sessionDescriptionHandlerOptions")(sessionDescriptionHandlerOptions)
    __obj.asInstanceOf[Anon_Modifiers]
  }
}

