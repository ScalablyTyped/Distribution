package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: js.UndefOr[js.Array[Any]] = js.undefined
}
object Expanded {
  
  inline def apply(): Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: js.Array[Any]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setExpandedVarargs(value: Any*): Self = StObject.set(x, "expanded", js.Array(value*))
  }
}
