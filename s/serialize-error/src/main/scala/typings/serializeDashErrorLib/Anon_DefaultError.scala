package typings
package serializeDashErrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultError extends js.Object {
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
  def apply[ErrorType](error: ErrorType): serializeDashErrorLib.serializeDashErrorMod.serializeErrorNs.ErrorObject | ErrorType = js.native
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
  def default[ErrorType](error: ErrorType): serializeDashErrorLib.serializeDashErrorMod.serializeErrorNs.ErrorObject | ErrorType = js.native
}

