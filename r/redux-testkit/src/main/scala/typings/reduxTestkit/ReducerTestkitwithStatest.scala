package typings.reduxTestkit

import typings.redux.mod.Action
import typings.reduxTestkit.mod.ReducerTestkit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
trait ReducerTestkitwithStatest extends js.Object {
  def execute(action: Action[_]): js.Any
  def expect(action: Action[_]): AnonToChangeInState
  def withState(state: js.Any): ReducerTestkit
}

object ReducerTestkitwithStatest {
  @scala.inline
  def apply(
    execute: Action[_] => js.Any,
    expect: Action[_] => AnonToChangeInState,
    withState: js.Any => ReducerTestkit
  ): ReducerTestkitwithStatest = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
    __obj.asInstanceOf[ReducerTestkitwithStatest]
  }
}

