package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'checkOnRefresh'> */
trait PickImplcheckOnRefresh extends StObject {
  
  var checkOnRefresh: Boolean
}
object PickImplcheckOnRefresh {
  
  inline def apply(checkOnRefresh: Boolean): PickImplcheckOnRefresh = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcheckOnRefresh]
  }
  
  extension [Self <: PickImplcheckOnRefresh](x: Self) {
    
    inline def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
  }
}
