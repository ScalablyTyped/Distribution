package typings.reactDashBootstrapDashTable

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BtnGroup extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: ReactElement
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: ReactElement
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: ReactElement
  /**
  		 * Search panel component.
  		 */
  var searchPanel: ReactElement
}

object Anon_BtnGroup {
  @scala.inline
  def apply(
    btnGroup: ReactElement,
    clearBtn: ReactElement,
    searchField: ReactElement,
    searchPanel: ReactElement
  ): Anon_BtnGroup = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup, clearBtn = clearBtn, searchField = searchField, searchPanel = searchPanel)
  
    __obj.asInstanceOf[Anon_BtnGroup]
  }
}

