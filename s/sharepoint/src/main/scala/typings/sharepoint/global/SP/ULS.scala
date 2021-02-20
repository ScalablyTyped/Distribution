package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a Unified Logging Service (ULS) that monitors log messages. */
@JSGlobal("SP.ULS")
@js.native
class ULS ()
  extends typings.sharepoint.SP.ULS
object ULS {
  
  /** Decreases the indentation for subsequent log messages. */
  /* static member */
  @JSGlobal("SP.ULS.decreaseIndent")
  @js.native
  def decreaseIndent(): Unit = js.native
  
  /** Gets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  /* static member */
  @JSGlobal("SP.ULS.get_enabled")
  @js.native
  def getEnabled(): Boolean = js.native
  
  /** Increases the indentation for subsequent log messages. */
  /* static member */
  @JSGlobal("SP.ULS.increaseIndent")
  @js.native
  def increaseIndent(): Unit = js.native
  
  /** Logs the specified debug message.
    This method logs the message with a time stamp. If any log messages are pending, this method also logs them. If the message cannot be logged, the message is added to the list of pending log messages. */
  /* static member */
  @JSGlobal("SP.ULS.log")
  @js.native
  def log(debugMessage: String): Unit = js.native
  
  /** Sets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  /* static member */
  @JSGlobal("SP.ULS.set_enabled")
  @js.native
  def setEnabled(value: Boolean): Unit = js.native
  
  /** Traces when the function was entered. */
  /* static member */
  @JSGlobal("SP.ULS.traceApiEnter")
  @js.native
  def traceApiEnter(functionName: String): Unit = js.native
  @JSGlobal("SP.ULS.traceApiEnter")
  @js.native
  def traceApiEnter(functionName: String, args: js.Array[_]): Unit = js.native
  
  /** Traces when the function has finished. */
  /* static member */
  @JSGlobal("SP.ULS.traceApiLeave")
  @js.native
  def traceApiLeave(): Unit = js.native
}
