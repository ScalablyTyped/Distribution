package typings
package sipDotJsLib.libSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescriptionHandlerOptions extends js.Object {
  var constraints: js.UndefOr[sipDotJsLib.Anon_Audio] = js.undefined
  var modifiers: js.UndefOr[SessionDescriptionHandlerModifiers] = js.undefined
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(constraints: sipDotJsLib.Anon_Audio = null, modifiers: SessionDescriptionHandlerModifiers = null): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
}

