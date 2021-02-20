package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'once'> */
@js.native
trait PickImplonce extends StObject {
  
  var once: Boolean = js.native
}
object PickImplonce {
  
  @scala.inline
  def apply(once: Boolean): PickImplonce = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonce]
  }
  
  @scala.inline
  implicit class PickImplonceMutableBuilder[Self <: PickImplonce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
  }
}
