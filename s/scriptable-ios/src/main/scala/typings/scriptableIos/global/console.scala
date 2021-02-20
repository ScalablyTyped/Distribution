package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Adds messages to the log._
  * @see https://docs.scriptable.app/console
  */
object console {
  
  /**
    * _Logs an error message to the console._
    *
    * The message will have a distinctive appearance. Refer to `console.log(message)` to log informative message and `console.warn(message)` to log warnings.
    *
    * You can also use the global function `logError(message)` which is a shorthand for `console.error`.
    * @param message - Message to log to the console.
    * @see https://docs.scriptable.app/console/#error
    */
  @JSGlobal("console.error")
  @js.native
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
  @JSGlobal("console.log")
  @js.native
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
  @JSGlobal("console.warn")
  @js.native
  def warn(message: js.Any): Unit = js.native
}
