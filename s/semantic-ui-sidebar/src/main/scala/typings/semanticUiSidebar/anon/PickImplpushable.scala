package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'pushable'> */
trait PickImplpushable extends StObject {
  
  var pushable: String
}
object PickImplpushable {
  
  inline def apply(pushable: String): PickImplpushable = {
    val __obj = js.Dynamic.literal(pushable = pushable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushable]
  }
  
  extension [Self <: PickImplpushable](x: Self) {
    
    inline def setPushable(value: String): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
  }
}
