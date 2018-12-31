package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunErrorObject extends js.Object {
  var className: java.lang.String
  var innerError: js.UndefOr[RaygunErrorObject] = js.undefined
  var message: java.lang.String
  var stackTrace: js.Array[StackFrame]
}

