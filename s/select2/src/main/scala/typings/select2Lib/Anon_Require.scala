package typings
package select2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Require extends js.Object {
  @JSName("require")
  var require_Original: requirejsLib.Require = js.native
  /**
  	* CommonJS require call
  	* @param module Module to load
  	* @return The loaded module
  	*/
  def require(module: java.lang.String): js.Any = js.native
  /**
  	* Start the main app logic.
  	* Callback is optional.
  	* Can alternatively use deps and callback.
  	* @param modules Required modules to load.
  	**/
  def require(modules: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  	* @see Require()
  	* @param ready Called when required modules are ready.
  	**/
  def require(modules: js.Array[java.lang.String], ready: js.Function): scala.Unit = js.native
  /**
  	* @see http://requirejs.org/docs/api.html#errbacks
  	* @param ready Called when required modules are ready.
  	**/
  def require(modules: js.Array[java.lang.String], ready: js.Function, errback: js.Function): scala.Unit = js.native
}

