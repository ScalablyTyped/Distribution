package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayUniqueOptions extends StObject {
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
}
object ArrayUniqueOptions {
  
  inline def apply(): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayUniqueOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
  }
}
