package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'mobile'> */
@js.native
trait PickImplmobile extends StObject {
  
  var mobile: MobileSettings = js.native
}
object PickImplmobile {
  
  @scala.inline
  def apply(mobile: MobileSettings): PickImplmobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobile]
  }
  
  @scala.inline
  implicit class PickImplmobileMutableBuilder[Self <: PickImplmobile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
