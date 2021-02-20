package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'path'> */
@js.native
trait PickImplpathPath extends StObject {
  
  var path: String = js.native
}
object PickImplpathPath {
  
  @scala.inline
  def apply(path: String): PickImplpathPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpathPath]
  }
  
  @scala.inline
  implicit class PickImplpathPathMutableBuilder[Self <: PickImplpathPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
