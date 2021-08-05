package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'includeMargin'> */
trait PickImplincludeMargin extends StObject {
  
  var includeMargin: Boolean
}
object PickImplincludeMargin {
  
  inline def apply(includeMargin: Boolean): PickImplincludeMargin = {
    val __obj = js.Dynamic.literal(includeMargin = includeMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplincludeMargin]
  }
  
  extension [Self <: PickImplincludeMargin](x: Self) {
    
    inline def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
  }
}
