package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BtnGroup extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: reactLib.reactMod.ReactElement
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: reactLib.reactMod.ReactElement
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: reactLib.reactMod.ReactElement
  /**
  		 * Search panel component.
  		 */
  var searchPanel: reactLib.reactMod.ReactElement
}

object Anon_BtnGroup {
  @scala.inline
  def apply(
    btnGroup: reactLib.reactMod.ReactElement,
    clearBtn: reactLib.reactMod.ReactElement,
    searchField: reactLib.reactMod.ReactElement,
    searchPanel: reactLib.reactMod.ReactElement
  ): Anon_BtnGroup = {
    val __obj = js.Dynamic.literal(btnGroup = btnGroup, clearBtn = clearBtn, searchField = searchField, searchPanel = searchPanel)
  
    __obj.asInstanceOf[Anon_BtnGroup]
  }
}

