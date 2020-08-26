package typings.semanticUiApi.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplOptional extends js.Object {
  var optional: js.UndefOr[RegExp] = js.native
  var required: js.UndefOr[RegExp] = js.native
}

object PartialPickImplkeyofImplOptional {
  @scala.inline
  def apply(): PartialPickImplkeyofImplOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplOptional]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOptionalOps[Self <: PartialPickImplkeyofImplOptional] (val x: Self) extends AnyVal {
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
    def setOptional(value: RegExp): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setRequired(value: RegExp): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

