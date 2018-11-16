package typings
package reactDashToolboxLib.libNavigationNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Array of objects that will be represented as <Button/> so the keys will be transferred as properties the Button Component.
     */
  var actions: js.UndefOr[coreDashJsLib.Array[_]] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Array of objects similar to actions but that will be rendered as <Link/> component definition.
     */
  var routes: js.UndefOr[coreDashJsLib.Array[_]] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[NavigationTheme] = js.undefined
  /**
     * Type of the navigation, it can be vertical or horizontal.
     * @default horizontal
     */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.vertical | reactDashToolboxLib.reactDashToolboxLibStrings.horizontal
  ] = js.undefined
}

