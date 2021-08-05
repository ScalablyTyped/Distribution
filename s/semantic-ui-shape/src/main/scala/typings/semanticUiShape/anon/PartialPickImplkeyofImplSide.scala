package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplSide extends StObject {
  
  var side: js.UndefOr[String] = js.undefined
  
  var sides: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplSide {
  
  inline def apply(): PartialPickImplkeyofImplSide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplSide]
  }
  
  extension [Self <: PartialPickImplkeyofImplSide](x: Self) {
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSides(value: String): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
  }
}
