package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.FieldsSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'fields'> */
@js.native
trait PickImplfields extends js.Object {
  var fields: FieldsSettings = js.native
}

object PickImplfields {
  @scala.inline
  def apply(fields: FieldsSettings): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  @scala.inline
  implicit class PickImplfieldsOps[Self <: PickImplfields] (val x: Self) extends AnyVal {
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
    def setFields(value: FieldsSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

