package typings
package reactDashTooltipLib.reactDashTooltipMod.ReactTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available data-* attributes to be used by a tooltip, this interface isn't used by ReactTooltip itself as any
  * data-* attribute can exist on a JSX element without type checking, but it at least be useful for developers
  * to ensure they're using attributes which ReactTooltip support
  */
trait DataProps extends js.Object {
  var `data-border`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-class`: js.UndefOr[java.lang.String] = js.undefined
  var `data-delay-hide`: js.UndefOr[scala.Double] = js.undefined
  var `data-delay-show`: js.UndefOr[scala.Double] = js.undefined
  var `data-effect`: js.UndefOr[Effect] = js.undefined
  var `data-event`: js.UndefOr[ElementEvents] = js.undefined
  var `data-event-off`: js.UndefOr[ElementEvents] = js.undefined
  var `data-html`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-iscapture`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-multiline`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-offset`: js.UndefOr[Offset] = js.undefined
  var `data-place`: js.UndefOr[Place] = js.undefined
  var `data-scroll-hide`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-tip-disable`: js.UndefOr[scala.Boolean] = js.undefined
  var `data-type`: js.UndefOr[Type] = js.undefined
}

