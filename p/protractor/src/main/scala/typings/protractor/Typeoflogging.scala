package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.IType
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Level
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflogging extends js.Object {
  /**
    * A single log entry.
    */
  var Entry: Instantiable2[
    /* level */ Level, 
    /* message */ String, 
    typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Entry
  ] = js.native
  /**
    * Defines a message level that may be used to control logging output.
    *
    * @final
    */
  var Level: TypeofClassLevel = js.native
  /**
    * Maintains a collection of loggers.
    *
    * @final
    */
  var LogManager: Instantiable0[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.LogManager] = js.native
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
  var Logger: Instantiable1[
    /* name */ String, 
    typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Logger
  ] = js.native
  /**
    * A hash describing log preferences.
    * @typedef {Object.<logging.Type, logging.LevelName>}
    */
  var Preferences: Instantiable0[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.loggingNs.Preferences] = js.native
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
}

