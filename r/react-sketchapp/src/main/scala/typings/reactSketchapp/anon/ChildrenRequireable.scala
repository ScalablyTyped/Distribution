package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenRequireable extends StObject {
  
  var children: Requireable[ReactNodeLike]
}
object ChildrenRequireable {
  
  inline def apply(children: Requireable[ReactNodeLike]): ChildrenRequireable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenRequireable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenRequireable] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
