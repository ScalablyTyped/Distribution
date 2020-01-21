package typings.reduxTestkit

import typings.reduxTestkit.mod.ThunkTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStateWithState extends js.Object {
  def withState(state: js.Any): ThunkTestkit
}

object AnonStateWithState {
  @scala.inline
  def apply(withState: js.Any => ThunkTestkit): AnonStateWithState = {
    val __obj = js.Dynamic.literal(withState = js.Any.fromFunction1(withState))
  
    __obj.asInstanceOf[AnonStateWithState]
  }
}

