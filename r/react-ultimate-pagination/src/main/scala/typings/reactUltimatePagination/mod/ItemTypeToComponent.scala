package typings.reactUltimatePagination.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemTypeToComponent extends js.Object {
  /**
    * An item that represents groups of pages that currently are not visible in paginator (can be used to navigate to the page in the group that is the nearest to the current page)
    */
  var ELLIPSIS: ComponentType[PaginationComponentProps]
  /**
    * A link to the first page
    */
  var FIRST_PAGE_LINK: ComponentType[PaginationComponentProps]
  /**
    * A link to the last page
    */
  var LAST_PAGE_LINK: ComponentType[PaginationComponentProps]
  /**
    * A link to the next page
    */
  var NEXT_PAGE_LINK: ComponentType[PaginationComponentProps]
  /**
    * A link to a page
    */
  var PAGE: ComponentType[PaginationComponentProps]
  /**
    * A link to the previous page
    */
  var PREVIOUS_PAGE_LINK: ComponentType[PaginationComponentProps]
}

object ItemTypeToComponent {
  @scala.inline
  def apply(
    ELLIPSIS: ComponentType[PaginationComponentProps],
    FIRST_PAGE_LINK: ComponentType[PaginationComponentProps],
    LAST_PAGE_LINK: ComponentType[PaginationComponentProps],
    NEXT_PAGE_LINK: ComponentType[PaginationComponentProps],
    PAGE: ComponentType[PaginationComponentProps],
    PREVIOUS_PAGE_LINK: ComponentType[PaginationComponentProps]
  ): ItemTypeToComponent = {
    val __obj = js.Dynamic.literal(ELLIPSIS = ELLIPSIS.asInstanceOf[js.Any], FIRST_PAGE_LINK = FIRST_PAGE_LINK.asInstanceOf[js.Any], LAST_PAGE_LINK = LAST_PAGE_LINK.asInstanceOf[js.Any], NEXT_PAGE_LINK = NEXT_PAGE_LINK.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], PREVIOUS_PAGE_LINK = PREVIOUS_PAGE_LINK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemTypeToComponent]
  }
}

