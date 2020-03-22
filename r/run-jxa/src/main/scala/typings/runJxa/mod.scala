package typings.runJxa

import typings.typeFest.basicMod.JsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-jxa", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def apply[ReturnType /* <: JsonValue */](input: String): js.Promise[ReturnType] = js.native
  def apply[ReturnType /* <: JsonValue */](input: String, arguments: js.Array[JsonValue]): js.Promise[ReturnType] = js.native
  def apply[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType]): js.Promise[ReturnType] = js.native
  def apply[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType], arguments: js.Array[JsonValue]): js.Promise[ReturnType] = js.native
  /**
  	Synchronously run [JXA](https://github.com/dtinth/JXA-Cookbook) code and get the result.
  	@param input - If a function, it's stringified and passed to JXA. It should be [pure](https://en.wikipedia.org/wiki/Pure_function), meaning it doesn't access anything outside its body.
  	If a string, you can access the specified arguments with `args` array. Use the `arguments` parameter rather than template interpolation so you don't have to do escaping.
  	You can `console.log` inside `input`. It will be forwarded to stdout. Useful for debugging.
  	Note: The JXA context is completely synchronous, so asynchronous functions like `setTimeout` are not available.
  	@param arguments - Arguments to pass to the JXA context. Items should be serializable (`JSON.stringify`'able).
  	@returns The value returned from `input`.
  	*/
  def sync[ReturnType /* <: JsonValue */](input: String): ReturnType = js.native
  def sync[ReturnType /* <: JsonValue */](input: String, arguments: js.Array[JsonValue]): ReturnType = js.native
  def sync[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType]): ReturnType = js.native
  def sync[ReturnType /* <: JsonValue */](input: js.Function1[/* repeated */ JsonValue, ReturnType], arguments: js.Array[JsonValue]): ReturnType = js.native
}

