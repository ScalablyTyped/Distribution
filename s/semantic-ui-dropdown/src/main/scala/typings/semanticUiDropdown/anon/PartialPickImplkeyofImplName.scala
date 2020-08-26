package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplName extends js.Object {
  var name: js.UndefOr[String] = js.native
  var remoteValues: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
  var values: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplName {
  @scala.inline
  def apply(): PartialPickImplkeyofImplName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplName]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplNameOps[Self <: PartialPickImplkeyofImplName] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRemoteValues(value: String): Self = this.set("remoteValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteValues: Self = this.set("remoteValues", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

