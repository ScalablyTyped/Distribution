package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.default
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.ellipsisItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.firstItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.lastItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.nextItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.pageItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.prevItem
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: disabled */
object PaginationItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit = null,
    onKeyDown: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit = null,
    `type`: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2(onKeyDown))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationItemProps
}

