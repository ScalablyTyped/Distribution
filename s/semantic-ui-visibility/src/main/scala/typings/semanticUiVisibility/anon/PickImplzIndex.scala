package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'zIndex'> */
trait PickImplzIndex extends StObject {
  
  var zIndex: Double
}
object PickImplzIndex {
  
  inline def apply(zIndex: Double): PickImplzIndex = {
    val __obj = js.Dynamic.literal(zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplzIndex]
  }
  
  extension [Self <: PickImplzIndex](x: Self) {
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
