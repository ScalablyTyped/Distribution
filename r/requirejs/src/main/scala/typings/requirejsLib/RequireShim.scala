package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequireShim extends js.Object {
  /**
  	* List of dependencies.
  	**/
  var deps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	* Name the module will be exported as.
  	**/
  var exports: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Initialize function with all dependcies passed in,
  	* if the function returns a value then that value is used
  	* as the module export value instead of the object
  	* found via the 'exports' string.
  	* @param dependencies
  	* @return
  	**/
  var init: js.UndefOr[js.Function1[/* repeated */js.Any, _]] = js.undefined
}

