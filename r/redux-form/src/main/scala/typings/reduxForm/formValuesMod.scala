package typings.reduxForm

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object formValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxForm.reduxFormStrings.formValues with js.Any], 
    ComponentClass[P with typings.reduxForm.reduxFormStrings.formValues with js.Any, ComponentState]
  ] = js.native
  def formValues[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
}

