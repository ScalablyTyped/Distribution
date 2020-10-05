package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.anon.Array
import typings.rcFieldForm.anon.Format
import typings.rcFieldForm.anon.Len
import typings.rcFieldForm.anon.Mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateMessages extends js.Object {
  var array: js.UndefOr[Len] = js.native
  var date: js.UndefOr[Format] = js.native
  var default: js.UndefOr[ValidateMessage] = js.native
  var enum: js.UndefOr[ValidateMessage] = js.native
  var number: js.UndefOr[Len] = js.native
  var pattern: js.UndefOr[Mismatch] = js.native
  var required: js.UndefOr[ValidateMessage] = js.native
  var string: js.UndefOr[Len] = js.native
  var types: js.UndefOr[Array] = js.native
  var whitespace: js.UndefOr[ValidateMessage] = js.native
}

object ValidateMessages {
  @scala.inline
  def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  @scala.inline
  implicit class ValidateMessagesOps[Self <: ValidateMessages] (val x: Self) extends AnyVal {
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
    def setArray(value: Len): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setDate(value: Format): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDefaultFunction0(value: () => String): Self = this.set("default", js.Any.fromFunction0(value))
    @scala.inline
    def setDefault(value: ValidateMessage): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setEnumFunction0(value: () => String): Self = this.set("enum", js.Any.fromFunction0(value))
    @scala.inline
    def setEnum(value: ValidateMessage): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setNumber(value: Len): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setPattern(value: Mismatch): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setRequiredFunction0(value: () => String): Self = this.set("required", js.Any.fromFunction0(value))
    @scala.inline
    def setRequired(value: ValidateMessage): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setString(value: Len): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setTypes(value: Array): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def setWhitespaceFunction0(value: () => String): Self = this.set("whitespace", js.Any.fromFunction0(value))
    @scala.inline
    def setWhitespace(value: ValidateMessage): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
  
}

