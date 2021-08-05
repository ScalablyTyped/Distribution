package typings.semanticUiTab.anon

import typings.semanticUiTab.semanticUiTabStrings.all
import typings.semanticUiTab.semanticUiTabStrings.siblings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'deactivate'> */
trait PickImpldeactivate extends StObject {
  
  var deactivate: siblings | all
}
object PickImpldeactivate {
  
  inline def apply(deactivate: siblings | all): PickImpldeactivate = {
    val __obj = js.Dynamic.literal(deactivate = deactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldeactivate]
  }
  
  extension [Self <: PickImpldeactivate](x: Self) {
    
    inline def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
  }
}
