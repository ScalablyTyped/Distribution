package typings
package requirejsLib

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
  def apply(module: java.lang.String): js.Any = js.native
  /**
  	* Start the main app logic.
  	* Callback is optional.
  	* Can alternatively use deps and callback.
  	* @param modules Required modules to load.
  	**/
  def apply(modules: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  	* @see Require()
  	* @param ready Called when required modules are ready.
  	**/
  def apply(modules: js.Array[java.lang.String], ready: js.Function): scala.Unit = js.native
  /**
  	* @see http://requirejs.org/docs/api.html#errbacks
  	* @param ready Called when required modules are ready.
  	**/
  def apply(modules: js.Array[java.lang.String], ready: js.Function, errback: js.Function): scala.Unit = js.native
  /**
  	* Configure require.js
  	**/
  def config(config: RequireConfig): Require = js.native
  /**
  	* Returns true if the module has already been loaded and defined.
  	* @param module Module to check
  	**/
  def defined(module: java.lang.String): scala.Boolean = js.native
  /**
  	* On Error override
  	* @param err
  	**/
  def onError(err: RequireError): scala.Unit = js.native
  def onError(err: RequireError, errback: js.Function1[/* err */ RequireError, scala.Unit]): scala.Unit = js.native
  /**
  	* Semi-private function, overload in special instance of undef()
  	**/
  def onResourceLoad(context: js.Object, map: RequireMap, depArray: js.Array[RequireMap]): scala.Unit = js.native
  /**
  	* Returns true if the module has already been requested or is in the process of loading and should be available at some point.
  	* @param module Module to check
  	**/
  def specified(module: java.lang.String): scala.Boolean = js.native
  /**
  	* Generate URLs from require module
  	* @param module Module to URL
  	* @return URL string
  	**/
  def toUrl(module: java.lang.String): java.lang.String = js.native
  /**
  	* Undefine a module
  	* @param module Module to undefine.
  	**/
  def undef(module: java.lang.String): scala.Unit = js.native
}

