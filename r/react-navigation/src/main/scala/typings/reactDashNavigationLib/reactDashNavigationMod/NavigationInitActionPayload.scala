package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationInitActionPayload extends js.Object {
  var params: js.UndefOr[NavigationParams] = js.undefined
}

object NavigationInitActionPayload {
  @scala.inline
  def apply(params: NavigationParams = null): NavigationInitActionPayload = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationInitActionPayload]
  }
}

