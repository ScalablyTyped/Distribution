package typings
package reactDashToolboxLib.libTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabsProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Disable the animation below the active tab.
     * @default false
     */
  var disableAnimatedBottomBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If True, the tabs will be fixed, covering the whole width.
     */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * `unmounted` mode will not mount the tab content of inactive tabs.
     * `display` mode will mount but hide inactive tabs.
     * Consider holding state outside of the Tabs component before using `display` mode
     * @default unmounted
     */
  var hideMode: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.display | reactDashToolboxLib.reactDashToolboxLibStrings.unmounted
  ] = js.undefined
  /**
     * Current
     * @default 0
     */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
     * If True, the tabs will have an inverse style.
     */
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Callback function that is fired when the tab changes.
     */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TabsTheme] = js.undefined
}

