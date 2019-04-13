package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object libFormValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any], 
    reactLib.reactMod.ComponentClass[
      P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any, 
      reactLib.reactMod.ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: java.lang.String */, P](names: K*): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[P with (stdLib.Pick[FormData, K])], 
    reactLib.reactMod.ComponentClass[P with (stdLib.Pick[FormData, K]), reactLib.reactMod.ComponentState]
  ] = js.native
}

