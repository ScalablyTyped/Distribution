package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandHeaderColumnRenderer extends StObject {
  
  var isAnyExpands: Boolean
}
object ExpandHeaderColumnRenderer {
  
  inline def apply(isAnyExpands: Boolean): ExpandHeaderColumnRenderer = {
    val __obj = js.Dynamic.literal(isAnyExpands = isAnyExpands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandHeaderColumnRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandHeaderColumnRenderer] (val x: Self) extends AnyVal {
    
    inline def setIsAnyExpands(value: Boolean): Self = StObject.set(x, "isAnyExpands", value.asInstanceOf[js.Any])
  }
}
