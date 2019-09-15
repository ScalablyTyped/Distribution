package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalMod.default
import typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalProps
import typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod.TransitionablePortalState
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typings.semanticDashUiDashReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, open */
object TransitionablePortal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onClose: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onHide: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    onOpen: (/* nothing */ Null, /* data */ PortalProps with TransitionablePortalState) => Unit = null,
    onStart: (/* nothing */ Null, /* data */ TransitionEventData with TransitionablePortalState) => Unit = null,
    transition: TransitionProps = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (transition != null) __obj.updateDynamic("transition")(transition)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransitionablePortalProps
}

