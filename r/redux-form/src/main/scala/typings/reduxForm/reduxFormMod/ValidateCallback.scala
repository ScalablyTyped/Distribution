package typings.reduxForm.reduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateCallback[FormData, P, ErrorType] extends js.Object {
  var fieldValidatorKeys: js.Array[String]
  var initialRender: Boolean
  var lastFieldValidatorKeys: js.Array[String]
  var nextProps: P with (InjectedFormProps[FormData, P, ErrorType])
  var props: P with (InjectedFormProps[FormData, P, ErrorType])
  var structure: js.Any
  var values: FormData
}

object ValidateCallback {
  @scala.inline
  def apply[FormData, P, ErrorType](
    fieldValidatorKeys: js.Array[String],
    initialRender: Boolean,
    lastFieldValidatorKeys: js.Array[String],
    nextProps: P with (InjectedFormProps[FormData, P, ErrorType]),
    props: P with (InjectedFormProps[FormData, P, ErrorType]),
    structure: js.Any,
    values: FormData
  ): ValidateCallback[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(fieldValidatorKeys = fieldValidatorKeys.asInstanceOf[js.Any], initialRender = initialRender.asInstanceOf[js.Any], lastFieldValidatorKeys = lastFieldValidatorKeys.asInstanceOf[js.Any], nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
  }
}

