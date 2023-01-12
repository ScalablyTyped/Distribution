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
  
  var side: String
}
object PickImplsidePartialPickImMethod {
  
  inline def apply(side: String): PickImplsidePartialPickImMethod = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidePartialPickImMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplsidePartialPickImMethod] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
