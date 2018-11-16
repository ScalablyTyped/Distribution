package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object libFormValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any], 
    reactLib.reactMod.ReactNs.ComponentClass[
      P with reduxDashFormLib.reduxDashFormLibStrings.formValues with js.Any, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: java.lang.String */, P](names: K*): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P with (stdLib.Pick[FormData, K])], 
    reactLib.reactMod.ReactNs.ComponentClass[P with (stdLib.Pick[FormData, K]), reactLib.reactMod.ReactNs.ComponentState]
  ] = js.native
}

