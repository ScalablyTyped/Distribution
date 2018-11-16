package typings
package screepsDashProfilerLib.screepsDashProfilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreepsProfilerStatic extends js.Object {
  /**
       * This line monkey patches the global prototypes. Should be called before and outside your main loop.
       */
  def enable(): scala.Unit = js.native
  /**
       * Register a class to be profiled. Each of the functions on this class will be replaced with
       * a profiler wrapper
       * @param  clazz constructor
       * @param className - The name of the class, a label used in output
       */
  // tslint:disable-next-line ban-types
  def registerClass(constructor: js.Function, className: java.lang.String): scala.Unit = js.native
  /**
       * Wraps a function for profiling, returns the wrapped function.
       *
       * Be sure to reassign the function, we can't alter functions that are passed.
       *
       * The second param is optional if you pass a named function function x() {}, but required if
       * you pass an anonymous function var x = function(){}.
       *
       * @param [fnName] - Name of the function, used as a label in output
       * @return the original function wrapped for profiling
       */
  // tslint:disable-next-line ban-types
  def registerFN(fn: js.Function): js.Function = js.native
  /**
       * Wraps a function for profiling, returns the wrapped function.
       *
       * Be sure to reassign the function, we can't alter functions that are passed.
       *
       * The second param is optional if you pass a named function function x() {}, but required if
       * you pass an anonymous function var x = function(){}.
       *
       * @param [fnName] - Name of the function, used as a label in output
       * @return the original function wrapped for profiling
       */
  // tslint:disable-next-line ban-types
  def registerFN(fn: js.Function, fnName: java.lang.String): js.Function = js.native
  /**
       * Each of the functions on this object will be replaced with a profiler wrapper.
       * @param objectName - Name of the object, a label used in output
       */
  def registerObject(`object`: js.Any, objectName: java.lang.String): scala.Unit = js.native
  /**
       * Wrap your main loop with this function.
       *
       * @param callback - your main loop function
       */
  // tslint:disable-next-line ban-types
  def wrap(callback: js.Function): js.Function = js.native
}

