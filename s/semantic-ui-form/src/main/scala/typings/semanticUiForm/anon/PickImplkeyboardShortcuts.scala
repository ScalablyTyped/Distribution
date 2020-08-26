package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'keyboardShortcuts'> */
@js.native
trait PickImplkeyboardShortcuts extends js.Object {
  var keyboardShortcuts: Boolean = js.native
}

object PickImplkeyboardShortcuts {
  @scala.inline
  def apply(keyboardShortcuts: Boolean): PickImplkeyboardShortcuts = {
    val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeyboardShortcuts]
  }
  @scala.inline
  implicit class PickImplkeyboardShortcutsOps[Self <: PickImplkeyboardShortcuts] (val x: Self) extends AnyVal {
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
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
  }
  
}

