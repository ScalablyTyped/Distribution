package typings.semanticUiSidebar.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'mobile'> */
@js.native
trait PickImplmobileMobile extends StObject {
  
  var mobile: RegExp = js.native
}
object PickImplmobileMobile {
  
  @scala.inline
  def apply(mobile: RegExp): PickImplmobileMobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobileMobile]
  }
  
  @scala.inline
  implicit class PickImplmobileMobileMutableBuilder[Self <: PickImplmobileMobile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobile(value: RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
