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
  
  inline def apply[TParams](children: /* props */ MatchRenderProps[TParams] => ReactNode, path: String): MatchProps[TParams] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps[TParams]]
  }
  
  extension [Self <: MatchProps[?], TParams](x: Self & MatchProps[TParams]) {
    
    inline def setChildren(value: /* props */ MatchRenderProps[TParams] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
