package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'tab'> */
trait PickImpltab extends StObject {
  
  var tab: String
}
object PickImpltab {
  
  inline def apply(tab: String): PickImpltab = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltab]
  }
  
  extension [Self <: PickImpltab](x: Self) {
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
