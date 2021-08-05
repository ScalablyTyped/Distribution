package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'active'> */
trait PickImplactiveActive extends StObject {
  
  var active: String
}
object PickImplactiveActive {
  
  inline def apply(active: String): PickImplactiveActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactiveActive]
  }
  
  extension [Self <: PickImplactiveActive](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
