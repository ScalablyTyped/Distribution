package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'visible'> */
trait PickImplvisible extends StObject {
  
  var visible: String
}
object PickImplvisible {
  
  inline def apply(visible: String): PickImplvisible = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisible]
  }
  
  extension [Self <: PickImplvisible](x: Self) {
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
