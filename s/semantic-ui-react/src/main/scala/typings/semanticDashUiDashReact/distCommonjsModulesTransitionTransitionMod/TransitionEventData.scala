package typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEventData extends TransitionProps {
  var status: TRANSITION_STATUSES
}

object TransitionEventData {
  @scala.inline
  def apply(
    status: TRANSITION_STATUSES,
    animation: SemanticTRANSITIONS | String = null,
    children: ReactNode = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null,
    mountOnShow: js.UndefOr[Boolean] = js.undefined,
    onComplete: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onShow: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData) => Unit = null,
    reactKey: String = null,
    transitionOnMount: js.UndefOr[Boolean] = js.undefined,
    unmountOnHide: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TransitionEventData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnShow)) __obj.updateDynamic("mountOnShow")(mountOnShow.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (reactKey != null) __obj.updateDynamic("reactKey")(reactKey.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionOnMount)) __obj.updateDynamic("transitionOnMount")(transitionOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnHide)) __obj.updateDynamic("unmountOnHide")(unmountOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionEventData]
  }
}

