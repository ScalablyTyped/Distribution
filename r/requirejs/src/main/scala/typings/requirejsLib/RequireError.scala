package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireError
  extends stdLib.Error {
  /**
  	* The original error, if there is one (might be null).
  	**/
  var originalError: stdLib.Error
  /**
  	* Required modules.
  	**/
  var requireModules: js.Array[java.lang.String] | scala.Null
  /**
  	* The error ID that maps to an ID on a web page.
  	**/
  var requireType: java.lang.String
}

object RequireError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    originalError: stdLib.Error,
    requireType: java.lang.String,
    requireModules: js.Array[java.lang.String] = null,
    stack: java.lang.String = null
  ): RequireError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("originalError")(originalError)
    __obj.updateDynamic("requireType")(requireType)
    if (requireModules != null) __obj.updateDynamic("requireModules")(requireModules)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequireError]
  }
}

