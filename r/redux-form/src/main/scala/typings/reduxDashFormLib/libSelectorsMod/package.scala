package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSelectorsMod {
  type BooleanSelector[State] = js.Function2[
    /* formName */ java.lang.String, 
    /* getFormState */ js.UndefOr[reduxDashFormLib.libReduxFormMod.GetFormState], 
    js.Function1[/* state */ State, scala.Boolean]
  ]
  type DataSelector[FormData, State] = js.Function2[
    /* formName */ java.lang.String, 
    /* getFormState */ js.UndefOr[reduxDashFormLib.libReduxFormMod.GetFormState], 
    js.Function1[/* state */ State, FormData]
  ]
  type ErrorSelector[FormData, State, ErrorType] = js.Function2[
    /* formName */ java.lang.String, 
    /* getFormState */ js.UndefOr[reduxDashFormLib.libReduxFormMod.GetFormState], 
    js.Function1[
      /* state */ State, 
      reduxDashFormLib.reduxDashFormMod.FormErrors[FormData, ErrorType]
    ]
  ]
  type FormOrFieldsBooleanSelector[State] = js.Function2[
    /* formName */ java.lang.String, 
    /* getFormState */ js.UndefOr[reduxDashFormLib.libReduxFormMod.GetFormState], 
    js.Function2[/* state */ State, /* repeated */ java.lang.String, scala.Boolean]
  ]
  type NamesSelector[State] = js.Function1[
    /* getFormState */ js.UndefOr[reduxDashFormLib.libReduxFormMod.GetFormState], 
    js.Function1[/* state */ State, js.Array[java.lang.String]]
  ]
}
