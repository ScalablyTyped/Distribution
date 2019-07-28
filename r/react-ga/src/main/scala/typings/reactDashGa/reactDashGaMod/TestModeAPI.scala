package typings.reactDashGa.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModeAPI extends js.Object {
  var calls: js.Array[js.Array[_]]
  var resetCalls: js.Function
  def ga(args: js.Any*): js.Any
}

object TestModeAPI {
  @scala.inline
  def apply(calls: js.Array[js.Array[_]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI = {
    val __obj = js.Dynamic.literal(calls = calls, ga = js.Any.fromFunction1(ga), resetCalls = resetCalls)
  
    __obj.asInstanceOf[TestModeAPI]
  }
}

