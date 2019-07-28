package typings.reduxDashTestkit

import typings.reduxDashTestkit.reduxDashTestkitMod.ReducerTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  def withState(state: js.Any): ReducerTestkit
}

object Anon_State {
  @scala.inline
  def apply(withState: js.Any => ReducerTestkit): Anon_State = {
    val __obj = js.Dynamic.literal(withState = js.Any.fromFunction1(withState))
  
    __obj.asInstanceOf[Anon_State]
  }
}

