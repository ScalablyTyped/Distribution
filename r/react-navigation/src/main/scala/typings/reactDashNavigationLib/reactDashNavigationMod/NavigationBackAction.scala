package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBackAction
  extends NavigationStackAction
     with NavigationBackActionPayload
     with NavigationTabAction {
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/BACK`
}

object NavigationBackAction {
  @scala.inline
  def apply(
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/BACK`,
    key: java.lang.String = null
  ): NavigationBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NavigationBackAction]
  }
}

