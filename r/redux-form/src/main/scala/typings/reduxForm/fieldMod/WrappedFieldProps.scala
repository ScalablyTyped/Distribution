package typings.reduxForm.fieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldProps extends js.Object {
  var input: WrappedFieldInputProps
  var meta: WrappedFieldMetaProps
}

object WrappedFieldProps {
  @scala.inline
  def apply(input: WrappedFieldInputProps, meta: WrappedFieldMetaProps): WrappedFieldProps = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldProps]
  }
}

