package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchRenderProps[TParams] extends js.Object {
  
  var location: WindowLocation[LocationState] = js.native
  
  var `match`: Null | (Path with TParams) = js.native
  
  var navigate: NavigateFn = js.native
}
object MatchRenderProps {
  
  @scala.inline
  def apply[TParams](location: WindowLocation[LocationState], navigate: NavigateFn): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
  
  @scala.inline
  implicit class MatchRenderPropsOps[Self <: MatchRenderProps[_], TParams] (val x: Self with MatchRenderProps[TParams]) extends AnyVal {
    
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
    def setLocation(value: WindowLocation[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = this.set("navigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Path with TParams): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchNull: Self = this.set("match", null)
  }
}
