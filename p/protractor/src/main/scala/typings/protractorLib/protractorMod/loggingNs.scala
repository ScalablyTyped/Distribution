package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "logging")
@js.native
object loggingNs extends js.Object {
  /**
    * A single log entry.
    */
  @js.native
  class Entry protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry {
    def this(level: java.lang.String, message: java.lang.String) = this()
    def this(level: scala.Double, message: java.lang.String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level, message: java.lang.String) = this()
    def this(level: java.lang.String, message: java.lang.String, opt_timestamp: scala.Double) = this()
    def this(level: scala.Double, message: java.lang.String, opt_timestamp: scala.Double) = this()
    def this(level: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level, message: java.lang.String, opt_timestamp: scala.Double) = this()
    def this(level: java.lang.String, message: java.lang.String, opt_timestamp: scala.Double, opt_type: java.lang.String) = this()
    def this(level: java.lang.String, message: java.lang.String, opt_timestamp: scala.Double, opt_type: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.IType) = this()
    def this(level: scala.Double, message: java.lang.String, opt_timestamp: scala.Double, opt_type: java.lang.String) = this()
    def this(level: scala.Double, message: java.lang.String, opt_timestamp: scala.Double, opt_type: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.IType) = this()
    def this(level: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level, message: java.lang.String, opt_timestamp: scala.Double, opt_type: java.lang.String) = this()
    def this(level: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level, message: java.lang.String, opt_timestamp: scala.Double, opt_type: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.IType) = this()
  }
  
  /**
    * Defines a message level that may be used to control logging output.
    *
    * @final
    */
  @js.native
  class Level protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: java.lang.String, level: scala.Double) = this()
  }
  
  /**
    * Maintains a collection of loggers.
    *
    * @final
    */
  @js.native
  class LogManager ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.LogManager
  
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
  class Logger protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, opt_level: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level) = this()
  }
  
  /**
    * A hash describing log preferences.
    * @typedef {Object.<logging.Type, logging.LevelName>}
    */
  @js.native
  class Preferences ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences
  
  /**
    * Common log types.
    * @enum {string}
    */
  val Type: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.IType = js.native
  /**
    * Adds the console handler to the given logger. The console handler will log
    * all messages using the JavaScript Console API.
    *
    * @param {Logger=} opt_logger The logger to add the handler to; defaults
    *     to the root logger.
    */
  def addConsoleHandler(): scala.Unit = js.native
  def addConsoleHandler(opt_logger: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger): scala.Unit = js.native
  /**
    * Converts a level name or value to a {@link logging.Level} value.
    * If the name/value is not recognized, {@link logging.Level.ALL}
    * will be returned.
    * @param {(number|string)} nameOrValue The log level name, or value, to
    *     convert .
    * @return {!logging.Level} The converted level.
    */
  def getLevel(nameOrValue: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
  def getLevel(nameOrValue: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
  /**
    * Retrieves a named logger, creating it in the process. This function will
    * implicitly create the requested logger, and any of its parents, if they
    * do not yet exist.
    *
    * @param {string} name the logger's name.
    * @return {!Logger} the requested logger.
    */
  def getLogger(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger = js.native
  def getLogger(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger = js.native
  /**
    * Removes the console log handler from the given logger.
    *
    * @param {Logger=} opt_logger The logger to remove the handler from; defaults
    *     to the root logger.
    * @see exports.addConsoleHandler
    */
  def removeConsoleHandler(): scala.Unit = js.native
  def removeConsoleHandler(opt_logger: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger): scala.Unit = js.native
  /* static members */
  @js.native
  object Level extends js.Object {
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    var ALL: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    var DEBUG: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    var FINE: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    var FINER: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    var FINEST: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    var INFO: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    var OFF: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    var SEVERE: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    var WARNING: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
  }
  
}

