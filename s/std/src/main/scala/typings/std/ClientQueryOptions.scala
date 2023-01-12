package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientQueryOptions extends StObject {
  
  /* standard dom */
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[ClientTypes] = js.undefined
}
object ClientQueryOptions {
  
  inline def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeUncontrolled(value: scala.Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
    
    inline def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
    
    inline def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
