package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formMod {
  type FormProps[FormData, P, ErrorType] = (typings.reduxForm.mod.Omit[
    typings.react.mod.FormHTMLAttributes[typings.std.HTMLFormElement], 
    typings.reduxForm.reduxFormStrings.onSubmit
  ]) with (typings.reduxForm.formMod.FormSubmitProp[FormData, P, ErrorType])
}
