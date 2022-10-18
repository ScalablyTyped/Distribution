package typings.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultOptions extends StObject {
  
  var throwOnError: js.UndefOr[Boolean] = js.undefined
}
object ResultOptions {
  
  inline def apply(): ResultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultOptions]
  }
  
  extension [Self <: ResultOptions](x: Self) {
    
    inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
    
    inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
  }
}
