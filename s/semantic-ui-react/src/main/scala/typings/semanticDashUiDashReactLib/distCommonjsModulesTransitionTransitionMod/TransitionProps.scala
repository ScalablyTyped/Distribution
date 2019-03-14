package typings
package semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps
  extends StrictTransitionProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object TransitionProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animation: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTRANSITIONS | java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    directional: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Double | java.lang.String | TransitionPropDuration = null,
    mountOnShow: js.UndefOr[scala.Boolean] = js.undefined,
    onComplete: (/* nothing */ scala.Null, /* data */ TransitionEventData) => scala.Unit = null,
    onHide: (/* nothing */ scala.Null, /* data */ TransitionEventData) => scala.Unit = null,
    onShow: (/* nothing */ scala.Null, /* data */ TransitionEventData) => scala.Unit = null,
    onStart: (/* nothing */ scala.Null, /* data */ TransitionEventData) => scala.Unit = null,
    reactKey: java.lang.String = null,
    transitionOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    unmountOnHide: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): TransitionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnShow)) __obj.updateDynamic("mountOnShow")(mountOnShow)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2(onComplete))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (reactKey != null) __obj.updateDynamic("reactKey")(reactKey)
    if (!js.isUndefined(transitionOnMount)) __obj.updateDynamic("transitionOnMount")(transitionOnMount)
    if (!js.isUndefined(unmountOnHide)) __obj.updateDynamic("unmountOnHide")(unmountOnHide)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TransitionProps]
  }
}

