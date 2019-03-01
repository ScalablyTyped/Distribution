package typings
package reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemTypeToComponent extends js.Object {
  /**
    * An item that represents groups of pages that currently are not visible in paginator (can be used to navigate to the page in the group that is the nearest to the current page)
    */
  var ELLIPSIS: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  /**
    * A link to the first page
    */
  var FIRST_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  /**
    * A link to the last page
    */
  var LAST_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  /**
    * A link to the next page
    */
  var NEXT_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  /**
    * A link to a page
    */
  var PAGE: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  /**
    * A link to the previous page
    */
  var PREVIOUS_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
}

object ItemTypeToComponent {
  @scala.inline
  def apply(
    ELLIPSIS: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps],
    FIRST_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps],
    LAST_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps],
    NEXT_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps],
    PAGE: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps],
    PREVIOUS_PAGE_LINK: reactLib.reactMod.ReactNs.ComponentType[PaginationComponentProps]
  ): ItemTypeToComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ELLIPSIS")(ELLIPSIS.asInstanceOf[js.Any])
    __obj.updateDynamic("FIRST_PAGE_LINK")(FIRST_PAGE_LINK.asInstanceOf[js.Any])
    __obj.updateDynamic("LAST_PAGE_LINK")(LAST_PAGE_LINK.asInstanceOf[js.Any])
    __obj.updateDynamic("NEXT_PAGE_LINK")(NEXT_PAGE_LINK.asInstanceOf[js.Any])
    __obj.updateDynamic("PAGE")(PAGE.asInstanceOf[js.Any])
    __obj.updateDynamic("PREVIOUS_PAGE_LINK")(PREVIOUS_PAGE_LINK.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTypeToComponent]
  }
}

