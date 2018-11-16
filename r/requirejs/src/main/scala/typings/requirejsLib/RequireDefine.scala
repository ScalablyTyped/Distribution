package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireDefine extends js.Object {
  /**
  	* Used to allow a clear indicator that a global define function (as needed for script src browser loading) conforms
  	* to the AMD API, any global define function SHOULD have a property called "amd" whose value is an object.
  	* This helps avoid conflict with any other existing JavaScript code that could have defined a define() function
  	* that does not conform to the AMD API.
  	* define.amd.jQuery is specific to jQuery and indicates that the loader is able to account for multiple version
  	* of jQuery being loaded simultaneously.
  	*/
  var amd: js.Object = js.native
  /**
  	* Define Simple Name/Value Pairs
  	* @param config Dictionary of Named/Value pairs for the config.
  	**/
  def apply(config: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
  	* Define function with dependencies.
  	* @param deps List of dependencies module IDs.
  	* @param ready Callback function when the dependencies are loaded.
  	*	callback param deps module dependencies
  	*	callback return module definition
  	**/
  def apply(deps: js.Array[java.lang.String], ready: js.Function): scala.Unit = js.native
  /**
  	* Define function.
  	* @param func: The function module.
  	**/
  def apply(func: js.Function0[_]): scala.Unit = js.native
  /**
  	* Define a module with a name and dependencies.
  	* @param name The name of the module.
  	* @param deps List of dependencies module IDs.
  	* @param ready Callback function when the dependencies are loaded.
  	*	callback deps module dependencies
  	*	callback return module definition
  	**/
  def apply(name: java.lang.String, deps: js.Array[java.lang.String], ready: js.Function): scala.Unit = js.native
  /**
  	* Define a module with a name.
  	* @param name The name of the module.
  	* @param ready Callback function when the dependencies are loaded.
  	*	callback return module definition
  	**/
  def apply(name: java.lang.String, ready: js.Function): scala.Unit = js.native
  /**
  	*  Define module with simplified CommonJS wrapper.
  	* @param ready
  	*	callback require requirejs instance
  	*	callback exports exports object
  	*	callback module module
  	*	callback return module definition
  	**/
  def apply(
    ready: js.Function3[
      /* require */ Require, 
      /* exports */ ScalablyTyped.runtime.StringDictionary[js.Any], 
      /* module */ RequireModule, 
      _
    ]
  ): scala.Unit = js.native
}

