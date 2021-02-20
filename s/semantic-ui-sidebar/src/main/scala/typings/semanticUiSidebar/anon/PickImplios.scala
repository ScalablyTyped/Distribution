package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'ios'> */
@js.native
trait PickImplios extends StObject {
  
  var ios: String = js.native
}
object PickImplios {
  
  @scala.inline
  def apply(ios: String): PickImplios = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplios]
  }
  
  @scala.inline
  implicit class PickImpliosMutableBuilder[Self <: PickImplios] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
