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

