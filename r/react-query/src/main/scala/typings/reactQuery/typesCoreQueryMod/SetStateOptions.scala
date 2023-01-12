package typings.reactQuery.typesCoreQueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStateOptions extends StObject {
  
  var meta: js.UndefOr[Any] = js.undefined
}
object SetStateOptions {
  
  inline def apply(): SetStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetStateOptions] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
