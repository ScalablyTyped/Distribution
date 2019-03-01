package typings
package reactDashNativeDashVectorDashIconsLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarAndroidProps extends js.Object {
  /**
    * Color of the icons
    *
    * @default 'black'
    */
  var iconColor: java.lang.String
  /**
    * Size of the icons
    *
    * @default 24
    */
  var iconSize: scala.Double
  /**
    * Name of the navigation logo icon
    * (similar to ToolbarAndroid logo)
    *
    */
  var logoName: java.lang.String
  /**
    * Name of the navigation icon
    * (similar to ToolbarAndroid navIcon)
    *
    */
  var navIconName: java.lang.String
  /**
    * Name of the overflow icon
    * (similar to ToolbarAndroid overflowIcon)
    *
    */
  var overflowIconName: java.lang.String
}

object ToolbarAndroidProps {
  @scala.inline
  def apply(
    iconColor: java.lang.String,
    iconSize: scala.Double,
    logoName: java.lang.String,
    navIconName: java.lang.String,
    overflowIconName: java.lang.String
  ): ToolbarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconColor")(iconColor)
    __obj.updateDynamic("iconSize")(iconSize)
    __obj.updateDynamic("logoName")(logoName)
    __obj.updateDynamic("navIconName")(navIconName)
    __obj.updateDynamic("overflowIconName")(overflowIconName)
    __obj.asInstanceOf[ToolbarAndroidProps]
  }
}

