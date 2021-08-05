package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnLoad'> */
trait PickImplrefreshOnLoad extends StObject {
  
  var refreshOnLoad: Boolean
}
object PickImplrefreshOnLoad {
  
  inline def apply(refreshOnLoad: Boolean): PickImplrefreshOnLoad = {
    val __obj = js.Dynamic.literal(refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnLoad]
  }
  
  extension [Self <: PickImplrefreshOnLoad](x: Self) {
    
    inline def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
  }
}
