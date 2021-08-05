package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'bottomOffset'> */
trait PickImplbottomOffset extends StObject {
  
  var bottomOffset: Double
}
object PickImplbottomOffset {
  
  inline def apply(bottomOffset: Double): PickImplbottomOffset = {
    val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbottomOffset]
  }
  
  extension [Self <: PickImplbottomOffset](x: Self) {
    
    inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
  }
}
