package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'elementSize'> */
trait PickImplelementSize extends StObject {
  
  var elementSize: String
}
object PickImplelementSize {
  
  inline def apply(elementSize: String): PickImplelementSize = {
    val __obj = js.Dynamic.literal(elementSize = elementSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplelementSize]
  }
  
  extension [Self <: PickImplelementSize](x: Self) {
    
    inline def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
  }
}
