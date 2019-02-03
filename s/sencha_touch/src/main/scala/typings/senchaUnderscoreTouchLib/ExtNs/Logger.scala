package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Logger")
@js.native
class Logger () extends js.Object

/* static members */
@JSGlobal("Ext.Logger")
@js.native
object Logger extends js.Object {
  /** [Method] Convenience method for log with priority deprecate */
  def deprecate(): scala.Unit = js.native
  /** [Method] Convenience method for log with priority error */
  def error(): scala.Unit = js.native
  /** [Method] Convenience method for log with priority info */
  def info(): scala.Unit = js.native
  /** [Method] Logs a message to help with debugging
  		* @param message String Message to log.
  		* @param priority Number Priority of the log message.
  		* @returns Ext.Logger this
  		*/
  def log(): senchaUnderscoreTouchLib.ExtNs.ILogger = js.native
  def log(message: java.lang.String): senchaUnderscoreTouchLib.ExtNs.ILogger = js.native
  def log(message: java.lang.String, priority: scala.Double): senchaUnderscoreTouchLib.ExtNs.ILogger = js.native
  /** [Method] Convenience method for log with priority verbose */
  def verbose(): scala.Unit = js.native
  /** [Method] Convenience method for log with priority warn */
  def warn(): scala.Unit = js.native
}

