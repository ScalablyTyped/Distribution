package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'auto'> */
trait PickImplauto extends StObject {
  
  var auto: Boolean
}
object PickImplauto {
  
  inline def apply(auto: Boolean): PickImplauto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplauto]
  }
  
  extension [Self <: PickImplauto](x: Self) {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
  }
}
