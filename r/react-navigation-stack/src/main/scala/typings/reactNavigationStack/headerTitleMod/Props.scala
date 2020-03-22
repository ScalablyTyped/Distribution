package typings.reactNavigationStack.headerTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentProps<react-native.react-native.Animated.AnimatedComponent<react-native.react-native.Text>> & {  tintColor ? :string,   children ? :string} */
trait Props extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: String = null, tintColor: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

