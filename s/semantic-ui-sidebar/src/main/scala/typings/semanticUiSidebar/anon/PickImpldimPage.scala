package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'dimPage'> */
trait PickImpldimPage extends StObject {
  
  var dimPage: Boolean
}
object PickImpldimPage {
  
  @scala.inline
  def apply(dimPage: Boolean): PickImpldimPage = {
    val __obj = js.Dynamic.literal(dimPage = dimPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimPage]
  }
  
  @scala.inline
  implicit class PickImpldimPageMutableBuilder[Self <: PickImpldimPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimPage(value: Boolean): Self = StObject.set(x, "dimPage", value.asInstanceOf[js.Any])
  }
}
