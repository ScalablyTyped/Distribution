package typings.semanticUiShape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, 'side'> */
trait PickImplside extends StObject {
  
  var side: String
}
object PickImplside {
  
  inline def apply(side: String): PickImplside = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplside]
  }
  
  extension [Self <: PickImplside](x: Self) {
    
    inline def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
