package typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionGroupProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Whether it is directional animation event or not. Use it only for custom transitions. */
  var directional: js.UndefOr[Boolean] = js.undefined
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.undefined
}

object StrictTransitionGroupProps {
  @scala.inline
  def apply(
    animation: SemanticTRANSITIONS | String = null,
    as: js.Any = null,
    children: ReactNode = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null
  ): StrictTransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTransitionGroupProps]
  }
}

