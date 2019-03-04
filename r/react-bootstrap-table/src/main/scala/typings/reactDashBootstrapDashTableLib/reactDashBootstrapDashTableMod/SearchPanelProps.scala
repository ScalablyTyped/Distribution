package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPanelProps extends js.Object {
  /**
  	 * Default clear search field button component.
  	 */
  var clearBtn: reactLib.reactMod.ReactNs.ReactElement[_]
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
  var searchField: reactLib.reactMod.ReactNs.ReactElement[_]
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
    clearBtn: reactLib.reactMod.ReactNs.ReactElement[_],
    clearBtnClick: js.Function0[scala.Unit],
    defaultValue: java.lang.String,
    placeholder: java.lang.String,
    search: js.Function1[java.lang.String, scala.Unit],
    searchField: reactLib.reactMod.ReactNs.ReactElement[_]
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn, clearBtnClick = clearBtnClick, defaultValue = defaultValue, placeholder = placeholder, search = search, searchField = searchField)
  
    __obj.asInstanceOf[SearchPanelProps]
  }
}

