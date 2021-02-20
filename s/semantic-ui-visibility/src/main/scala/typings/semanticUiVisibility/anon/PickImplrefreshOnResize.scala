package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'refreshOnResize'> */
@js.native
trait PickImplrefreshOnResize extends StObject {
  
  var refreshOnResize: Boolean = js.native
}
object PickImplrefreshOnResize {
  
  @scala.inline
  def apply(refreshOnResize: Boolean): PickImplrefreshOnResize = {
    val __obj = js.Dynamic.literal(refreshOnResize = refreshOnResize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrefreshOnResize]
  }
  
  @scala.inline
  implicit class PickImplrefreshOnResizeMutableBuilder[Self <: PickImplrefreshOnResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
  }
}
