package typings.reactDashBootstrapDashTable

import typings.react.reactMod.ReactElement
import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SizePerPageDropDown
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PageList extends js.Object {
  /**
  		 * The default list of page change buttons.
  		 */
  var pageList: HTMLUListElement
  /**
  		 * Default sizePerPageDropdown component.
  		 */
  var sizePerPageDropDown: SizePerPageDropDown
  /**
  		 * Text/element to display when displaying the total number of rows.
  		 */
  var totalText: String | ReactElement
}

object Anon_PageList {
  @scala.inline
  def apply(
    pageList: HTMLUListElement,
    sizePerPageDropDown: SizePerPageDropDown,
    totalText: String | ReactElement
  ): Anon_PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList, sizePerPageDropDown = sizePerPageDropDown, totalText = totalText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PageList]
  }
}

