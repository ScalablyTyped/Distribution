package typings.reduxDashForm

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object libFormValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any], 
    ComponentClass[
      P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any, 
      ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
}

