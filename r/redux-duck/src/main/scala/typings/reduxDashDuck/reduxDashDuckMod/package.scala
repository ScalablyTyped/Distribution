package typings.reduxDashDuck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashDuckMod {
  import typings.redux.reduxMod.Action
  import typings.reduxDashDuck.Anon_Payload

  type ActionCreator[A /* <: FSAHack */] = js.Function0[A] | (js.Function1[
    /* import warning: ImportType.apply Failed type conversion: A['payload'] */ /* a */ js.Any, 
    A
  ])
  type ActionHandlers[S, A /* <: Action[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in A['type'] ]:? (x : S, y : std.Extract<A, {  type  :T}>): S}
    */ typings.reduxDashDuck.reduxDashDuckStrings.ActionHandlers with js.Any
  type ActionName = String
  type ActionType = String
  type AppName = String
  type DuckName = String
  type FSAHack = Action[String] with Anon_Payload
}
