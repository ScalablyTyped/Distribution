package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPanelProps extends js.Object {
  /**
  	 * Default clear search field button component.
  	 */
  var clearBtn: ReactElement
  /**
  	 * The default search text.
  	 */
  var defaultValue: String
  /**
  	 * The placeholder text for the search field.
  	 */
  var placeholder: String
  /**
  	 * Default search field component.
  	 */
  var searchField: ReactElement
  /**
  	 * A callback to trigger the clear search field event.
  	 */
  def clearBtnClick(): Unit
  /**
  	 * A callback to trigger a search, takes the search text as an input.
  	 */
  def search(searchText: String): Unit
}

object SearchPanelProps {
  @scala.inline
  def apply(
    clearBtn: ReactElement,
    clearBtnClick: () => Unit,
    defaultValue: String,
    placeholder: String,
    search: String => Unit,
    searchField: ReactElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn.asInstanceOf[js.Any], clearBtnClick = js.Any.fromFunction0(clearBtnClick), defaultValue = defaultValue.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchField = searchField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchPanelProps]
  }
}

