package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFilterParameters[Params /* <: js.Object */] extends js.Object {
  
  def callback(cell: js.Any, params: Params): Boolean = js.native
  
  var callbackParameters: Params = js.native
}
object CustomFilterParameters {
  
  @scala.inline
  def apply[Params /* <: js.Object */](callback: (js.Any, Params) => Boolean, callbackParameters: Params): CustomFilterParameters[Params] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), callbackParameters = callbackParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterParameters[Params]]
  }
  
  @scala.inline
  implicit class CustomFilterParametersOps[Self <: CustomFilterParameters[_], Params /* <: js.Object */] (val x: Self with CustomFilterParameters[Params]) extends AnyVal {
    
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
    def setCallback(value: (js.Any, Params) => Boolean): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackParameters(value: Params): Self = this.set("callbackParameters", value.asInstanceOf[js.Any])
  }
}
