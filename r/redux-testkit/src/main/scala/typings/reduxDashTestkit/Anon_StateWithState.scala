package typings.reduxDashTestkit

import typings.reduxDashTestkit.reduxDashTestkitMod.ThunkTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StateWithState extends js.Object {
  def withState(state: js.Any): ThunkTestkit
}

object Anon_StateWithState {
  @scala.inline
  def apply(withState: js.Any => ThunkTestkit): Anon_StateWithState = {
    val __obj = js.Dynamic.literal(withState = js.Any.fromFunction1(withState))
  
    __obj.asInstanceOf[Anon_StateWithState]
  }
}

