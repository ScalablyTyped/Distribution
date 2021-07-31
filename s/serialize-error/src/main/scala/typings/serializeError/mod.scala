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
  
  @scala.inline
  def deserializeError(errorObject: js.Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[Error]
  @scala.inline
  def deserializeError(errorObject: ErrorObject): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @scala.inline
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorObject | ErrorType]
  
  trait ErrorObject
    extends StObject
       with JsonObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorObject {
    
    @scala.inline
    def apply(): ErrorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorObject]
    }
    
    @scala.inline
    implicit class ErrorObjectMutableBuilder[Self <: ErrorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
