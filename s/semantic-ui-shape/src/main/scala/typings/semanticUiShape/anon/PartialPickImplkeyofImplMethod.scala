package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
  
  var side: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplMethod {
  
  inline def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  
  extension [Self <: PartialPickImplkeyofImplMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
