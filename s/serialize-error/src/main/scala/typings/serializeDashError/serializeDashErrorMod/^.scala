package typings.serializeDashError.serializeDashErrorMod

import typings.serializeDashError.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function serializeError<ErrorType>(
  // 	error: ErrorType
  // ): ErrorType extends Primitive ? ErrorType : ErrorObject;
  // export = serializeError;
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Serialize an error into a plain object.
  	@example
  	```
  	import serializeError = require('serialize-error');
  	const error = new Error('🦄');
  	console.log(error);
  	//=> [Error: 🦄]
  	console.log(serializeError(error));
  	//=> {name: 'Error', message: '🦄', stack: 'Error: 🦄\n    at Object.<anonymous> …'}
  	```
  	*/
  def apply[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
  /**
  	Serialize an error into a plain object.
  	@example
  	```
  	import serializeError = require('serialize-error');
  	const error = new Error('🦄');
  	console.log(error);
  	//=> [Error: 🦄]
  	console.log(serializeError(error));
  	//=> {name: 'Error', message: '🦄', stack: 'Error: 🦄\n    at Object.<anonymous> …'}
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function serializeError<ErrorType>(
  // 	error: ErrorType
  // ): ErrorType extends Primitive ? ErrorType : ErrorObject;
  // export = serializeError;
  def default[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
}

