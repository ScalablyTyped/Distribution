package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReduxFormMod {
  type FormDecorator[FormData, P, Config, ErrorType] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P with (InjectedFormProps[FormData, P, ErrorType])], 
    DecoratedComponentClass[FormData, P with Config, ErrorType]
  ]
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ reduxLib.reduxMod.Dispatch[js.Any], 
    /* props */ P, 
    scala.Unit | (reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]) | stdLib.Promise[js.Any]
  ]
  type GetFormState = js.Function1[/* state */ js.Any, reduxDashFormLib.libReducerMod.FormStateMap]
}
