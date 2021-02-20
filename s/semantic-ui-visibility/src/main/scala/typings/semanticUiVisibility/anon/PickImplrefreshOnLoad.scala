package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnLoad'> */
@js.native
trait PickImplrefreshOnLoad extends StObject {
  
  var refreshOnLoad: Boolean = js.native
}
object PickImplrefreshOnLoad {
  
  @scala.inline
  def apply(refreshOnLoad: Boolean): PickImplrefreshOnLoad = {
    val __obj = js.Dynamic.literal(refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnLoad]
  }
  
  @scala.inline
  implicit class PickImplrefreshOnLoadMutableBuilder[Self <: PickImplrefreshOnLoad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
  }
}
