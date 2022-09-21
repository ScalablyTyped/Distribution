package typings.snowflakeSdk.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeErrorExternal
  extends StObject
     with Error {
  
  @JSName("cause")
  var cause_SnowflakeErrorExternal: js.UndefOr[js.Error] = js.undefined
  
  var code: js.UndefOr[ErrorCode] = js.undefined
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var isFatal: js.UndefOr[Boolean] = js.undefined
  
  var response: js.UndefOr[js.Object] = js.undefined
  
  var responseBody: js.UndefOr[String] = js.undefined
  
  var sqlState: js.UndefOr[String] = js.undefined
}
object SnowflakeErrorExternal {
  
  inline def apply(message: String, name: String): SnowflakeErrorExternal = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeErrorExternal]
  }
  
  extension [Self <: SnowflakeErrorExternal](x: Self) {
    
    inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIsFatal(value: Boolean): Self = StObject.set(x, "isFatal", value.asInstanceOf[js.Any])
    
    inline def setIsFatalUndefined: Self = StObject.set(x, "isFatal", js.undefined)
    
    inline def setResponse(value: js.Object): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSqlState(value: String): Self = StObject.set(x, "sqlState", value.asInstanceOf[js.Any])
    
    inline def setSqlStateUndefined: Self = StObject.set(x, "sqlState", js.undefined)
  }
}
