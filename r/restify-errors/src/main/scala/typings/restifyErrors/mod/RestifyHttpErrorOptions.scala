package typings.restifyErrors.mod

import typings.verror.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestifyHttpErrorOptions
  extends StObject
     with Options {
  
  var code: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object RestifyHttpErrorOptions {
  
  inline def apply(): RestifyHttpErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyHttpErrorOptions]
  }
  
  extension [Self <: RestifyHttpErrorOptions](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
