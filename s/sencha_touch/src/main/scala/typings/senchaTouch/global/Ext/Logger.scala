package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Logger")
@js.native
open class Logger ()
  extends StObject
     with typings.senchaTouch.Ext.Logger
/* static members */
object Logger {
  
  @JSGlobal("Ext.Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Convenience method for log with priority deprecate */
  inline def deprecate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")().asInstanceOf[Unit]
  
  /** [Method] Convenience method for log with priority error */
  inline def error(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Unit]
  
  /** [Method] Convenience method for log with priority info */
  inline def info(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[Unit]
  
  /** [Method] Logs a message to help with debugging
    * @param message String Message to log.
    * @param priority Number Priority of the log message.
    * @returns Ext.Logger this
    */
  inline def log(): ILogger = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[ILogger]
  inline def log(message: java.lang.String): ILogger = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[ILogger]
  inline def log(message: java.lang.String, priority: Double): ILogger = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[ILogger]
  inline def log(message: Unit, priority: Double): ILogger = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[ILogger]
  
  /** [Method] Convenience method for log with priority verbose */
  inline def verbose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")().asInstanceOf[Unit]
  
  /** [Method] Convenience method for log with priority warn */
  inline def warn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")().asInstanceOf[Unit]
}
