package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'maxDepth'> */
trait PickImplmaxDepth extends StObject {
  
  var maxDepth: Double
}
object PickImplmaxDepth {
  
  inline def apply(maxDepth: Double): PickImplmaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxDepth]
  }
  
  extension [Self <: PickImplmaxDepth](x: Self) {
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
  }
}
