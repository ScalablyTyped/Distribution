package typings.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.labeled
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps
  extends StrictMenuProps
     with /* key */ StringDictionary[js.Any]

object MenuProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activeIndex: Double | String = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    defaultActiveIndex: Double | String = null,
    fixed: left | right | bottom | top = null,
    floated: Boolean | right = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | labeled = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[MenuItemProps] = null,
    onItemClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    pointing: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | huge | massive = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    tabular: Boolean | right = null,
    text: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: SemanticWIDTHS = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(pointing)) __obj.updateDynamic("pointing")(pointing)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (tabular != null) __obj.updateDynamic("tabular")(tabular.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[MenuProps]
  }
}

