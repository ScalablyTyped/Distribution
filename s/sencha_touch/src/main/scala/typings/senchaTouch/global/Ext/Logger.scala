package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Logger")
@js.native
class Logger ()
  extends typings.senchaTouch.Ext.Logger
/* static members */
object Logger {
  
  /** [Method] Convenience method for log with priority deprecate */
  @JSGlobal("Ext.Logger.deprecate")
  @js.native
  def deprecate(): Unit = js.native
  
  /** [Method] Convenience method for log with priority error */
  @JSGlobal("Ext.Logger.error")
  @js.native
  def error(): Unit = js.native
  
  /** [Method] Convenience method for log with priority info */
  @JSGlobal("Ext.Logger.info")
  @js.native
  def info(): Unit = js.native
  
  /** [Method] Logs a message to help with debugging
    * @param message String Message to log.
    * @param priority Number Priority of the log message.
    * @returns Ext.Logger this
    */
  @JSGlobal("Ext.Logger.log")
  @js.native
  def log(): ILogger = js.native
  @JSGlobal("Ext.Logger.log")
  @js.native
  def log(message: js.UndefOr[scala.Nothing], priority: Double): ILogger = js.native
  @JSGlobal("Ext.Logger.log")
  @js.native
  def log(message: java.lang.String): ILogger = js.native
  @JSGlobal("Ext.Logger.log")
  @js.native
  def log(message: java.lang.String, priority: Double): ILogger = js.native
  
  /** [Method] Convenience method for log with priority verbose */
  @JSGlobal("Ext.Logger.verbose")
  @js.native
  def verbose(): Unit = js.native
  
  /** [Method] Convenience method for log with priority warn */
  @JSGlobal("Ext.Logger.warn")
  @js.native
  def warn(): Unit = js.native
}
