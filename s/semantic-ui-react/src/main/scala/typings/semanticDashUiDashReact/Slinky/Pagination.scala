package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsAddonsPaginationMod.default
import typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationItemMod.PaginationItemProps
import typings.semanticDashUiDashReact.distCommonjsAddonsPaginationPaginationMod.PaginationProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: disabled, aria-label */
object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsAddonsPaginationMod.default].asInstanceOf[String | js.Object]
  def apply(
    totalPages: Double | String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    activePage: Double | String = null,
    boundaryRange: Double | String = null,
    defaultActivePage: Double | String = null,
    ellipsisItem: SemanticShorthandItem[PaginationItemProps] = null,
    firstItem: SemanticShorthandItem[PaginationItemProps] = null,
    lastItem: SemanticShorthandItem[PaginationItemProps] = null,
    nextItem: SemanticShorthandItem[PaginationItemProps] = null,
    onPageChange: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationProps) => Unit = null,
    pageItem: SemanticShorthandItem[PaginationItemProps] = null,
    prevItem: SemanticShorthandItem[PaginationItemProps] = null,
    siblingRange: Double | String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (boundaryRange != null) __obj.updateDynamic("boundaryRange")(boundaryRange.asInstanceOf[js.Any])
    if (defaultActivePage != null) __obj.updateDynamic("defaultActivePage")(defaultActivePage.asInstanceOf[js.Any])
    if (ellipsisItem != null) __obj.updateDynamic("ellipsisItem")(ellipsisItem.asInstanceOf[js.Any])
    if (firstItem != null) __obj.updateDynamic("firstItem")(firstItem.asInstanceOf[js.Any])
    if (lastItem != null) __obj.updateDynamic("lastItem")(lastItem.asInstanceOf[js.Any])
    if (nextItem != null) __obj.updateDynamic("nextItem")(nextItem.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (pageItem != null) __obj.updateDynamic("pageItem")(pageItem.asInstanceOf[js.Any])
    if (prevItem != null) __obj.updateDynamic("prevItem")(prevItem.asInstanceOf[js.Any])
    if (siblingRange != null) __obj.updateDynamic("siblingRange")(siblingRange.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

