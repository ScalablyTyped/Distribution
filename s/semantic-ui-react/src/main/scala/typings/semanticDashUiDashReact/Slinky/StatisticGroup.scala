package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticGroupMod.StatisticGroupProps
import typings.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticMod.StatisticProps
import typings.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticMod.StatisticSizeProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className */
object StatisticGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsViewsStatisticStatisticGroupMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StatisticProps] = null,
    size: StatisticSizeProp = null,
    widths: SemanticWIDTHS = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (size != null) __obj.updateDynamic("size")(size)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StatisticGroupProps
}

