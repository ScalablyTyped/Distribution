package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod.HeaderProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled */
object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsElementsHeaderMod.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    block: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    content: ReactNode = null,
    dividing: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    icon: js.Any = null,
    image: js.Any = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    size: tiny | small | medium | large | huge = null,
    sub: js.UndefOr[Boolean] = js.undefined,
    subheader: js.Any = null,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sub)) __obj.updateDynamic("sub")(sub)
    if (subheader != null) __obj.updateDynamic("subheader")(subheader)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderProps
}

