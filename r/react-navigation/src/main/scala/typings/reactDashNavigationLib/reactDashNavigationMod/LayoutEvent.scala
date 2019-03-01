package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEvent extends js.Object {
  var nativeEvent: reactDashNavigationLib.Anon_Layout
}

object LayoutEvent {
  @scala.inline
  def apply(nativeEvent: reactDashNavigationLib.Anon_Layout): LayoutEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.asInstanceOf[LayoutEvent]
  }
}

