package typings.storybookRouter.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchProps extends StObject {
  
  def children(matchingData: MatchingData): ReactNode
  
  var path: String
  
  var startsWith: Boolean
}
object MatchProps {
  
  inline def apply(children: MatchingData => ReactNode, path: String, startsWith: Boolean): MatchProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: MatchingData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
  }
}
