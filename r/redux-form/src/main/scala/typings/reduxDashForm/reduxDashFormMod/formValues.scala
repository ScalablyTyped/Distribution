package typings.reduxDashForm.reduxDashFormMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "formValues")
@js.native
object formValues extends js.Object {
  def apply[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any], 
    ComponentClass[
      P with typings.reduxDashForm.reduxDashFormStrings.formValues with js.Any, 
      ComponentState
    ]
  ] = js.native
  def apply[FormData, K /* <: String */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
}

