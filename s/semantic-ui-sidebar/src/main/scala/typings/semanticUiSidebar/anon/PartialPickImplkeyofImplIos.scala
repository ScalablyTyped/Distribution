package typings.semanticUiSidebar.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplIos extends StObject {
  
  var ios: js.UndefOr[RegExp] = js.undefined
  
  var mobile: js.UndefOr[RegExp] = js.undefined
}
object PartialPickImplkeyofImplIos {
  
  inline def apply(): PartialPickImplkeyofImplIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIos]
  }
  
  extension [Self <: PartialPickImplkeyofImplIos](x: Self) {
    
    inline def setIos(value: RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setMobile(value: RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
