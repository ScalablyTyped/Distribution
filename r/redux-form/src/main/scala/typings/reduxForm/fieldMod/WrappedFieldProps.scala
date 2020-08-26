package typings.reduxForm.fieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedFieldProps extends js.Object {
  var input: WrappedFieldInputProps = js.native
  var meta: WrappedFieldMetaProps = js.native
}

object WrappedFieldProps {
  @scala.inline
  def apply(input: WrappedFieldInputProps, meta: WrappedFieldMetaProps): WrappedFieldProps = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldProps]
  }
  @scala.inline
  implicit class WrappedFieldPropsOps[Self <: WrappedFieldProps] (val x: Self) extends AnyVal {
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
    def setInput(value: WrappedFieldInputProps): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: WrappedFieldMetaProps): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

