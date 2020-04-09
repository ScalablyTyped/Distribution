package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Adds messages to the log._
  * @see https://docs.scriptable.app/console
  */
@JSGlobal("console")
@js.native
object console extends js.Object {
  /**
    * _Logs an error message to the console._
    *
    * The message will have a distinctive appearance. Refer to `console.log(message)` to log informative message and `console.warn(message)` to log warnings.
    *
    * You can also use the global function `logError(message)` which is a shorthand for `console.error`.
    * @param message - Message to log to the console.
    * @see https://docs.scriptable.app/console/#error
    */
  def error(message: js.Any): Unit = js.native
  /**
    * _Logs a message to the console._
    *
    * The message will have a default appearance. Refer to `console.error(message)` to log errors.
    *
    * You can also use the global function `log(message)` which is a shorthand for `console.log`.
    * @param message - Message to log to the console.
    * @see https://docs.scriptable.app/console/#log
    */
  def log(message: js.Any): Unit = js.native
  /**
    * _Logs a warning message to the console._
    *
    * The message will have a distinctive appearance. Refer to `console.log(message)` to log informative messages and `console.error(message)` to log errors.
    *
    * You can also use the global function `logWarning(message)` which is a shorthand for `console.warn`.
    * @param message - Message to log to the console.
    * @see https://docs.scriptable.app/console/#warn
    */
  def warn(message: js.Any): Unit = js.native
}

