package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBox extends StObject {
  
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  
  var id: Validator[String]
  
  var preserveAspectRatio: Requireable[String]
  
  var viewBox: Requireable[String]
}
object ViewBox {
  
  inline def apply(
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    id: Validator[String],
    preserveAspectRatio: Requireable[String],
    viewBox: Requireable[String]
  ): ViewBox = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBox]
  }
  
  extension [Self <: ViewBox](x: Self) {
    
    inline def setChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: Requireable[String]): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: Requireable[String]): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
  }
}
