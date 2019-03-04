package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateCallback[FormData, P, ErrorType] extends js.Object {
  var initialRender: scala.Boolean
  var nextProps: P with (InjectedFormProps[FormData, P, ErrorType])
  var props: P with (InjectedFormProps[FormData, P, ErrorType])
  var structure: js.Any
  var values: FormData
}

object ValidateCallback {
  @scala.inline
  def apply[FormData, P, ErrorType](
    initialRender: scala.Boolean,
    nextProps: P with (InjectedFormProps[FormData, P, ErrorType]),
    props: P with (InjectedFormProps[FormData, P, ErrorType]),
    structure: js.Any,
    values: FormData
  ): ValidateCallback[FormData, P, ErrorType] = {
    val __obj = js.Dynamic.literal(initialRender = initialRender, nextProps = nextProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], structure = structure, values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidateCallback[FormData, P, ErrorType]]
  }
}

