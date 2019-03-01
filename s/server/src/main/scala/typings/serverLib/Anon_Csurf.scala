package typings
package serverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Csurf extends js.Object {
  var csurf: js.UndefOr[serverLib.serverLibNumbers.`false` | serverLib.typingsOptionsMod.CsurfOptions] = js.undefined
}

object Anon_Csurf {
  @scala.inline
  def apply(csurf: serverLib.serverLibNumbers.`false` | serverLib.typingsOptionsMod.CsurfOptions = null): Anon_Csurf = {
    val __obj = js.Dynamic.literal()
    if (csurf != null) __obj.updateDynamic("csurf")(csurf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Csurf]
  }
}

