package typings.reduxTestkit

import typings.reduxTestkit.mod.ReducerTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  def withState(state: js.Any): ReducerTestkit
}

object AnonState {
  @scala.inline
  def apply(withState: js.Any => ReducerTestkit): AnonState = {
    val __obj = js.Dynamic.literal(withState = js.Any.fromFunction1(withState))
  
    __obj.asInstanceOf[AnonState]
  }
}

