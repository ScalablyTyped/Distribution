package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetLevel extends js.Object {
  /**
     * A single log entry.
     */
  var Entry: ScalablyTyped.runtime.Instantiable2[
    /* level */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level, 
    /* message */ java.lang.String, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Entry
  ] = js.native
  /**
     * Defines a message level that may be used to control logging output.
     *
     * @final
     */
  var Level: ScalablyTyped.runtime.Instantiable2[
    /* name */ java.lang.String, 
    /* level */ scala.Double, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level
  ] = js.native
  /**
     * Maintains a collection of loggers.
     *
     * @final
     */
  var LogManager: ScalablyTyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.LogManager] = js.native
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
  var Logger: ScalablyTyped.runtime.Instantiable1[
    /* name */ java.lang.String, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Logger
  ] = js.native
  /**
     * A hash describing log preferences.
     * @typedef {Object.<logging.Type, logging.LevelName>}
     */
  var Preferences: ScalablyTyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Preferences] = js.native
  /**
     * Common log types.
     * @enum {string}
     */
  val Type: seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.IType = js.native
  /**
     * Converts a level name or value to a {@link logging.Level} value.
     * If the name/value is not recognized, {@link logging.Level.ALL}
     * will be returned.
     * @param {(number|string)} nameOrValue The log level name, or value, to
     *     convert .
     * @return {!logging.Level} The converted level.
     */
  def getLevel(nameOrValue: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
  /**
     * Converts a level name or value to a {@link logging.Level} value.
     * If the name/value is not recognized, {@link logging.Level.ALL}
     * will be returned.
     * @param {(number|string)} nameOrValue The log level name, or value, to
     *     convert .
     * @return {!logging.Level} The converted level.
     */
  def getLevel(nameOrValue: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.loggingNs.Level = js.native
}

