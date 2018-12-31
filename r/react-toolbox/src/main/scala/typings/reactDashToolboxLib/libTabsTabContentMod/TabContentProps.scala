package typings
package reactDashToolboxLib.libTabsTabContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Whether tab is active.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tab content.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Current tab index.
    */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TabContentTheme] = js.undefined
}

