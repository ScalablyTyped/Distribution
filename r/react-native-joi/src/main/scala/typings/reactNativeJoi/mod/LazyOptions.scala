package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazyOptions extends StObject {
  
  /**
    * If true the schema generator will only be called once and the result will be cached.
    */
  var once: js.UndefOr[Boolean] = js.undefined
}
object LazyOptions {
  
  inline def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  
  extension [Self <: LazyOptions](x: Self) {
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
