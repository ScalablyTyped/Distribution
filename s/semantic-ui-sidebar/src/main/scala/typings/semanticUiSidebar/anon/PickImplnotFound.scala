package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'notFound'> */
trait PickImplnotFound extends StObject {
  
  var notFound: String
}
object PickImplnotFound {
  
  @scala.inline
  def apply(notFound: String): PickImplnotFound = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnotFound]
  }
  
  @scala.inline
  implicit class PickImplnotFoundMutableBuilder[Self <: PickImplnotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
  }
}
