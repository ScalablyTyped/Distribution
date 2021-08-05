package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'childrenOnly'> */
trait PickImplchildrenOnly extends StObject {
  
  var childrenOnly: Boolean
}
object PickImplchildrenOnly {
  
  inline def apply(childrenOnly: Boolean): PickImplchildrenOnly = {
    val __obj = js.Dynamic.literal(childrenOnly = childrenOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchildrenOnly]
  }
  
  extension [Self <: PickImplchildrenOnly](x: Self) {
    
    inline def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
  }
}
