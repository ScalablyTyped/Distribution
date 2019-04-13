package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BtnGroup extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: reactLib.reactMod.ReactElement[_]
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: reactLib.reactMod.ReactElement[_]
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: reactLib.reactMod.ReactElement[_]
  /**
  		 * Search panel component.
  		 */
  var searchPanel: reactLib.reactMod.ReactElement[_]
}

object Anon_BtnGroup {
  @scala.inline
  def apply(
    btnGroup: reactLib.reactMod.ReactElement[_],
    clearBtn: reactLib.reactMod.ReactElement[_],
    searchField: reactLib.reactMod.ReactElement[_],
    searchPanel: reactLib.reactMod.ReactElement[_]
  ): Anon_BtnGroup = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup, clearBtn = clearBtn, searchField = searchField, searchPanel = searchPanel)
  
    __obj.asInstanceOf[Anon_BtnGroup]
  }
}

