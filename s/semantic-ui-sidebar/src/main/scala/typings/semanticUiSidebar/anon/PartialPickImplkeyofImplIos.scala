package typings.semanticUiSidebar.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplIos extends StObject {
  
  var ios: js.UndefOr[RegExp] = js.native
  
  var mobile: js.UndefOr[RegExp] = js.native
}
object PartialPickImplkeyofImplIos {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIos]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplIosMutableBuilder[Self <: PartialPickImplkeyofImplIos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIos(value: RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    @scala.inline
    def setMobile(value: RegExp): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
