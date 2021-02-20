package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'childrenOnly'> */
@js.native
trait PickImplchildrenOnly extends StObject {
  
  var childrenOnly: Boolean = js.native
}
object PickImplchildrenOnly {
  
  @scala.inline
  def apply(childrenOnly: Boolean): PickImplchildrenOnly = {
    val __obj = js.Dynamic.literal(childrenOnly = childrenOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchildrenOnly]
  }
  
  @scala.inline
  implicit class PickImplchildrenOnlyMutableBuilder[Self <: PickImplchildrenOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
  }
}
