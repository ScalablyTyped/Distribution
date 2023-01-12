package typings.reachRouter.mod

import typings.reachRouter.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchRenderProps[TParams] extends StObject {
  
  var location: WindowLocation[Any]
  
  var `match`: Null | (Path & TParams)
  
  var navigate: NavigateFn
}
object MatchRenderProps {
  
  inline def apply[TParams](location: WindowLocation[Any], navigate: NavigateFn): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(null)
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchRenderProps[?], TParams] (val x: Self & MatchRenderProps[TParams]) extends AnyVal {
    
    inline def setLocation(value: WindowLocation[Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: Path & TParams): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchNull: Self = StObject.set(x, "match", null)
    
    inline def setNavigate(value: NavigateFn): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
