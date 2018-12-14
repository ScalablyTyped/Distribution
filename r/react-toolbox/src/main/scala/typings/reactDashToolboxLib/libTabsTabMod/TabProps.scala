package typings
package reactDashToolboxLib.libTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
   * Additional properties passed to Tab root container.
   */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
     * If true, the current component is visible.
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Additional class name to provide custom styling for the active tab.
     */
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
     * If true, the current component is not clickable.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the current component is not visible.
     * @default false
     */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Icon to be used in inner FontIcon.
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Label text for navigation header.
     */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback function that is fired when the tab is activated.
     */
  var onActive: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TabTheme] = js.undefined
}

