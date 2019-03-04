package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventSubscription extends js.Object {
  def remove(): scala.Unit
}

object NavigationEventSubscription {
  @scala.inline
  def apply(remove: js.Function0[scala.Unit]): NavigationEventSubscription = {
    val __obj = js.Dynamic.literal(remove = remove)
  
    __obj.asInstanceOf[NavigationEventSubscription]
  }
}

