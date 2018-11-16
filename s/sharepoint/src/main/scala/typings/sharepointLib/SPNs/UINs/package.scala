package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UINs {
  /** Callback which processes dialog result value after dialog is closed */
  type DialogReturnValueCallback = js.Function2[/* dialogResult */ DialogResult, /* returnValue */ js.Any, scala.Unit]
}
