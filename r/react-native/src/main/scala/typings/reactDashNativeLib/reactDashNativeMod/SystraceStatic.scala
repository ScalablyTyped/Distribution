package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystraceStatic extends js.Object {
  /**
       * Relay profiles use await calls, so likely occur out of current stack frame
       * therefore async variant of profiling is used
       **/
  def attachToRelayProfiler(relayProfiler: RelayProfiler): scala.Unit = js.native
  /**
       * beginAsyncEvent/endAsyncEvent for starting and then ending a profile where the end can either
       * occur on another thread or out of the current stack frame, eg await
       * the returned cookie variable should be used as input into the endAsyncEvent call to end the profile
       **/
  def beginAsyncEvent(): js.Any = js.native
  /**
       * beginAsyncEvent/endAsyncEvent for starting and then ending a profile where the end can either
       * occur on another thread or out of the current stack frame, eg await
       * the returned cookie variable should be used as input into the endAsyncEvent call to end the profile
       **/
  def beginAsyncEvent(profileName: js.Any): js.Any = js.native
  /**
       * beginEvent/endEvent for starting and then ending a profile within the same call stack frame
       **/
  def beginEvent(): scala.Unit = js.native
  /**
       * beginEvent/endEvent for starting and then ending a profile within the same call stack frame
       **/
  def beginEvent(profileName: js.Any): scala.Unit = js.native
  /**
       * beginEvent/endEvent for starting and then ending a profile within the same call stack frame
       **/
  def beginEvent(profileName: js.Any, args: js.Any): scala.Unit = js.native
  /**
       * counterEvent registers the value to the profileName on the systrace timeline
       **/
  def counterEvent(): scala.Unit = js.native
  /**
       * counterEvent registers the value to the profileName on the systrace timeline
       **/
  def counterEvent(profileName: js.Any): scala.Unit = js.native
  /**
       * counterEvent registers the value to the profileName on the systrace timeline
       **/
  def counterEvent(profileName: js.Any, value: js.Any): scala.Unit = js.native
  def endAsyncEvent(): scala.Unit = js.native
  def endAsyncEvent(profileName: js.Any): scala.Unit = js.native
  def endAsyncEvent(profileName: js.Any, cookie: js.Any): scala.Unit = js.native
  def endEvent(): scala.Unit = js.native
  /**
       * Returns an profiled version of the input function. For example, you can:
       * JSON.parse = Systrace.measure('JSON', 'parse', JSON.parse);
       *
       * @return replacement function
       */
  def measure[T /* <: js.Function */](objName: java.lang.String, fnName: java.lang.String, func: T): T = js.native
  /**
       * Measures multiple methods of a class. For example, you can do:
       * Systrace.measureMethods(JSON, 'JSON', ['parse', 'stringify']);
       *
       * @param methodNames Map from method names to method display names.
       */
  def measureMethods(`object`: js.Any, objectName: java.lang.String, methodNames: js.Array[java.lang.String]): scala.Unit = js.native
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /* This is not called by default due to perf overhead but it's useful
          if you want to find traces which spend too much time in JSON. */
  def swizzleJSON(): scala.Unit = js.native
}

