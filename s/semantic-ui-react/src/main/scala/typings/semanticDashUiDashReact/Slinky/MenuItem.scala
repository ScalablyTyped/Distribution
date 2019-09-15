package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.default
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.horizontally
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertically
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, name, className, disabled */
object MenuItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsCollectionsMenuMenuItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    fitted: Boolean | horizontally | vertically = null,
    header: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | SemanticShorthandItem[IconProps] = null,
    index: Int | Double = null,
    link: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit = null,
    position: left | right = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (color != null) __obj.updateDynamic("color")(color)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fitted != null) __obj.updateDynamic("fitted")(fitted.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuItemProps
}

