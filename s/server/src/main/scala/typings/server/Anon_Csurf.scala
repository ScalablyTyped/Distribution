package typings.server

import typings.server.serverNumbers.`false`
import typings.server.typingsOptionsMod.CsurfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Csurf extends js.Object {
  var csurf: js.UndefOr[`false` | CsurfOptions] = js.undefined
}

object Anon_Csurf {
  @scala.inline
  def apply(csurf: `false` | CsurfOptions = null): Anon_Csurf = {
    val __obj = js.Dynamic.literal()
    if (csurf != null) __obj.updateDynamic("csurf")(csurf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Csurf]
  }
}

