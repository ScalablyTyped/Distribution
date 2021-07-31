package typings.reachRouter.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchProps[TParams] extends StObject {
  
  var children: MatchRenderFn[TParams]
  
  var path: String
}
object MatchProps {
  
  @scala.inline
  def apply[TParams](children: /* props */ MatchRenderProps[TParams] => ReactNode, path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps[TParams]]
  }
  
  @scala.inline
  implicit class MatchPropsMutableBuilder[Self <: MatchProps[?], TParams] (val x: Self & MatchProps[TParams]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* props */ MatchRenderProps[TParams] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
