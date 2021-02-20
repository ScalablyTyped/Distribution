package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'includeMargin'> */
@js.native
trait PickImplincludeMargin extends StObject {
  
  var includeMargin: Boolean = js.native
}
object PickImplincludeMargin {
  
  @scala.inline
  def apply(includeMargin: Boolean): PickImplincludeMargin = {
    val __obj = js.Dynamic.literal(includeMargin = includeMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplincludeMargin]
  }
  
  @scala.inline
  implicit class PickImplincludeMarginMutableBuilder[Self <: PickImplincludeMargin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
  }
}
