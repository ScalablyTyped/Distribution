package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PageList extends js.Object {
  /**
  		 * The default list of page change buttons.
  		 */
  var pageList: stdLib.HTMLUListElement
  /**
  		 * Default sizePerPageDropdown component.
  		 */
  var sizePerPageDropDown: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.SizePerPageDropDown
  /**
  		 * Text/element to display when displaying the total number of rows.
  		 */
  var totalText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
}

object Anon_PageList {
  @scala.inline
  def apply(
    pageList: stdLib.HTMLUListElement,
    sizePerPageDropDown: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.SizePerPageDropDown,
    totalText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
  ): Anon_PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList, sizePerPageDropDown = sizePerPageDropDown, totalText = totalText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PageList]
  }
}

