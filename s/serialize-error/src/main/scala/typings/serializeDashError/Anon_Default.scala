package typings.serializeDashError

import typings.serializeDashError.serializeDashErrorMod.ErrorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

