package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetPositionOptions extends js.Object {
  var withoutCallbacks: scala.Boolean
}

object SetPositionOptions {
  @scala.inline
  def apply(withoutCallbacks: scala.Boolean): SetPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withoutCallbacks")(withoutCallbacks)
    __obj.asInstanceOf[SetPositionOptions]
  }
}

