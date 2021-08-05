package typings.rollup.anon

import typings.rollup.mod.RollupError
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with RollupWatcherEvent {
  
  var code: ERROR
  
  var error: RollupError
}
object Error {
  
  inline def apply(error: RollupError): Error = {
    val __obj = js.Dynamic.literal(code = "ERROR", error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setCode(value: ERROR): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setError(value: RollupError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
