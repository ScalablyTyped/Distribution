package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenValidator extends StObject {
  
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
}
object ChildrenValidator {
  
  inline def apply(children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): ChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValidator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenValidator] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
