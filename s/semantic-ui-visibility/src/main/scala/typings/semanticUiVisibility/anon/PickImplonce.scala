package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'once'> */
trait PickImplonce extends StObject {
  
  var once: Boolean
}
object PickImplonce {
  
  inline def apply(once: Boolean): PickImplonce = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonce]
  }
  
  extension [Self <: PickImplonce](x: Self) {
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
  }
}
