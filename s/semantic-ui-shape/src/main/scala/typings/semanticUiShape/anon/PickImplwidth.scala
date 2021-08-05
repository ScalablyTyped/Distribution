package typings.semanticUiShape.anon

import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'width'> */
trait PickImplwidth extends StObject {
  
  var width: next | initial | Double
}
object PickImplwidth {
  
  inline def apply(width: next | initial | Double): PickImplwidth = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplwidth]
  }
  
  extension [Self <: PickImplwidth](x: Self) {
    
    inline def setWidth(value: next | initial | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
