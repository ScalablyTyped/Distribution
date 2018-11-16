package typings
package reactDashToolboxLib.libCardCardMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CardMediaProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
   * Additional properties passed to component root.
   */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
     * Forces a 16:9 or 1:1 aspect ratio respectively. Unset, the media area will have a flexible height.
     */
  var aspectRatio: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.wide | reactDashToolboxLib.reactDashToolboxLibStrings.square
  ] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Sets the background color.
     */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Creates a dark overlay underneath the child components.
     */
  var contentOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Can be used instead of children. Accepts an element or a URL string.
     */
  var image: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[CardMediaTheme] = js.undefined
}

