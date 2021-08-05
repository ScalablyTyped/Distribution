package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'dimPage'> */
trait PickImpldimPage extends StObject {
  
  var dimPage: Boolean
}
object PickImpldimPage {
  
  inline def apply(dimPage: Boolean): PickImpldimPage = {
    val __obj = js.Dynamic.literal(dimPage = dimPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimPage]
  }
  
  extension [Self <: PickImpldimPage](x: Self) {
    
    inline def setDimPage(value: Boolean): Self = StObject.set(x, "dimPage", value.asInstanceOf[js.Any])
  }
}
