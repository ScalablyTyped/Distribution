package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a Unified Logging Service (ULS) that monitors log messages. */
@JSGlobal("SP.ULS")
@js.native
open class ULS ()
  extends StObject
     with typings.sharepoint.SP.ULS
object ULS {
  
  @JSGlobal("SP.ULS")
  @js.native
  val ^ : js.Any = js.native
  
  /** Decreases the indentation for subsequent log messages. */
  /* static member */
  inline def decreaseIndent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decreaseIndent")().asInstanceOf[Unit]
  
  /** Gets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  /* static member */
  inline def getEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("get_enabled")().asInstanceOf[Boolean]
  
  /** Increases the indentation for subsequent log messages. */
  /* static member */
  inline def increaseIndent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("increaseIndent")().asInstanceOf[Unit]
  
  /** Logs the specified debug message.
    This method logs the message with a time stamp. If any log messages are pending, this method also logs them. If the message cannot be logged, the message is added to the list of pending log messages. */
  /* static member */
  inline def log(debugMessage: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(debugMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Sets a value that indicates whether the Unified Logging Service (ULS) is enabled. */
  /* static member */
  inline def setEnabled(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Traces when the function was entered. */
  /* static member */
  inline def traceApiEnter(functionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("traceApiEnter")(functionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def traceApiEnter(functionName: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traceApiEnter")(functionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Traces when the function has finished. */
  /* static member */
  inline def traceApiLeave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("traceApiLeave")().asInstanceOf[Unit]
}
