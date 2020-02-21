package typings.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/logging", "Logger")
@js.native
class Logger protected () extends js.Object {
  /**
    * @param {string} name the name of this logger.
    * @param {Level=} opt_level the initial level for this logger.
    */
  def this(name: String) = this()
  def this(name: String, opt_level: Level) = this()
  /** @private {Set<function(!Entry)>} */
  var handlers_ : js.Any = js.native
  /** @private {Level} */
  var level_ : Level = js.native
  /** @private {string} */
  var name_ : String = js.native
  /** @private {Logger} */
  var parent_ : Logger = js.native
  /**
    * Adds a handler to this logger. The handler will be invoked for each message
    * logged with this instance, or any of its descendants.
    *
    * @param {function(!Entry)} handler the handler to add.
    */
  def addHandler(handler: js.Any): Unit = js.native
  /**
    * Logs a message at the {@link Level.DEBUG} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def debug(loggable: String): Unit = js.native
  def debug(loggable: js.Function): Unit = js.native
  /**
    * Logs a message at the {@link Level.FINE} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def fine(loggable: String): Unit = js.native
  def fine(loggable: js.Function): Unit = js.native
  /**
    * Logs a message at the {@link Level.FINER} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def finer(loggable: String): Unit = js.native
  def finer(loggable: js.Function): Unit = js.native
  /**
    * Logs a message at the {@link Level.FINEST} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def finest(loggable: String): Unit = js.native
  def finest(loggable: js.Function): Unit = js.native
  /**
    * @return {!Level} the effective level for this logger.
    */
  def getEffectiveLevel(): Level = js.native
  /** @return {Level} the log level for this logger. */
  def getLevel(): Level = js.native
  /** @return {string} the name of this logger. */
  def getName(): String = js.native
  /**
    * Logs a message at the {@link Level.INFO} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def info(loggable: String): Unit = js.native
  def info(loggable: js.Function): Unit = js.native
  /**
    * @param {!Level} level the level to check.
    * @return {boolean} whether messages recorded at the given level are loggable
    *     by this instance.
    */
  def isLoggable(level: Level): Boolean = js.native
  /**
    * Logs a message at the given level. The message may be defined as a string
    * or as a function that will return the message. If a function is provided,
    * it will only be invoked if this logger's
    * {@linkplain #getEffectiveLevel() effective log level} includes the given
    * `level`.
    *
    * @param {!Level} level the level at which to log the message.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def log(level: Level, loggable: String): Unit = js.native
  def log(level: Level, loggable: js.Function): Unit = js.native
  /**
    * Removes a handler from this logger.
    *
    * @param {function(!Entry)} handler the handler to remove.
    * @return {boolean} whether a handler was successfully removed.
    */
  def removeHandler(handler: js.Any): Unit = js.native
  /**
    * @param {Level} level the new level for this logger, or `null` if the logger
    *     should inherit its level from its parent logger.
    */
  def setLevel(level: Level): Unit = js.native
  /**
    * Logs a message at the {@link Level.SEVERE} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def severe(loggable: String): Unit = js.native
  def severe(loggable: js.Function): Unit = js.native
  /**
    * Logs a message at the {@link Level.WARNING} log level.
    * @param {(string|function(): string)} loggable the message to log, or a
    *     function that will return the message.
    */
  def warning(loggable: String): Unit = js.native
  def warning(loggable: js.Function): Unit = js.native
}

