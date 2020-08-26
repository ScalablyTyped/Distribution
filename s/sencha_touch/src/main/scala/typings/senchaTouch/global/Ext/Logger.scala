package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Logger")
@js.native
class Logger ()
  extends typings.senchaTouch.Ext.Logger

/* static members */
@JSGlobal("Ext.Logger")
@js.native
object Logger extends js.Object {
  /** [Method] Convenience method for log with priority deprecate */
  def deprecate(): Unit = js.native
  /** [Method] Convenience method for log with priority error */
  def error(): Unit = js.native
  /** [Method] Convenience method for log with priority info */
  def info(): Unit = js.native
  /** [Method] Logs a message to help with debugging
    * @param message String Message to log.
    * @param priority Number Priority of the log message.
    * @returns Ext.Logger this
    */
  def log(): ILogger = js.native
  def log(message: js.UndefOr[scala.Nothing], priority: Double): ILogger = js.native
  def log(message: java.lang.String): ILogger = js.native
  def log(message: java.lang.String, priority: Double): ILogger = js.native
  /** [Method] Convenience method for log with priority verbose */
  def verbose(): Unit = js.native
  /** [Method] Convenience method for log with priority warn */
  def warn(): Unit = js.native
}

