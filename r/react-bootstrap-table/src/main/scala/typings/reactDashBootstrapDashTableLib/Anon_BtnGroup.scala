package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BtnGroup extends js.Object {
  /**
  		 * Button group components.
  		 */
  var btnGroup: reactLib.reactMod.ReactNs.ReactElement[_]
   // search field JSX
  /**
  		 * The button to clear the search field.
  		 */
  var clearBtn: reactLib.reactMod.ReactNs.ReactElement[_]
   // button groups JSX
  /**
  		 * The individual search field.
  		 */
  var searchField: reactLib.reactMod.ReactNs.ReactElement[_]
  /**
  		 * Search panel component.
  		 */
  var searchPanel: reactLib.reactMod.ReactNs.ReactElement[_]
}

object Anon_BtnGroup {
  @scala.inline
  def apply(
    btnGroup: reactLib.reactMod.ReactNs.ReactElement[_],
    clearBtn: reactLib.reactMod.ReactNs.ReactElement[_],
    searchField: reactLib.reactMod.ReactNs.ReactElement[_],
    searchPanel: reactLib.reactMod.ReactNs.ReactElement[_]
  ): Anon_BtnGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btnGroup")(btnGroup)
    __obj.updateDynamic("clearBtn")(clearBtn)
    __obj.updateDynamic("searchField")(searchField)
    __obj.updateDynamic("searchPanel")(searchPanel)
    __obj.asInstanceOf[Anon_BtnGroup]
  }
}

