package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'alwaysRefresh'> */
trait PickImplalwaysRefresh extends StObject {
  
  var alwaysRefresh: Boolean
}
object PickImplalwaysRefresh {
  
  inline def apply(alwaysRefresh: Boolean): PickImplalwaysRefresh = {
    val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplalwaysRefresh]
  }
  
  extension [Self <: PickImplalwaysRefresh](x: Self) {
    
    inline def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
  }
}
