package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, 'side'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl>> */
trait PickImplsidePartialPickImMethod
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var side: String & js.UndefOr[String]
}
object PickImplsidePartialPickImMethod {
  
  inline def apply(side: String & js.UndefOr[String]): PickImplsidePartialPickImMethod = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidePartialPickImMethod]
  }
  
  extension [Self <: PickImplsidePartialPickImMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSide(value: String & js.UndefOr[String]): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
