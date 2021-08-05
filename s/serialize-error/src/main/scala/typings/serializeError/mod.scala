package typings.serializeError

import typings.std.Error
import typings.typeFest.basicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serialize-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeError(errorObject: js.Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[Error]
  inline def deserializeError(errorObject: ErrorObject): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorObject | ErrorType]
  
  trait ErrorObject
    extends StObject
       with JsonObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorObject {
    
    inline def apply(): ErrorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorObject]
    }
    
    extension [Self <: ErrorObject](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
