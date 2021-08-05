package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnResize'> */
trait PickImplrefreshOnResize extends StObject {
  
  var refreshOnResize: Boolean
}
object PickImplrefreshOnResize {
  
  inline def apply(refreshOnResize: Boolean): PickImplrefreshOnResize = {
    val __obj = js.Dynamic.literal(refreshOnResize = refreshOnResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnResize]
  }
  
  extension [Self <: PickImplrefreshOnResize](x: Self) {
    
    inline def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
  }
}
