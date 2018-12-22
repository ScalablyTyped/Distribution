package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitHandler[FormData, P, ErrorType] extends js.Object {
  def apply(event: reactLib.reactMod.ReactNs.SyntheticEvent[_, reactLib.Event]): scala.Unit = js.native
  def apply(submit: FormSubmitHandler[FormData, P, ErrorType]): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType]
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean,
    asyncValidate: js.Any
  ): js.Any = js.native
  def apply(
    submit: FormSubmitHandler[FormData, P, ErrorType],
    props: InjectedFormProps[FormData, P, ErrorType],
    valid: scala.Boolean,
    asyncValidate: js.Any,
    fields: js.Array[java.lang.String]
  ): js.Any = js.native
}

