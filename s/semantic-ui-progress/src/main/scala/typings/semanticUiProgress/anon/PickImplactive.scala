package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'active'> */
trait PickImplactive extends StObject {
  
  var active: `false` | String
}
object PickImplactive {
  
  inline def apply(active: `false` | String): PickImplactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactive]
  }
  
  extension [Self <: PickImplactive](x: Self) {
    
    inline def setActive(value: `false` | String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
