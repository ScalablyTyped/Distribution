package typings.reactDashNativeDashVectorDashIcons.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarAndroidProps extends js.Object {
  /**
    * Color of the icons
    *
    * @default 'black'
    */
  var iconColor: String
  /**
    * Size of the icons
    *
    * @default 24
    */
  var iconSize: Double
  /**
    * Name of the navigation logo icon
    * (similar to ToolbarAndroid logo)
    *
    */
  var logoName: String
  /**
    * Name of the navigation icon
    * (similar to ToolbarAndroid navIcon)
    *
    */
  var navIconName: String
  /**
    * Name of the overflow icon
    * (similar to ToolbarAndroid overflowIcon)
    *
    */
  var overflowIconName: String
}

object ToolbarAndroidProps {
  @scala.inline
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal(iconColor = iconColor, iconSize = iconSize, logoName = logoName, navIconName = navIconName, overflowIconName = overflowIconName)
  
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
}

