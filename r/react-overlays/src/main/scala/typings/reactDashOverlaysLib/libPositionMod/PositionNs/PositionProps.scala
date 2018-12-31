package typings
package reactDashOverlaysLib.libPositionMod.PositionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionProps extends js.Object {
  /**
    * "offsetParent" of the component
    */
  var container: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | js.Function] = js.undefined
  /**
    * Minimum spacing in pixels between container border and component border
    */
  var containerPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * How to position the component relative to the target
    */
  var placement: js.UndefOr[
    reactDashOverlaysLib.reactDashOverlaysLibStrings.top | reactDashOverlaysLib.reactDashOverlaysLibStrings.right | reactDashOverlaysLib.reactDashOverlaysLibStrings.bottom | reactDashOverlaysLib.reactDashOverlaysLibStrings.left
  ] = js.undefined
  /**
    * Whether the position should be changed on each update
    */
  var shouldUpdatePosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A node, element, or function that returns either. The child will be
    * be positioned next to the `target` specified.
    */
  var target: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | js.Function] = js.undefined
}

