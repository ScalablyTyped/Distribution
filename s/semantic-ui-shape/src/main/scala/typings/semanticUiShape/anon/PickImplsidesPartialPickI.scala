package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, 'sides'> & std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl>> */
trait PickImplsidesPartialPickI
  extends StObject
     with Param {
  
  var side: js.UndefOr[String] = js.undefined
  
  var sides: String & js.UndefOr[String]
}
object PickImplsidesPartialPickI {
  
  inline def apply(sides: String & js.UndefOr[String]): PickImplsidesPartialPickI = {
    val __obj = js.Dynamic.literal(sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidesPartialPickI]
  }
  
  extension [Self <: PickImplsidesPartialPickI](x: Self) {
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSides(value: String & js.UndefOr[String]): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
  }
}
