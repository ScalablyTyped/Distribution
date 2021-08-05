package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'missingTab'> */
trait PickImplmissingTab extends StObject {
  
  var missingTab: String
}
object PickImplmissingTab {
  
  inline def apply(missingTab: String): PickImplmissingTab = {
    val __obj = js.Dynamic.literal(missingTab = missingTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingTab]
  }
  
  extension [Self <: PickImplmissingTab](x: Self) {
    
    inline def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
  }
}
