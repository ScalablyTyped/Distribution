package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'useLegacy'> */
@js.native
trait PickImpluseLegacy extends StObject {
  
  var useLegacy: auto | Boolean = js.native
}
object PickImpluseLegacy {
  
  @scala.inline
  def apply(useLegacy: auto | Boolean): PickImpluseLegacy = {
    val __obj = js.Dynamic.literal(useLegacy = useLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseLegacy]
  }
  
  @scala.inline
  implicit class PickImpluseLegacyMutableBuilder[Self <: PickImpluseLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseLegacy(value: auto | Boolean): Self = StObject.set(x, "useLegacy", value.asInstanceOf[js.Any])
  }
}
