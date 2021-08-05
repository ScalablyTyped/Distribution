package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'exclusive'> */
trait PickImplexclusive extends StObject {
  
  var exclusive: Boolean
}
object PickImplexclusive {
  
  inline def apply(exclusive: Boolean): PickImplexclusive = {
    val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexclusive]
  }
  
  extension [Self <: PickImplexclusive](x: Self) {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
  }
}
