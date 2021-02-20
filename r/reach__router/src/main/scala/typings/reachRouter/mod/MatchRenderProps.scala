package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchRenderProps[TParams] extends StObject {
  
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
  implicit class MatchRenderPropsMutableBuilder[Self <: MatchRenderProps[_], TParams] (val x: Self with MatchRenderProps[TParams]) extends AnyVal {
    
    @scala.inline
    def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Path with TParams): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchNull: Self = StObject.set(x, "match", null)
    
    @scala.inline
    def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
