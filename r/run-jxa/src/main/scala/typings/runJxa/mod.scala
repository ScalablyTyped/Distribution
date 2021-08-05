package typings.runJxa

import typings.typeFest.basicMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Run [JXA](https://github.com/dtinth/JXA-Cookbook) code and get the result.
  	@param input - If a function, it's stringified and passed to JXA. It should be [pure](https://en.wikipedia.org/wiki/Pure_function), meaning it doesn't access anything outside its body.
  	If a string, you can access the specified arguments with `args` array. Use the `arguments` parameter rather than template interpolation so you don't have to do escaping.
  	You can `console.log` inside `input`. It will be forwarded to stdout. Useful for debugging.
  	Note: The JXA context is completely synchronous, so asynchronous functions like `setTimeout` are not available.
  	@param arguments - Arguments to pass to the JXA context. Items should be serializable (`JSON.stringify`'able).
  	@returns The value returned from `input`.
  	@example
  	```
  	import runJxa = require('run-jxa');
  	(async () => {
  		const functionResult = await runJxa((unicorn, horse) => {
  			// This is run in the JXA engine
  			return `I love ${unicorn} & ${horse}`;
  		}, ['🦄', '🐴']);
  		console.log(functionResult);
  		//=> 'I love 🦄 & 🐴'
  		const stringResult = await runJxa(`
  			const [unicorn, horse] = args;
  			return \`I love \${unicorn} & \${horse}\`;
  		`, ['🦄', '🐴']);
  		console.log(stringResult);
  		//=> 'I love 🦄 & 🐴'
  	})();
  	```
  	*/
  inline def apply[ReturnType /* <: JsonValue */](input: String): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ReturnType /* <: JsonValue */](input: String, arguments: js.Array[JsonValue]): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType], arguments: js.Array[JsonValue]): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  
  @JSImport("run-jxa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Synchronously run [JXA](https://github.com/dtinth/JXA-Cookbook) code and get the result.
  	@param input - If a function, it's stringified and passed to JXA. It should be [pure](https://en.wikipedia.org/wiki/Pure_function), meaning it doesn't access anything outside its body.
  	If a string, you can access the specified arguments with `args` array. Use the `arguments` parameter rather than template interpolation so you don't have to do escaping.
  	You can `console.log` inside `input`. It will be forwarded to stdout. Useful for debugging.
  	Note: The JXA context is completely synchronous, so asynchronous functions like `setTimeout` are not available.
  	@param arguments - Arguments to pass to the JXA context. Items should be serializable (`JSON.stringify`'able).
  	@returns The value returned from `input`.
  	*/
  inline def sync[ReturnType /* <: JsonValue */](input: String): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  inline def sync[ReturnType /* <: JsonValue */](input: String, arguments: js.Array[JsonValue]): ReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[ReturnType]
  inline def sync[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  inline def sync[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType], arguments: js.Array[JsonValue]): ReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[ReturnType]
}
