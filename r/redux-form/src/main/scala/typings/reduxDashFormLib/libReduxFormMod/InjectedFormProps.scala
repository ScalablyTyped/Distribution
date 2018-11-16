package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedFormProps[FormData, P, ErrorType] extends js.Object {
  var anyTouched: scala.Boolean = js.native
  var array: InjectedArrayProps = js.native
  var asyncValidating: java.lang.String | scala.Boolean = js.native
  var dirty: scala.Boolean = js.native
  var error: ErrorType = js.native
  var form: java.lang.String = js.native
  @JSName("handleSubmit")
  var handleSubmit_Original: SubmitHandler[FormData, P, ErrorType] = js.native
  var initialValues: stdLib.Partial[FormData] = js.native
  var initialized: scala.Boolean = js.native
  var invalid: scala.Boolean = js.native
  var pristine: scala.Boolean = js.native
  var registeredFields: ScalablyTyped.runtime.StringDictionary[RegisteredField] = js.native
  var submitFailed: scala.Boolean = js.native
  var submitSucceeded: scala.Boolean = js.native
  var submitting: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  var warning: js.Any = js.native
  def asyncValidate(): scala.Unit = js.native
  def autofill(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def blur(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def change(field: java.lang.String, value: js.Any): scala.Unit = js.native
  def clearAsyncError(field: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def handleSubmit(event: reactLib.reactMod.ReactNs.SyntheticEvent[_]): scala.Unit = js.native
  def handleSubmit(submit: FormSubmitHandler[FormData, P, ErrorType]): js.Any = js.native
  def handleSubmit(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType]
  ): js.Any = js.native
  def handleSubmit(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean
  ): js.Any = js.native
  def handleSubmit(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean,
    asyncValidate: js.Any
  ): js.Any = js.native
  def handleSubmit(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean,
    asyncValidate: js.Any,
    fields: js.Array[java.lang.String]
  ): js.Any = js.native
  def initialize(data: stdLib.Partial[FormData]): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def touch(field: java.lang.String*): scala.Unit = js.native
  def untouch(field: java.lang.String*): scala.Unit = js.native
}

