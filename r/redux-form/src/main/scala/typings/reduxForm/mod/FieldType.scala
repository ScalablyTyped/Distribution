package typings.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxForm.reduxFormStrings.Field
  - typings.reduxForm.reduxFormStrings.FieldArray
*/
trait FieldType extends js.Object

object FieldType {
  @scala.inline
  def Field: typings.reduxForm.reduxFormStrings.Field = this.cast("Field")
  @scala.inline
  def FieldArray: typings.reduxForm.reduxFormStrings.FieldArray = this.cast("FieldArray")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

