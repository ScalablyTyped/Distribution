package typings.redux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareAPI[D /* <: Dispatch[AnyAction] */, S] extends js.Object {
  
  var dispatch: D = js.native
  
  def getState(): S = js.native
}
object MiddlewareAPI {
  
  @scala.inline
  def apply[D /* <: Dispatch[AnyAction] */, S](dispatch: D, getState: () => S): MiddlewareAPI[D, S] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MiddlewareAPI[D, S]]
  }
  
  @scala.inline
  implicit class MiddlewareAPIOps[Self <: MiddlewareAPI[_, _], D /* <: Dispatch[AnyAction] */, S] (val x: Self with (MiddlewareAPI[D, S])) extends AnyVal {
    
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
    def setDispatch(value: D): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
  }
}
