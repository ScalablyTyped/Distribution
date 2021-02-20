package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'active'> */
@js.native
trait PickImplactiveActive extends StObject {
  
  var active: String = js.native
}
object PickImplactiveActive {
  
  @scala.inline
  def apply(active: String): PickImplactiveActive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactiveActive]
  }
  
  @scala.inline
  implicit class PickImplactiveActiveMutableBuilder[Self <: PickImplactiveActive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
  }
}
