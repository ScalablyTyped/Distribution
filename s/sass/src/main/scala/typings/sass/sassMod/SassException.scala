package typings.sass.sassMod

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
    val __obj = js.Dynamic.literal(column = column, file = file, formatted = formatted, line = line, message = message, name = name, status = status)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SassException]
  }
}

