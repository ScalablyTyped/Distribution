package typings.semanticUiShape.anon

import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'height'> */
trait PickImplheight extends StObject {
  
  var height: next | initial | Double
}
object PickImplheight {
  
  inline def apply(height: next | initial | Double): PickImplheight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplheight]
  }
  
  extension [Self <: PickImplheight](x: Self) {
    
    inline def setHeight(value: next | initial | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
