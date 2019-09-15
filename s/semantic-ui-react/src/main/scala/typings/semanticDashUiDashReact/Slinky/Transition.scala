package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionMod.default
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object Transition
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesTransitionMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: SemanticTRANSITIONS | String = null,
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
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
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
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransitionProps
}

