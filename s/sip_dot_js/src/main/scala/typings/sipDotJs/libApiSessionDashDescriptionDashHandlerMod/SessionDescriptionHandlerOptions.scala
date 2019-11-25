package typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDescriptionHandlerOptions extends js.Object {
  var constraints: js.UndefOr[js.Object] = js.undefined
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(constraints: js.Object = null): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
}

