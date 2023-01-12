package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'mobile'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
trait PickImplmobilePartialPickIos
  extends StObject
     with Param {
  
  var ios: js.UndefOr[js.RegExp] = js.undefined
  
  var mobile: js.RegExp
}
object PickImplmobilePartialPickIos {
  
  inline def apply(mobile: js.RegExp): PickImplmobilePartialPickIos = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobilePartialPickIos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplmobilePartialPickIos] (val x: Self) extends AnyVal {
    
    inline def setIos(value: js.RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setMobile(value: js.RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
