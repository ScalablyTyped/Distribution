package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.activate
import typings.semanticUiDropdown.semanticUiDropdownStrings.combo
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typings.semanticUiDropdown.semanticUiDropdownStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'action'> */
@js.native
trait PickImplaction extends js.Object {
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
}

object PickImplaction {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ): PickImplaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaction]
  }
  @scala.inline
  implicit class PickImplactionOps[Self <: PickImplaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

