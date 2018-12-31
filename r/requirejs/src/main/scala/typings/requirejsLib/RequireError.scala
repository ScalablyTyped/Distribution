package typings
package requirejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireError
  extends stdLib.Error {
  /**
  	* The original error, if there is one (might be null).
  	**/
  var originalError: stdLib.Error
  /**
  	* Required modules.
  	**/
  var requireModules: js.Array[java.lang.String] | scala.Null
  /**
  	* The error ID that maps to an ID on a web page.
  	**/
  var requireType: java.lang.String
}

