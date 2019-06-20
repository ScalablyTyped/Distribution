package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPanelProps extends js.Object {
  /**
  	 * Default clear search field button component.
  	 */
  var clearBtn: reactLib.reactMod.ReactElement
  /**
  	 * The default search text.
  	 */
  var defaultValue: java.lang.String
  /**
  	 * The placeholder text for the search field.
  	 */
  var placeholder: java.lang.String
  /**
  	 * Default search field component.
  	 */
  var searchField: reactLib.reactMod.ReactElement
  /**
  	 * A callback to trigger the clear search field event.
  	 */
  def clearBtnClick(): scala.Unit
  /**
  	 * A callback to trigger a search, takes the search text as an input.
  	 */
  def search(searchText: java.lang.String): scala.Unit
}

object SearchPanelProps {
  @scala.inline
  def apply(
    clearBtn: reactLib.reactMod.ReactElement,
    clearBtnClick: () => scala.Unit,
    defaultValue: java.lang.String,
    placeholder: java.lang.String,
    search: java.lang.String => scala.Unit,
    searchField: reactLib.reactMod.ReactElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn, clearBtnClick = js.Any.fromFunction0(clearBtnClick), defaultValue = defaultValue, placeholder = placeholder, search = js.Any.fromFunction1(search), searchField = searchField)
  
    __obj.asInstanceOf[SearchPanelProps]
  }
}

