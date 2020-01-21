package typings.server

import typings.server.optionsMod.CsurfOptions
import typings.server.serverBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCsurf extends js.Object {
  var csurf: js.UndefOr[`false` | CsurfOptions] = js.undefined
}

object AnonCsurf {
  @scala.inline
  def apply(csurf: `false` | CsurfOptions = null): AnonCsurf = {
    val __obj = js.Dynamic.literal()
    if (csurf != null) __obj.updateDynamic("csurf")(csurf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCsurf]
  }
}

