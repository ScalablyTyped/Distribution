package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreePath extends StObject {
  
  var path: NumberOrStringArray = js.native
}
object TreePath {
  
  @scala.inline
  def apply(path: NumberOrStringArray): TreePath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreePath]
  }
  
  @scala.inline
  implicit class TreePathMutableBuilder[Self <: TreePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
