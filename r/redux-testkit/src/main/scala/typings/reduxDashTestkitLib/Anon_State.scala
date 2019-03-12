package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  def withState(state: js.Any): reduxDashTestkitLib.reduxDashTestkitMod.ReducerTestkit
}

object Anon_State {
  @scala.inline
  def apply(withState: js.Any => reduxDashTestkitLib.reduxDashTestkitMod.ReducerTestkit): Anon_State = {
    val __obj = js.Dynamic.literal(withState = js.Any.fromFunction1(withState))
  
    __obj.asInstanceOf[Anon_State]
  }
}

