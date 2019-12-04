package typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsTouchableItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps<new (): react-native.react-native.TouchableWithoutFeedback> & {  pressColor  :string,   borderless  :boolean} */
trait Props extends js.Object {
  var borderless: Boolean
  var pressColor: String
}

object Props {
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): Props = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

