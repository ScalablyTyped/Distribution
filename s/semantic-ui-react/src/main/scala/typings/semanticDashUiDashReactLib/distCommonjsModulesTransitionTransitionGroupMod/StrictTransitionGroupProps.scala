package typings
package semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictTransitionGroupProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTRANSITIONS] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[
    scala.Double | java.lang.String | semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
  ] = js.undefined
}

object StrictTransitionGroupProps {
  @scala.inline
  def apply(
    animation: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTRANSITIONS = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    duration: scala.Double | java.lang.String | semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration = null
  ): StrictTransitionGroupProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictTransitionGroupProps]
  }
}

