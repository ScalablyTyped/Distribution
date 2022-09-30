package typings.sphereEngineBrowser.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions that are useful for debugging. All functions in this namespace are no-ops
  * (i.e. they do nothing) when running in production, avoiding the need to remove them from code.
  */
object SSj {
  
  @JSGlobal("SSj")
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(check: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(check: js.Function0[Boolean], summary: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], summary.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Verify that an expression or runtime check evaluates to `true`, throwing an error if the
    * verification fails.
    * @param check   Either a Boolean expression or a function that returns a Boolean.
    * @param summary Human-readable summary of what's being checked. Keep it short and sweet.
    */
  inline def assert(check: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def assert(check: Boolean, summary: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(check.asInstanceOf[js.Any], summary.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Log a JavaScript value or object to the console. A log line will also be displayed in SSj
    * while debugging.
    * @param message A message, object or other value to be logged.
    */
  inline def log(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Get the amount of time that's passed since some arbitrary time, in seconds. The exact
    * precision isn't specified but will typically be less than a microsecond.
    */
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /**
    * Add a method to be profiled (timed for performance) when SpheRun is started in Profile mode.
    * @param object       Any object containing methods. For `class`, methods are typically defined
    *                     on the class prototype, e.g. `MyClass.prototype`.
    * @param methodName   The name of the method to profile.
    * @param description  Optional description shown in the profiler results. Omit this argument
    *                     to have SpheRun use the name of the method as the description.
    */
  inline def profile(`object`: js.Object, methodName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def profile(`object`: js.Object, methodName: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(`object`.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Log a line of text to the debugger. The line is only shown when SSj is started in Trace mode.
    * @param message A message to be logged.
    */
  inline def trace(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
