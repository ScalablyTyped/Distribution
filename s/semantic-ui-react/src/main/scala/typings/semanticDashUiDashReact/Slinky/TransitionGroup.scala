package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.default
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object TransitionGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionGroupMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: SemanticTRANSITIONS | String = null,
    as: js.Any = null,
    directional: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String | TransitionPropDuration = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(directional)) __obj.updateDynamic("directional")(directional)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransitionGroupProps
}

