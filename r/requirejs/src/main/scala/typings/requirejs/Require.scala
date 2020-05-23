package typings.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Require extends js.Object {
  /**
    * CommonJS require call
    * @param module Module to load
    * @return The loaded module
    */
  def apply(module: String): js.Any = js.native
  /**
    * Start the main app logic.
    * Callback is optional.
    * Can alternatively use deps and callback.
    * @param modules Required modules to load.
    **/
  def apply(modules: js.Array[String]): Unit = js.native
  /**
    * @see Require()
    * @param ready Called when required modules are ready.
    **/
  def apply(modules: js.Array[String], ready: js.Function): Unit = js.native
  /**
    * @see http://requirejs.org/docs/api.html#errbacks
    * @param ready Called when required modules are ready.
    **/
  def apply(modules: js.Array[String], ready: js.Function, errback: js.Function): Unit = js.native
  /**
    * Configure require.js
    **/
  def config(config: RequireConfig): Require = js.native
  /**
    * Returns true if the module has already been loaded and defined.
    * @param module Module to check
    **/
  def defined(module: String): Boolean = js.native
  /**
    * On Error override
    * @param err
    **/
  def onError(err: RequireError): Unit = js.native
  def onError(err: RequireError, errback: js.Function1[/* err */ RequireError, Unit]): Unit = js.native
  /**
    * Semi-private function, overload in special instance of undef()
    **/
  def onResourceLoad(context: js.Object, map: RequireMap, depArray: js.Array[RequireMap]): Unit = js.native
  /**
    * Returns true if the module has already been requested or is in the process of loading and should be available at some point.
    * @param module Module to check
    **/
  def specified(module: String): Boolean = js.native
  /**
    * Generate URLs from require module
    * @param module Module to URL
    * @return URL string
    **/
  def toUrl(module: String): String = js.native
  /**
    * Undefine a module
    * @param module Module to undefine.
    **/
  def undef(module: String): Unit = js.native
}

