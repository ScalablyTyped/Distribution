package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxFormMod {
  type FormDecorator[FormData, P, Config, ErrorType] = js.Function1[
    /* component */ typings.react.mod.ComponentType[
      P with (typings.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])
    ], 
    typings.reduxForm.reduxFormMod.DecoratedComponentClass[FormData, P with Config, ErrorType]
  ]
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ typings.redux.mod.Dispatch[js.Any], 
    /* props */ P, 
    scala.Unit | (typings.reduxForm.mod.FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  type GetFormState = js.Function1[/* state */ js.Any, typings.reduxForm.reducerMod.FormStateMap]
}
