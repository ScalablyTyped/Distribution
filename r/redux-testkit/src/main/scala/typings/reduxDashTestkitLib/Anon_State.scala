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
  def apply(withState: js.Function1[js.Any, reduxDashTestkitLib.reduxDashTestkitMod.ReducerTestkit]): Anon_State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withState")(withState)
    __obj.asInstanceOf[Anon_State]
  }
}

