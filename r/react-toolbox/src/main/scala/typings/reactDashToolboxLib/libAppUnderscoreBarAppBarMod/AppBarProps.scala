package typings
package reactDashToolboxLib.libAppUnderscoreBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppBarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Determine if the bar should have position fixed or relative.
     * @default false
     */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the AppBar doesn't show a shadow.
     * @default false
     */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If it exists it is used as the AppBar left icon
     */
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Called when the left icon is clicked
     */
  var onLeftIconClick: js.UndefOr[js.Function] = js.undefined
  /**
     * Called when the righticon is clicked
     */
  var onRightIconClick: js.UndefOr[js.Function] = js.undefined
  /**
     * If it exists it is used as the AppBar right icon
     */
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Whether AppBar should be hidden during scroll.
     * @default false
     */
  var scrollHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[AppBarTheme] = js.undefined
  /**
     * If it exists it is used as the AppBar title
     */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

