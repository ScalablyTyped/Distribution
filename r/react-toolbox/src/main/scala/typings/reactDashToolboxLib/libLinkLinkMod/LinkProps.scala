package typings
package reactDashToolboxLib.libLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinkProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
   * Additional parameters passed to anchor element.
   */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
     * If true, adds active style to link.
     * @default false
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Sets a count number.
     */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
     * Sets the anchor link.
     */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
     * An icon key string to include a FontIcon component in front of the text.
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * The text string used for the text content of the link.
     */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[LinkTheme] = js.undefined
}

