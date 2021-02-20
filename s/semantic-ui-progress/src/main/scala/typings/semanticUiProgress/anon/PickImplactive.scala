package typings.semanticUiProgress.anon

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'active'> */
@js.native
trait PickImplactive extends StObject {
  
  var active: `false` | String = js.native
}
object PickImplactive {
  
  @scala.inline
  def apply(active: `false` | String): PickImplactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactive]
  }
  
  @scala.inline
  implicit class PickImplactiveMutableBuilder[Self <: PickImplactive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: `false` | String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
