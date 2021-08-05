package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'maxSearchDepth'> */
trait PickImplmaxSearchDepth extends StObject {
  
  var maxSearchDepth: Double
}
object PickImplmaxSearchDepth {
  
  inline def apply(maxSearchDepth: Double): PickImplmaxSearchDepth = {
    val __obj = js.Dynamic.literal(maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSearchDepth]
  }
  
  extension [Self <: PickImplmaxSearchDepth](x: Self) {
    
    inline def setMaxSearchDepth(value: Double): Self = StObject.set(x, "maxSearchDepth", value.asInstanceOf[js.Any])
  }
}
