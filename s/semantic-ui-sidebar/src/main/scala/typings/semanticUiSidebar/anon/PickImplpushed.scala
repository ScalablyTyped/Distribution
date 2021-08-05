package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'pushed'> */
trait PickImplpushed extends StObject {
  
  var pushed: String
}
object PickImplpushed {
  
  inline def apply(pushed: String): PickImplpushed = {
    val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushed]
  }
  
  extension [Self <: PickImplpushed](x: Self) {
    
    inline def setPushed(value: String): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
  }
}
