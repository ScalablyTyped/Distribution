package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSelectorsMod {
  import typings.reduxDashForm.libReduxFormMod.GetFormState
  import typings.reduxDashForm.reduxDashFormMod.FormErrors

  type BooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, Boolean]
  ]
  type DataSelector[FormData, State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormData]
  ]
  type ErrorSelector[FormData, State, ErrorType] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, FormErrors[FormData, ErrorType]]
  ]
  type FormOrFieldsBooleanSelector[State] = js.Function2[
    /* formName */ String, 
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function2[/* state */ State, /* repeated */ String, Boolean]
  ]
  type NamesSelector[State] = js.Function1[
    /* getFormState */ js.UndefOr[GetFormState], 
    js.Function1[/* state */ State, js.Array[String]]
  ]
}
