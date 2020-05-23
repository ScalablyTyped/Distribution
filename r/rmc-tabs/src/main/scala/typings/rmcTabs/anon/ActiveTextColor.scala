package typings.rmcTabs.anon

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTextColor extends js.Object {
  var activeTextColor: String
  var container: Height
  var inactiveTextColor: String
  var tab: ViewStyle
  var tabs: ViewStyle
  var textStyle: ViewStyle
  var underline: ViewStyle
}

object ActiveTextColor {
  @scala.inline
  def apply(
    activeTextColor: String,
    container: Height,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): ActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTextColor]
  }
}

