package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.SelectorSettings._Impl, 'parent'> */
@js.native
trait PickImplparent extends StObject {
  
  var parent: String = js.native
}
object PickImplparent {
  
  @scala.inline
  def apply(parent: String): PickImplparent = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparent]
  }
  
  @scala.inline
  implicit class PickImplparentMutableBuilder[Self <: PickImplparent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
