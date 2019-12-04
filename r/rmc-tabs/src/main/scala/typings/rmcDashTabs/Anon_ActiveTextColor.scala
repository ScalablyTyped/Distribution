package typings.rmcDashTabs

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTextColor extends js.Object {
  var activeTextColor: String
  var container: Anon_Height
  var inactiveTextColor: String
  var tab: ViewStyle
  var tabs: ViewStyle
  var textStyle: ViewStyle
  var underline: ViewStyle
}

object Anon_ActiveTextColor {
  @scala.inline
  def apply(
    activeTextColor: String,
    container: Anon_Height,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): Anon_ActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActiveTextColor]
  }
}

