package typings
package reactDashToolboxLib.libRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RippleProps
  extends /**
   * Additional properties passed to rippled component.
   */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * True in case you want a centered ripple.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Function that will be called when the ripple animation ends.
     */
  var onRippleEnded: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Factor to indicate how much should the ripple spread under the component.
     * @default 2
     */
  var spread: js.UndefOr[scala.Double] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[RippleTheme] = js.undefined
}

