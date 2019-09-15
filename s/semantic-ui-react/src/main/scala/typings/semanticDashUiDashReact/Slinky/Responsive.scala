package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveMod.default
import typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveOnUpdateData
import typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object Responsive
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsResponsiveMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: () => Double = null,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ ResponsiveOnUpdateData) => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount)
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ResponsiveProps
}

