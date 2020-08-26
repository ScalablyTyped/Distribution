package typings.semanticUiCheckbox.anon

import typings.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl, 'uncheckable'> */
@js.native
trait PickImpluncheckable extends js.Object {
  var uncheckable: auto | Boolean = js.native
}

object PickImpluncheckable {
  @scala.inline
  def apply(uncheckable: auto | Boolean): PickImpluncheckable = {
    val __obj = js.Dynamic.literal(uncheckable = uncheckable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluncheckable]
  }
  @scala.inline
  implicit class PickImpluncheckableOps[Self <: PickImpluncheckable] (val x: Self) extends AnyVal {
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
    def setUncheckable(value: auto | Boolean): Self = this.set("uncheckable", value.asInstanceOf[js.Any])
  }
  
}

