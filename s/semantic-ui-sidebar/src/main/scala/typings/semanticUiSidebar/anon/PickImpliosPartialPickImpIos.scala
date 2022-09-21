package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'ios'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
trait PickImpliosPartialPickImpIos
  extends StObject
     with Param {
  
  var ios: js.RegExp & js.UndefOr[js.RegExp]
  
  var mobile: js.UndefOr[js.RegExp] = js.undefined
}
object PickImpliosPartialPickImpIos {
  
  inline def apply(ios: js.RegExp & js.UndefOr[js.RegExp]): PickImpliosPartialPickImpIos = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliosPartialPickImpIos]
  }
  
  extension [Self <: PickImpliosPartialPickImpIos](x: Self) {
    
    inline def setIos(value: js.RegExp & js.UndefOr[js.RegExp]): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: js.RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
