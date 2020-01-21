package typings.reduxTestkit.mod

import typings.redux.mod.Action
import typings.reduxTestkit.AnonExpected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerTestkit extends js.Object {
  def execute(action: Action[_]): js.Any
  def expect(action: Action[_]): AnonExpected
}

object ReducerTestkit {
  @scala.inline
  def apply(execute: Action[_] => js.Any, expect: Action[_] => AnonExpected): ReducerTestkit = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
  
    __obj.asInstanceOf[ReducerTestkit]
  }
}

