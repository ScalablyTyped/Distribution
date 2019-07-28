package typings.requirejs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireError extends Error {
  /**
  	* The original error, if there is one (might be null).
  	**/
  var originalError: Error
  /**
  	* Required modules.
  	**/
  var requireModules: js.Array[String] | Null
  /**
  	* The error ID that maps to an ID on a web page.
  	**/
  var requireType: String
}

object RequireError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    originalError: Error,
    requireType: String,
    requireModules: js.Array[String] = null,
    stack: String = null
  ): RequireError = {
    val __obj = js.Dynamic.literal(message = message, name = name, originalError = originalError, requireType = requireType)
    if (requireModules != null) __obj.updateDynamic("requireModules")(requireModules)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequireError]
  }
}

