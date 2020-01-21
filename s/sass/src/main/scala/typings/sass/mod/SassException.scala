package typings.sass.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassException extends Error {
  /**
    * The column number of error.
    */
  var column: Double
  /**
    * The filename of error.
    *
    * In case file option was not set (in favour of `data`), this will reflect the value `stdin`.
    */
  var file: String
  /**
    * The formatted error.
    */
  var formatted: String
  /**
    * The line number of error.
    */
  var line: Double
  /**
    * The status code.
    */
  var status: Double
}

object SassException {
  @scala.inline
  def apply(
    column: Double,
    file: String,
    formatted: String,
    line: Double,
    message: String,
    name: String,
    status: Double,
    stack: String = null
  ): SassException = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassException]
  }
}

