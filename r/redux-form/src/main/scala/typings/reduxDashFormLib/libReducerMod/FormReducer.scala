package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormReducer
  extends reduxLib.reduxMod.Reducer[FormStateMap, reduxLib.reduxMod.AnyAction] {
  def plugin(reducers: FormReducerMapObject): reduxLib.reduxMod.Reducer[FormStateMap, reduxLib.reduxMod.AnyAction] = js.native
}

