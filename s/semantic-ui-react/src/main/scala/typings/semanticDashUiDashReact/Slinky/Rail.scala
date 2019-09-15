package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsElementsRailRailMod.RailProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className */
object Rail
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsElementsRailMod.default.asInstanceOf[String | js.Object]
  def apply(
    position: SemanticFLOATS,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: js.UndefOr[Boolean] = js.undefined,
    close: Boolean | very = null,
    content: SemanticShorthandContent = null,
    dividing: js.UndefOr[Boolean] = js.undefined,
    internal: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(position = position)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(attached)) __obj.updateDynamic("attached")(attached)
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RailProps
}

