package typings.serializeError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.typeFest.basicMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serialize-error", "deserializeError")
  @js.native
  def deserializeError(errorObject: js.Any): Error = js.native
  @JSImport("serialize-error", "deserializeError")
  @js.native
  def deserializeError(errorObject: ErrorObject): Error = js.native
  
  @JSImport("serialize-error", "serializeError")
  @js.native
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
  
  /* Inlined {  name :string | undefined,   stack :string | undefined,   message :string | undefined,   code :string | undefined} & type-fest.type-fest.JsonObject */
  @js.native
  trait ErrorObject extends /* key */ StringDictionary[JsonValue] {
    
    var code: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
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
