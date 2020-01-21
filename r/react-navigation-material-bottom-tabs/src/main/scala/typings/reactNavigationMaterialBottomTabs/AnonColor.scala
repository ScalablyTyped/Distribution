package typings.reactNavigationMaterialBottomTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: String
  var focused: Boolean
  var route: AnonKey
}

object AnonColor {
  @scala.inline
  def apply(color: String, focused: Boolean, route: AnonKey): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColor]
  }
}

