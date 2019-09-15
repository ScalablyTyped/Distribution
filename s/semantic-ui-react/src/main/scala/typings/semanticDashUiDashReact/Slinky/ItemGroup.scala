package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemMod.ItemProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className */
object ItemGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsViewsItemItemGroupMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[ItemProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    relaxed: Boolean | very = null,
    unstackable: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ItemGroupProps
}

