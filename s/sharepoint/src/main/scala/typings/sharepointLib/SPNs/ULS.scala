package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Unified Logging Service (ULS) that monitors log messages. */
@JSGlobal("SP.ULS")
@js.native
class ULS () extends js.Object

/** Provides a Unified Logging Service (ULS) that monitors log messages. */
@JSGlobal("SP.ULS")
@js.native
object ULS extends js.Object {
  /** Decreases the indentation for subsequent log messages. */
  def decreaseIndent(): scala.Unit = js.native
  /** Gets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  def get_enabled(): scala.Boolean = js.native
  /** Increases the indentation for subsequent log messages. */
  def increaseIndent(): scala.Unit = js.native
  /** Logs the specified debug message.
    This method logs the message with a time stamp. If any log messages are pending, this method also logs them. If the message cannot be logged, the message is added to the list of pending log messages. */
  def log(debugMessage: java.lang.String): scala.Unit = js.native
  /** Sets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  def set_enabled(value: scala.Boolean): scala.Unit = js.native
  /** Traces when the function was entered. */
  def traceApiEnter(functionName: java.lang.String): scala.Unit = js.native
  def traceApiEnter(functionName: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  /** Traces when the function has finished. */
  def traceApiLeave(): scala.Unit = js.native
}

