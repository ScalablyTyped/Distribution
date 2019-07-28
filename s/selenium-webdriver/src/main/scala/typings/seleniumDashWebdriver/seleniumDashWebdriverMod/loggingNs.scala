package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.IEntryJSON
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.IType
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Level
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "logging")
@js.native
object loggingNs extends js.Object {
  /**
    * A single log entry.
    */
  @js.native
  class Entry protected () extends js.Object {
    def this(level: String, message: String) = this()
    def this(level: Double, message: String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(level: Level, message: String, opt_timestamp: Double) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Level, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Level, message: String, opt_timestamp: Double, opt_type: IType) = this()
    /** @type {!logging.Level} */
    var level: Level = js.native
    /** @type {string} */
    var message: String = js.native
    /** @type {number} */
    var timestamp: Double = js.native
    /** @type {string} */
    var `type`: String = js.native
    /**
      * @return {{level: string, message: string, timestamp: number,
      *           type: string}} The JSON representation of this entry.
      */
    def toJSON(): IEntryJSON = js.native
  }
  
  trait IEntryJSON extends js.Object {
    var level: String
    var message: String
    var timestamp: Double
    var `type`: String
  }
  
  trait IType extends js.Object {
    /** Logs originating from the browser. */
    var BROWSER: String
    /** Logs from a WebDriver client. */
    var CLIENT: String
    /** Logs from a WebDriver implementation. */
    var DRIVER: String
    /** Logs related to performance. */
    var PERFORMANCE: String
    /** Logs from the remote server. */
    var SERVER: String
  }
  
  /**
    * Defines a message level that may be used to control logging output.
    *
    * @final
    */
  @js.native
  class Level protected () extends js.Object {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
    /** This logger's name. */
    var name: String = js.native
    var name_ : String = js.native
    /** The numeric log level. */
    var value: Double = js.native
    var value_ : Double = js.native
  }
  
  /**
    * Maintains a collection of loggers.
    *
    * @final
    */
  @js.native
  class LogManager () extends js.Object {
    /**
      * Creates a new logger.
      *
      * @param {string} name the logger's name.
      * @param {!Logger} parent the logger's parent.
      * @return {!Logger} the new logger.
      * @private
      */
    def createLogger_(name: String, parent: Logger): Logger = js.native
    /**
      * Retrieves a named logger, creating it in the process. This function will
      * implicitly create the requested logger, and any of its parents, if they
      * do not yet exist.
      *
      * @param {string} name the logger's name.
      * @return {!Logger} the requested logger.
      */
    def getLogger(): Logger = js.native
    def getLogger(name: String): Logger = js.native
  }
  
  /**
    * An object used to log debugging messages. Loggers use a hierarchical,
    * dot-separated naming scheme. For instance, 'foo' is considered the parent of
    * the 'foo.bar' and an ancestor of 'foo.bar.baz'.
    *
    * Each logger may be assigned a {@linkplain #setLevel log level}, which
    * controls which level of messages will be reported to the
    * {@linkplain #addHandler handlers} attached to this instance. If a log level
    * is not explicitly set on a logger, it will inherit its parent.
    *
    * This class should never be directly instantiated. Instead, users should
    * obtain logger references using the {@linkplain ./logging.getLogger()
    * getLogger()} function.
    *
    * @final
    */
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
  
  /**
    * A hash describing log preferences.
    * @typedef {Object.<logging.Type, logging.LevelName>}
    */
  @js.native
  class Preferences () extends js.Object {
    def setLevel(`type`: String, level: String): Unit = js.native
    def setLevel(`type`: String, level: Double): Unit = js.native
    def setLevel(`type`: String, level: Level): Unit = js.native
    def toJSON(): StringDictionary[String] = js.native
  }
  
  /**
    * Common log types.
    * @enum {string}
    */
  val Type: IType = js.native
  /**
    * Adds the console handler to the given logger. The console handler will log
    * all messages using the JavaScript Console API.
    *
    * @param {Logger=} opt_logger The logger to add the handler to; defaults
    *     to the root logger.
    */
  def addConsoleHandler(): Unit = js.native
  def addConsoleHandler(opt_logger: Logger): Unit = js.native
  /**
    * Converts a level name or value to a {@link logging.Level} value.
    * If the name/value is not recognized, {@link logging.Level.ALL}
    * will be returned.
    * @param {(number|string)} nameOrValue The log level name, or value, to
    *     convert .
    * @return {!logging.Level} The converted level.
    */
  def getLevel(nameOrValue: String): Level = js.native
  def getLevel(nameOrValue: Double): Level = js.native
  /**
    * Retrieves a named logger, creating it in the process. This function will
    * implicitly create the requested logger, and any of its parents, if they
    * do not yet exist.
    *
    * @param {string} name the logger's name.
    * @return {!Logger} the requested logger.
    */
  def getLogger(): Logger = js.native
  def getLogger(name: String): Logger = js.native
  /**
    * Removes the console log handler from the given logger.
    *
    * @param {Logger=} opt_logger The logger to remove the handler from; defaults
    *     to the root logger.
    * @see exports.addConsoleHandler
    */
  def removeConsoleHandler(): Unit = js.native
  def removeConsoleHandler(opt_logger: Logger): Unit = js.native
  /* static members */
  @js.native
  object Level extends js.Object {
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    var ALL: Level = js.native
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    var DEBUG: Level = js.native
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    var FINE: Level = js.native
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    var FINER: Level = js.native
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    var FINEST: Level = js.native
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    var INFO: Level = js.native
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    var OFF: Level = js.native
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    var SEVERE: Level = js.native
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    var WARNING: Level = js.native
  }
  
}

