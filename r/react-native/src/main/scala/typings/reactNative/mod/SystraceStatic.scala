package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystraceStatic extends js.Object {
  /**
    * Relay profiles use await calls, so likely occur out of current stack frame
    * therefore async variant of profiling is used
    **/
  def attachToRelayProfiler(relayProfiler: RelayProfiler): Unit = js.native
  /**
    * beginAsyncEvent/endAsyncEvent for starting and then ending a profile where the end can either
    * occur on another thread or out of the current stack frame, eg await
    * the returned cookie variable should be used as input into the endAsyncEvent call to end the profile
    **/
  def beginAsyncEvent(): js.Any = js.native
  def beginAsyncEvent(profileName: js.Any): js.Any = js.native
  /**
    * beginEvent/endEvent for starting and then ending a profile within the same call stack frame
    **/
  def beginEvent(): Unit = js.native
  def beginEvent(profileName: js.UndefOr[scala.Nothing], args: js.Any): Unit = js.native
  def beginEvent(profileName: js.Any): Unit = js.native
  def beginEvent(profileName: js.Any, args: js.Any): Unit = js.native
  /**
    * counterEvent registers the value to the profileName on the systrace timeline
    **/
  def counterEvent(): Unit = js.native
  def counterEvent(profileName: js.UndefOr[scala.Nothing], value: js.Any): Unit = js.native
  def counterEvent(profileName: js.Any): Unit = js.native
  def counterEvent(profileName: js.Any, value: js.Any): Unit = js.native
  def endAsyncEvent(): Unit = js.native
  def endAsyncEvent(profileName: js.UndefOr[scala.Nothing], cookie: js.Any): Unit = js.native
  def endAsyncEvent(profileName: js.Any): Unit = js.native
  def endAsyncEvent(profileName: js.Any, cookie: js.Any): Unit = js.native
  def endEvent(): Unit = js.native
  /**
    * Returns an profiled version of the input function. For example, you can:
    * JSON.parse = Systrace.measure('JSON', 'parse', JSON.parse);
    *
    * @return replacement function
    */
  def measure[T /* <: js.Function */](objName: String, fnName: String, func: T): T = js.native
  /**
    * Measures multiple methods of a class. For example, you can do:
    * Systrace.measureMethods(JSON, 'JSON', ['parse', 'stringify']);
    *
    * @param methodNames Map from method names to method display names.
    */
  def measureMethods(`object`: js.Any, objectName: String, methodNames: js.Array[String]): Unit = js.native
  def setEnabled(enabled: Boolean): Unit = js.native
  /* This is not called by default due to perf overhead but it's useful
    if you want to find traces which spend too much time in JSON. */
  def swizzleJSON(): Unit = js.native
}

