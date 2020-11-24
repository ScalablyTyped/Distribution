package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a Unified Logging Service (ULS) that monitors log messages. */
@JSGlobal("SP.ULS")
@js.native
class ULS ()
  extends typings.sharepoint.SP.ULS
/* static members */
@JSGlobal("SP.ULS")
@js.native
object ULS extends js.Object {
  
  /** Decreases the indentation for subsequent log messages. */
  def decreaseIndent(): Unit = js.native
  
  /** Gets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  def get_enabled(): Boolean = js.native
  
  /** Increases the indentation for subsequent log messages. */
  def increaseIndent(): Unit = js.native
  
  /** Logs the specified debug message.
    This method logs the message with a time stamp. If any log messages are pending, this method also logs them. If the message cannot be logged, the message is added to the list of pending log messages. */
  def log(debugMessage: String): Unit = js.native
  
  /** Sets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  def set_enabled(value: Boolean): Unit = js.native
  
  /** Traces when the function was entered. */
  def traceApiEnter(functionName: String): Unit = js.native
  def traceApiEnter(functionName: String, args: js.Array[_]): Unit = js.native
  
  /** Traces when the function has finished. */
  def traceApiLeave(): Unit = js.native
}
