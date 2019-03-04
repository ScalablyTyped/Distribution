package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StateWithState extends js.Object {
  def withState(state: js.Any): reduxDashTestkitLib.reduxDashTestkitMod.ThunkTestkit
}

object Anon_StateWithState {
  @scala.inline
  def apply(withState: js.Function1[js.Any, reduxDashTestkitLib.reduxDashTestkitMod.ThunkTestkit]): Anon_StateWithState = {
    val __obj = js.Dynamic.literal(withState = withState)
  
    __obj.asInstanceOf[Anon_StateWithState]
  }
}

