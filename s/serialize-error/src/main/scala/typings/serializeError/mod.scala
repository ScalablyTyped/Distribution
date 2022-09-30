package typings.serializeError

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorConstructor
import typings.std.Map
import typings.typeFest.basicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serialize-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeError(errorObject: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def deserializeError(errorObject: Any, options: Options): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def deserializeError(errorObject: ErrorObject): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  inline def deserializeError(errorObject: ErrorObject, options: Options): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeError")(errorObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  @JSImport("serialize-error", "errorConstructors")
  @js.native
  val errorConstructors: Map[String, ErrorConstructor] = js.native
  
  inline def isErrorLike(value: Any): /* is serialize-error.serialize-error.ErrorLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is serialize-error.serialize-error.ErrorLike */ Boolean]
  
  inline def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorObject | ErrorType]
  inline def serializeError[ErrorType](error: ErrorType, options: Options): ErrorObject | ErrorType = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeError")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ErrorObject | ErrorType]
  
  trait ErrorLike
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var cause: js.UndefOr[Any] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: String
    
    var name: String
    
    var stack: String
  }
  object ErrorLike {
    
    inline def apply(message: String, name: String, stack: String): ErrorLike = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLike]
    }
    
    extension [Self <: ErrorLike](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ErrorObject
    extends StObject
       with JsonObject {
    
    var cause: js.UndefOr[Any] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  
  trait Options extends StObject {
    
    /**
    	The maximum depth of properties to preserve when serializing/deserializing.
    	@default Number.POSITIVE_INFINITY
    	@example
    	```
    	import {serializeError} from 'serialize-error';
    	const error = new Error('🦄');
    	error.one = {two: {three: {}}};
    	console.log(serializeError(error, {maxDepth: 1}));
    	//=> {name: 'Error', message: '…', one: {}}
    	console.log(serializeError(error, {maxDepth: 2}));
    	//=> {name: 'Error', message: '…', one: { two: {}}}
    	```
    	*/
    val maxDepth: js.UndefOr[Double] = js.undefined
    
    /**
    	Indicate whether to use a `.toJSON()` method if encountered in the object. This is useful when a custom error implements its own serialization logic via `.toJSON()` but you prefer to not use it.
    	@default true
    	*/
    val useToJSON: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setUseToJSON(value: Boolean): Self = StObject.set(x, "useToJSON", value.asInstanceOf[js.Any])
      
      inline def setUseToJSONUndefined: Self = StObject.set(x, "useToJSON", js.undefined)
    }
  }
}
