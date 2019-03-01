package typings
package simpleDashCwDashNodeLib.simpleDashCwDashNodeMod.ChatWorkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatWorkInitOptions extends js.Object {
  var token: java.lang.String
}

object ChatWorkInitOptions {
  @scala.inline
  def apply(token: java.lang.String): ChatWorkInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ChatWorkInitOptions]
  }
}

