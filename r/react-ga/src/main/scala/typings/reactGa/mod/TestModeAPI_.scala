package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModeAPI_ extends js.Object {
  var calls: js.Array[js.Array[_]]
  var resetCalls: js.Function
  def ga(args: js.Any*): js.Any
}

object TestModeAPI_ {
  @scala.inline
  def apply(calls: js.Array[js.Array[_]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI_ = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], ga = js.Any.fromFunction1(ga), resetCalls = resetCalls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestModeAPI_]
  }
}

