package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestModeAPI_ extends js.Object {
  
  var calls: js.Array[js.Array[_]] = js.native
  
  def ga(args: js.Any*): js.Any = js.native
  
  var resetCalls: js.Function = js.native
}
object TestModeAPI_ {
  
  @scala.inline
  def apply(calls: js.Array[js.Array[_]], ga: /* repeated */ js.Any => js.Any, resetCalls: js.Function): TestModeAPI_ = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], ga = js.Any.fromFunction1(ga), resetCalls = resetCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestModeAPI_]
  }
  
  @scala.inline
  implicit class TestModeAPI_Ops[Self <: TestModeAPI_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallsVarargs(value: js.Array[js.Any]*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: js.Array[js.Array[_]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGa(value: /* repeated */ js.Any => js.Any): Self = this.set("ga", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCalls(value: js.Function): Self = this.set("resetCalls", value.asInstanceOf[js.Any])
  }
}
