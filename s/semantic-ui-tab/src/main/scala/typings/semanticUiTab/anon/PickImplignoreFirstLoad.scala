package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'ignoreFirstLoad'> */
trait PickImplignoreFirstLoad extends StObject {
  
  var ignoreFirstLoad: Boolean
}
object PickImplignoreFirstLoad {
  
  inline def apply(ignoreFirstLoad: Boolean): PickImplignoreFirstLoad = {
    val __obj = js.Dynamic.literal(ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplignoreFirstLoad]
  }
  
  extension [Self <: PickImplignoreFirstLoad](x: Self) {
    
    inline def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
  }
}
